package com.rahat.spring.model;

public class User {
	private String userName;
	private int id; //must be pass as integor

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
