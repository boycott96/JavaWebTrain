package com.srg.user.entity;

public class Users {
	private int id;
	private String name;
	private String password;
	private String phoneNumber;
	
	public Users() {
		super();
	}
	
	public Users(int id, String name, String password, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
