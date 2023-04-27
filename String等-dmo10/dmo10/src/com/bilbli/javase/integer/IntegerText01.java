package com.bilbli.javase.integer;

public class IntegerText01 {
/*
 * 1、java中为8种基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是object。
2、思考：为什么要再提供8种包装类呢？
		因为8种基本数据类型不够用。
		所以SUN又提供对应的8种包装类型。I

 */
	
	public static void main(String[] args) {
		//有没有这种需求：调用doSome()方法的时候需要传一个数宇进去。
		//但是数字属于基本数据类型，而doSome（)方法参数的类型是object。
		//可见doSome（）方法无法接收基本数据类型的数字。那怎么办呢？可以传一个数字对应的包装类进去。
		//把100这个数字经过构适方法包装成对象。
		
		MyInter myinter = new MyInter(100);
		doSome(myinter);
	}
	public static void doSome(Object obj) {
		//System.out.println(obj);//com.bilbli.javase.integer.MyInter@5e91993f

		//重写toString
		System.out.println(obj);//100
	}

}
