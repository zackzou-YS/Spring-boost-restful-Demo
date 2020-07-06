package com.gztd.rfDEMO.entity;

public class User {
	
	private int Id;
	private String Name;
	private int Age;

	public User() {

	}
	
	public User(int id, String name, int age) {
		super();
		Id = id;
		Name = name;
		Age = age;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
