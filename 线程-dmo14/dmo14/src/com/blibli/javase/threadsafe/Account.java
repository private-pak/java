package com.blibli.javase.threadsafe;
//银行账户
public class Account {
	
	private String acton;
	private double balance;
	public Account() {
		super();
	}
	public Account(String acton, double balance) {
		super();
		this.acton = acton;
		this.balance = balance;
	}
	public String getActon() {
		return acton;
	}
	public void setActon(String acton) {
		this.acton = acton;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//取款f方法
	public void WithDraw (double money) {
		//取款之前的余额
		double before  =  this.getBalance();
		//取款之后
		double after = before-money;
		//更新 余额
		this.setBalance(after);
	}
}
