package com.blibli.javase.thread;

public class ThreadText01 {

	/*
	 * 分析以下程序，有几个线程，除位圾回收线程之外。有几个线程？
	 * 
		1个线程。（因为程序只有1个栈。）

	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("main bgin");
		
		m1();
		
		System.out.println("main over");

	}
	
	private static void m1() {
		System.out.println("m1 bgin");
		
		m2();
		
		System.out.println("m1 over");
		
	}

	private static void m2() {
		System.out.println("m2 bgin");
		
		m3();
		
		System.out.println("m2 voer");
		
	}

	private static void m3() {
		System.out.println("extine");
		

		
	}

}
