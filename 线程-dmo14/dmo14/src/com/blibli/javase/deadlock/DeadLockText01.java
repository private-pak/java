package com.blibli.javase.deadlock;

public class DeadLockText01 {
	/*
	 * 死锁代码要会。 一般段面试官要求你会写。 只有会写的，才会在以后的开发中注意这个事儿。 因为死锁很难调试。
	 */

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = new Object();
		
		Thread t1 = new  MyThread1(o1, o2);
		Thread t2 = new MyThread2(o1, o2);
		
		t1.start();
		t2.start();
				

	}

}

class MyThread1 extends Thread {
	Object o1;
	Object o2;

	public MyThread1(Object o1, Object o2) {
		this.o1 = o1;
		this.o2 = o2;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		synchronized (o1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			synchronized (o2) {
				
			}
		}
	}
}

class MyThread2 extends Thread {
	Object o1;
	Object o2;

	public MyThread2(Object o1, Object o2) {
		this.o1 = o1;
		this.o2 = o2;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		synchronized (o2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			synchronized (o1) {
				
			}
		}
	}

}