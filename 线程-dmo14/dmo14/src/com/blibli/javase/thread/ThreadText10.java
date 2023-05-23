package com.blibli.javase.thread;

public class ThreadText10 {
//怎么合理的终止一个线程的执行。这种方式是很常用的
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyRunable4 myrunable  = new  MyRunable4();
		Thread thread02 = new Thread(myrunable);
		thread02.setName("第一个线程");
		thread02.start();
		
		//5秒
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//终止线程
		//你想要什么时候终止t的执行，那么你把标记修改为faLse，就结束了。
		myrunable.run = false;
	}

}
class MyRunable4 implements Runnable{
	//打一个Boolean标记
	boolean  run = true;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(run) {
				System.out.println(Thread.currentThread().getName() + "---" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}else {
				//终止当前线程
				return;
			}
		}
		
	}
	
	
}