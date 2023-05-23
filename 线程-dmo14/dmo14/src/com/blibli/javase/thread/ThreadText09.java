package com.blibli.javase.thread;

public class ThreadText09 {
	/*
	 * 在java中怎么强行终止一个线程的执行。
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunable3());
		thread.setName("第一个线程");
		thread.start();

		// 睡眠五秒
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		// 5秒后强制终止thread线程
		thread.stop();// (已经过时不建议使用)
	}

}

class MyRunable3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}