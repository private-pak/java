package com.blibli.javase.thread;

public class ThreadText13 {
	/*
	 * 线程合并
	 */
	public static void main(String[] args) {
		System.out.println("mian begin");
		Thread t  = new Thread(new MyRunabele7());
		t.setName("t");
		t.start();
		
		//合并线程
		try {
			t.join();//t合并到当前线程中，当前线程受阻塞，t线程执行道到结束。
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("main over");//780
	}

}

class MyRunabele7 implements Runnable {

	@Override
	public void run() {
		for (int j = 0; j < 100; j++) {

			System.out.println(Thread.currentThread().getName() + "--->" + j);
		}
	}

}