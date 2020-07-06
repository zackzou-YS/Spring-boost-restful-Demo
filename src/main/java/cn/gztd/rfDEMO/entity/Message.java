package cn.gztd.rfDEMO.entity;

public class Message {
	


	private int code;
	private String message;
	private String data;

	public Message() {

	}
	

	public Message(int code, String message, String data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}
	
	public String getdata() {
		return data;
	}

	public void setdata(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "{\"code\":" + code + ", \"message\":\"" + message + "\", \"data\":\"" + data + "\"]";
	}
}
