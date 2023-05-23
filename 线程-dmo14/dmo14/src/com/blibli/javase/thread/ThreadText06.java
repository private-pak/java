package com.blibli.javase.thread;

public class ThreadText06 {
/*
1、怎么获取当前线程对象？
	Thread t = Thread.currentThread();
	返回值t就是当前线程。

2、获取线程对象的名字
	String name=线程对象.getName();
	
3、修改线程对象的名字
	线程对象.setName（"线程名字");

 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//currentThread就是当前线程对象
		//这个代码出现在main方法当中，所以当前线程就是主线程。
		Thread currentThread =  Thread.currentThread();
		System.out.println(currentThread.getName()); //main
		
		
		MyThread01 mythread01 = new MyThread01();
		//设置线程名字
		mythread01.setName("第一个线程");
		
		//获取线程名字
		String  tname =  mythread01.getName();
		System.out.println(tname);  //默认 Thread-0 然后后面就是 Thread-1  Thread-2
		
		//启动线程
		mythread01.start();
		
		MyThread01  mythread02 =new MyThread01();
		mythread02.setName("第二个线程");
		
		mythread02.start();
	
		
	}

}
class MyThread01  extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			
			Thread currentThread =  Thread.currentThread();
			
			System.out.println(currentThread.getName()+"分支线程-----> "+ i);
		//	System.out.println(super.getName()+"分支线程-----> "+ i);
		//	System.out.println(this.getName()+"分支线程-----> "+ i);
			
		}
	}
}