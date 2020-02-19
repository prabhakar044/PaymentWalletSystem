package com.capgemini.wallet.entity;

public class WalletAccount {
	
	private long accId;
	private double balance;
	private String status;
	WalletUser user = new WalletUser();
	
	public WalletAccount(long accId, double balance, String status, WalletUser user) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.status = status;
		this.user = user;
	}
	
	public WalletAccount() {
		super();
	}
	
	public long getAccId() {
		return accId;
	}
	
	public void setAccId(long accId) {
		this.accId = accId;
	}
	
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public WalletUser getUser() {
		return user;
	}
	
	public void setUser(WalletUser user) {
		this.user=user;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
