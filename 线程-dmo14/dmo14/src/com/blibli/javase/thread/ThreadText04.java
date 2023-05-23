package com.blibli.javase.thread;

public class ThreadText04 {
/*
实现线程的第二种方式，编写一个类实现java.Lang.RunnabLe接口。
 */
	public static void main(String[] args) {
		// 创建一个可运行的对象
	//	myRunable runble =new myRunable();
		//将 可运行的对象封装成一个线程对象
	//	Thread thread = new Thread(runble);
		
		//启动线程
		Thread thread = new Thread(new myRunable());  //合并
		thread.start();
		for (int i = 0; i <100; i++) {
			System.out.println("主线程---->" + i);
		}

	}

}
class myRunable implements Runnable{

	@Override 
	//这并不是一个线程类，是一个可运行的类。它还不是一个线程。
	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i <100; i++) {
			System.out.println("分线程---->" + i);
		}
	}
	
}