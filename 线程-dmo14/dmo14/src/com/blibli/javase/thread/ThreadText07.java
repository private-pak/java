package com.blibli.javase.thread;

public class ThreadText07 {
/*
关于线程的sLeep方法：
			static void sleep(Long millis)
			1、静态方法：Thread.sLeep(1000);
			2、参数是毫秒
		作用：让当前线程进入休眠，进人“阻塞状态”，放弃占有CPU时间片，让给其它线程使用。
					这行代码出现在A线程中，A线程就会进入休眠。
					这行代码出现在B线程中，B线程就会进入休眠。

 */
	public static void main(String[] args) {
/*		//让当前线程进入睡眠 睡眠5秒
		//将 当前main方法5秒后执行
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//5秒之后执行
		System.out.println("失败");
*/
		
		
		for (int i = 0; i <20; i++) {
			System.out.println(Thread.currentThread().getName()+"----->"+i);
			
			try {
				//Thread.sleep(i,1000);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}

}
