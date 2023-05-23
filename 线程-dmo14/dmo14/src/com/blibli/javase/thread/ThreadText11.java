package com.blibli.javase.thread;

public class ThreadText11 {
/*
 * 关于 线程的优先级
 */
	public static void main(String[] args) {
		//设置主线程的优先级为1
		Thread.currentThread().setPriority(1);
		
	/*	System.out.println("最低优先级"+Thread.MIN_PRIORITY);
		System.out.println("最高优先级"+Thread.MAX_PRIORITY);
		System.out.println("默认优先级"+Thread.NORM_PRIORITY);  */
		
		//获取 当前线程对象，获取 当前线程 的优先级
		Thread currentThread = Thread.currentThread();
		//main当前线程默认优先级5
	//	System.out.println(currentThread.getName()+"当前线程默认优先级"+currentThread.getPriority());
		
		
		Thread thread01 = new Thread(new  MyRunable5());
		thread01.setPriority(10);
		thread01.setName("MyRunable5线程");
		thread01.start();
		
		//优先级较高的，只是抢到的CPU时间片相对多一些。
		//大概率方向更偏向于优先级比较高的。
		for (int i = 0; i <1000; i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}

}
class MyRunable5 implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		//System.out.println(Thread.currentThread().getName()+"当前线程默认优先级"+Thread.currentThread());
		for (int i = 0; i <1000; i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
	
}