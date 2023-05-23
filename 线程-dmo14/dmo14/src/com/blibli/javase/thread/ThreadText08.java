package com.blibli.javase.thread;

public class ThreadText08 {
//Leep睡眠太久了，如果希望半道上醒来，你应该怎么办？也就是说怎么则醒一个正在睡眠的线程？？
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable());
		thread.setName("主线程");
		thread.start();

		//// 希望5秒之后，thread线程醒来（5秒之后主线程手里的活儿干完了。）
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// 终断thread线程的睡眠（这种终断睡眠的方式做靠了java的异常处理机制。）
		thread.interrupt();// 干扰
	}

}

class MyRunnable implements Runnable {

	// 重点：run(）当中的异常不能throws，只能trycatch
	// 因为run（）方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "--->开始");

		try {
			Thread.sleep(1000 * 60 * 60 * 24 * 365); // 睡眠一年
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
		//	e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + "--->结束");

	}

}