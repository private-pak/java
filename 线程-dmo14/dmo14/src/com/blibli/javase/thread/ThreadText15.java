package com.blibli.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//JUC包下的，属于java的并发包，老JDk中没有这个包。新特性

public class ThreadText15 {

	/*
	 * 	实现线程的第三种方式：
		实现calLabLe接口
				这种方式的优点：可以获取到线程的执行结果。
				这种方式的缺点：效率比较低，在获取t线程执行结果的时候，当前线程受阻塞，效率较低。

	 */
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//第一步：创建一个“未来任务类”对象。
	/*	FutureTask task = new FutureTask<>(new Callable() {
			public Object call() throws Exception{
				return null;
			}
		});
		
		*/
		
		
		FutureTask task = new FutureTask<>(new Callable() {

			//参数非常重要，需要给一个caLLabLe接口实现类对象。
			public Object call() throws Exception {//call() 方法 就是相当于run方法
				//线程执行一个任务，执行之后可能会有一个执行结果
				//模拟执行

				System.out.println("call method begin");
				Thread.sleep(1000*10);
				System.out.println("call method end");
				
				int  a = 1;
				int b = 2;
				
				
				return a+b; //自动中装箱integer
			}
		});
		
		//创建线程
		
		Thread  t = new Thread(task);
		t.start();
		
		//这里是main方法，这是在主线程中。
		//在主线程中，怎么获取t线程的返回结果？
		Object obj = task.get();
		System.out.println("线程执行结果："+obj);
		
		//main方法这里的程序要想执行必须等待get（）方法的结束
	//	而get（）方法可能需要很久。因为get（）方法是为了拿另一个线程的执行结果

		System.out.println("hello world");
		
	}
//805
}
