package com.blibli.javase.thread;

public class ThreadText03 {
/*
实现线程的第一种方式：
		编写一个类，道接继承java.Lang.Thread，重写run方法。
	
 */
	
	public static void main(String[] args) {
		//这里是main方法，这里的代码属于主线程，在主机中运行。
		//新建一个分支线程对象
		MyThread mythread  = new MyThread();
		
		//启动线程
		
	//	mythread.run();		//不会启动线程，不会分配新的分支栈。
		
		//	start()方法的作用是：启动一个分支线程，在VM中开辟一个新的空间，这段代码任务完成之后，间就结束了
		//这段代码的任务只是为了开启一个新的空间，只要新的栈空间开出来，start（）方法就结束了。线程就启动的
		//启动成功的线程会自动调用run方法，并且run方法在分支机的机底部（压机）。
		//run方法在分支的栈底部，main方法在主机的机底部。run和main是平级的。
		mythread.start();
		
		//这里的代码还是运行在住线程中 
		for (int i = 0; i <100; i++) {
			System.out.println("主线程---->"+i);
		}

	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <200; i++) {
			System.out.println("分支---->" + i);
			
		}//764
		
	}
}
