package com.cdi.beans;

import javax.enterprise.inject.Model;

@Model
public class LoginHandler {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String processLogin() {
		System.out.println("Username: "+this.username+" \n Password:"+this.password);
		return "index";
	}
}
