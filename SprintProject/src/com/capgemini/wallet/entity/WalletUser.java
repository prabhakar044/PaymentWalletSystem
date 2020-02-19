package com.capgemini.wallet.entity;

public class WalletUser {
	
	
	private String phoneNumber;
	private String userName;
	private String password;
	public WalletUser( String phoneNumber,  String userName, String password) {
		super();		
		
		this.phoneNumber=phoneNumber;
		this.userName=userName;
		this.password=password;
	}
	
	public WalletUser() {
		super();
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
}
