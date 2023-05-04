package com.javase.exception;
/*
 * 异常对象有两个非常重要的方法：
 * 
		获取异常简单的描述信息：
			String msg = exception.getMessage();
			
		打印异常追踪的堆栈信息：

			exception.printstackTrace();

 */
public class ExceptionText05 {

	public static void main(String[] args) {
		//这里只是为了测/试getMessage()方法和printStackTrace()方法。
		//这里只是new了异常对象，但是没有异常对象抛出。JVM会认为这是一个普通的java对象。

		NullPointerException e =  new  NullPointerException("空指针异常");
		//获取异常简单描述信息：这个信息实际上就是构造方法上面string参数。
		String msg =  e.getMessage();//空指针异常
		System.out.println(msg);
		
		//打印异常堆栈信息
		e.printStackTrace();
		
		System.out.println("你好");

	}

}
