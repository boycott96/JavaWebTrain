package com.srg.user.entity;

public class Users {
	private int id;
	private String name;
	private String password;
	private String phoneNumber;
	private String head_Icon_Address;
	
	public Users() {
		super();
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

	public String getHead_Icon_Address() {
		return head_Icon_Address;
	}

	public void setHead_Icon_Address(String head_Icon_Address) {
		this.head_Icon_Address = head_Icon_Address;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", head_Icon_Address=" + head_Icon_Address + "]";
	}
	
}
