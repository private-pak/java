package com.blibli.javase.thread;

public class ThreadText14 {

	//守护线程
	
	public static void main(String[] args) {
		Thread t = new BakDataThread();
		t.setName("备份数据线程");
		
		//启动线程之前，线程设置为守护线程
		t.setDaemon(true);
		
		t.start();
		
		//主线程 主线程是用户线程
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"---->"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
class BakDataThread extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		
		int i =0;
		//即使是死循环，但由于该线程是守护者，当用户线程结束，守护线程自动终止。
		while(true) {
			System.out.println(Thread.currentThread().getName()+"---->"+(++i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}