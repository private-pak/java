package com.blibli.javase.threadsafe2;

//银行账户
//使用线程同步机制，解决线程安全问题。
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

	// 取款f方法
	public void WithDraw(double money) {
		//以下这几行代码必须是线程排队的，不能并发。
		//一个线程把这里的代码全部执行结束之后，另一个线程才能进来。
/*
 * 线程同步机制的语法是：
 * 		synchronized(){
 * 				//线程同步代码块
 * 
 * 		}
 * 	synchronized后面小括号中传的这个“数据"是相当关键的。
	这个数据必须是多线程共享的数据。才能达到多线程排队。
	
		（）中写 什么？
			那要看你想让娜些线程同步。
			假设t1、t2、t3、t4、t5，有5个线程
			你只带望t1 t2 t3排队，t4  t5不需要排队。怎么办？
			你一定要在（）中写一个t1t2t3共享的对象。而这个
			对象对于t4 t5来说不是共享的。

		
		这里的共享对象是：账户对象。
		账户对象是共享的，那么this就是账户对象吧！！！


 * 
 */
		
		
		synchronized (this) {
			double before = this.getBalance();
			double after = before - money;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.setBalance(after);
			
		}
			
	}
}
