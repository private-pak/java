package com.blibli.javase.threadsafe3;

//银行账户
//使用线程同步机制，解决线程安全问题。
public class Account {
	 
	private String actno;
	
	private double balance;

	public Account() {
		super();
	}

	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}
	
	public  void setActno(String actno) {this.actno = actno;}
	
	public double getBalance() {return balance;}
	
	public void setBalance(double balance) {this.balance =  balance;}
	
	/*
	 * 在实例方法上可以使用synchronized吗？可以的。
			synchronized出现在实例方法上，一定锁的是this。
			没得挑。只能是this。不能是其他的对象了。
			所以这种方式不灵活。
			另外还有一个缺点：synchronized出现在实例方法上
			表示整个方法体部需要同步，可能会无故扩大同步的
			范围，导致程序的执行效率降低。

	 * 
	 */
	
	public synchronized void withdraw(double money) {
		
	//	synchronized(this) {
		double before = this.getBalance();
		double after  = before - money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		this.setBalance(after);
	}
	
	//793}
}
