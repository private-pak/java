package com.blibli.javase.threadsafe;

public class AccountThread extends  Thread{



//	public static void main(String[] args) {
//		
//
//	}
	private Account act;
	
	
	
	public AccountThread(Account act) {
		this.act =act;
	}
	
	@Override
	public void run() {
		//run方法的执行表示取款操作。
		//假设取款5000
		double money  = 5000;
		//取款
		//多线程并发执行这个方法。
		act.WithDraw(money);
		
		System.out.println(Thread.currentThread().getName()+"账户"+act.getActon()+"取款成功，余额"+act.getBalance());	
	}

}
