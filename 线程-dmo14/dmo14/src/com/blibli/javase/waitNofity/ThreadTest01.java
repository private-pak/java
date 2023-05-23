package com.blibli.javase.waitNofity;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest01 {

	/*
1、使用wait方法和notify方法实现“生产者和消费者模式”
2、什么是“生产者和消费者模式”？
	生产线程负责生产，消费线程负责消费。
	生产线程和消费线程要达到均衡。
	这是一种特殊的业务需求，在这种特殊的情况下需要使用wait方法和notiy方法
3、wait和notify方法不是线程对象的方法，是普通java对象部有的方法。
4、wait方法和notify方法建立在线程同步的基础之上。因为多线程要同时操作一个仓库。有线程安全问题。
5、wait方法作用：o.wait（）让正在o对象上活动的线程t进入等待状态，并且释放t线程之前占有的对象的锁
6、notify方法作用：o.notify(）让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁。

7、模拟这样一个需求：
	仓库我们采用List集合
	List集合中假设只能存储1个元素。
	1个元素就表示仓库满了。	
	如果List集合中元素个数是0，就表示仓库空了。
	保证List集合中永远都是最多存估1个元素。
	必须做到这种效果：生产1个消费1个。！


	 */
	
	public static void main(String[] args) {
		//创建1个仓库对象 共享
		List<String> list  = new ArrayList<>();
		//创建两个线程对象
		
		//生产线程
		Thread t1 = new Thread(new Poroducer(list));
		//消费线程
		Thread t2 = new Thread(new Consumer(list));

		t1.setName("生产 线程");
		t2.setName("消费 线程");
		
		t1.start();
		t2.start();
	}

}

//生成线程
class Poroducer implements Runnable{
	//仓库
	private List list;
	
	public Poroducer(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		// 一直生产
		//一直生产（使用死循环来模拟一查生产）
		while(true) {
			synchronized (list) {	//给仓库对象List加锁。	
				
			if(list.size() > 0) {  //大于0，说明仓库中已经有1个元素了。 这里控制生产个数
				//当前线程进入等待状态，并且释放List集合的锁。
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			//程序能够执行到这里说明仓库是空的，可以生产
			Object obj = new Object();
			list.add(obj);
			System.out.println(Thread.currentThread().getName()+"--->"+obj);
			//唤醒消费
			list.notify();
		}
	}
	}
}



//消费线程

class Consumer implements Runnable{
	//仓库
	private List list;
	
	public Consumer(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		// 一直消费
		while(true) {
			synchronized (list) {
				if(list.size() == 0) { //仓库空了
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				//程序能够执行到此处说明仓库中有数据，进行消费。
				Object obj = list.remove(0);
				System.out.println(Thread.currentThread().getName()+"--->"+obj);
				list.notify();
			}
		}
		
		
	}

	
}
















