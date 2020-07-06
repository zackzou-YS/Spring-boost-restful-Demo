package com.gztd.rfDEMO.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import com.gztd.rfDEMO.entity.Notice;
import com.gztd.rfDEMO.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gztd.rfDEMO.entity.Message;

@RestController
@RequestMapping("/gztc")
public class IndexController {

	@Resource private JdbcTemplate jdbcTemplate;
	
	@PostMapping("test")
	public String getInteger(@RequestBody User user){
	return "name："+user.getName()+", age:"+user.getAge()+", id:"+user.getId();
	}

	@RequestMapping("getUser")
    public List<Map<String,Object>> getUser(){
        String sql="select * from testUser";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        return list;
    }
	
	@RequestMapping("save")
	public String save(@RequestBody User user) {
		 String sql="insert into testuser(name,age) values ('"+user.getName()+"',"+user.getAge()+")";
	     jdbcTemplate.update(sql);
		return "save successfully!";
	}
	
	@RequestMapping("getAll")
    public List<Map<String,Object>> getAll(){
        String sql="select * from gztc_tb_notice";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        return list;
    }
	
	@PostMapping("notice")
	public Message notice(@RequestBody Notice notice) {
		// 校验入参
		if (notice.getEnterprise_no() == null || notice.getEnterprise_no() == ""
			|| notice.getId() == null || notice.getId() == ""
			|| notice.getType() == null || notice.getType() == ""
			|| notice.getJob() == null || notice.getJob() == "") 
			{
			return new Message(100003, "失败","参数错误");
			}
		try {
			String sqlStr="select count(Id) from gztc_tb_notice where Id='"+notice.getId()+"'";
			int rows=jdbcTemplate.queryForObject(sqlStr,Integer.class);
			if(rows>0){

			}
			 String sql="insert into gztc_tb_notice (enterprise_no,Id,type,job) values ('"+notice.getEnterprise_no()+"','"+notice.getId()+"','"+notice.getType()+"','"+notice.getJob()+"')";
		     jdbcTemplate.update(sql);
		} catch (Exception e) {
			return new Message(900001, "失败","其他错误");
		}
		return new Message(1, "成功","调用信息接口成功");
		
	}
	
}
