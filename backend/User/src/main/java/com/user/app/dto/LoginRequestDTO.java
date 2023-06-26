package com.user.app.dto;

public class LoginRequestDTO {
	
	private String userName;
	private String password;
	public LoginRequestDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequestDTO [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
