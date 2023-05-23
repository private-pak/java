package com.blibli.javase.thread;

/*
 * 	让位，当前线程暂停，回到就结绪状态，让给其它线程。
	静态方法：Thread.yield();

 */
public class ThreadText12 {

	public static void main(String[] args) {
		Thread thread01 = new Thread(new myRunable());
		thread01.setName("thread01");
		thread01.start();

		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}

}

class MyRunable6 implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i <= 1000; i++) {
			// 这个线程从 10开始 每100个让位一次
			if (i % 100 == 0) {
				Thread.yield();
			} // 当前线程暂停一下I让给主线程。

			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}

	}

}