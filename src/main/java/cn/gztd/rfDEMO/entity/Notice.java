package cn.gztd.rfDEMO.entity;

public class Notice {
	


	private String enterprise_no;
	private String Id;
	private String type;
	private String job;

	public Notice() {

	}
	
	public Notice(String enterprise_no, String id, String type, String job) {
		super();
		this.enterprise_no = enterprise_no;
		this.Id = id;
		this.type = type;
		this.job = job;
	}

	public String getEnterprise_no() {
		return enterprise_no;
	}

	public void setEnterprise_no(String enterprise_no) {
		this.enterprise_no = enterprise_no;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
