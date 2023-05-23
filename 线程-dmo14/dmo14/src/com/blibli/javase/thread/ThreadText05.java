package com.blibli.javase.thread;

public class ThreadText05 {
/*
采用匿名内部类的方式 
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread thread   =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for (int i = 0; i <100; i++) {
					System.out.println("分线程---->" + i);
				}
				
			}
		});
		
		//启动
		thread.start();
		
		for (int i = 0; i <100; i++) {
			System.out.println("主线程---->" + i);
		}
	}

}
