package com.javase.exception;

/*
 * 1、SUN提供的JDK内造的异常肯定是不够的用的。在实际的开发中，有很多业务
这些业务出现异常之后，JDK中部是没有的。和业务挂钩的。那么异常类我们
程序员可以自已定义吗？
可以。
2、JaVa中怎么自定义异常呢？
两步：
第一步：编享一个类继承Exception或者RuntimeException
第二步：提供两个构造方法，一个无参数的，一个带有string参数的。

 */
public class MyExcption extends Exception {

//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//
//	}
	
	public MyExcption  () {
		
	}
	public MyExcption(String s) {
		super(s);
	}
}
