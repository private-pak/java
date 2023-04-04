package com.bjpowernode.javase.text003;

/*
 *关于iava语言当中final关键字：
		1、final是一个关键字，表示最终的，不可变的。
		2、fina1修饰的类无法被继承
		3、final修饰的方法无法被费盖
		4、fina1修饰的变量一旦赋值之后，不可重新赋值
		5、final修饰的实例变量????
		6、fina1修饰的引用????？
		7.final修饰的引用蛋然指向某个对象之后不能指向其它对象，但是所指向的对象内部的内存是可以被修改的：
		8.fina1修饰的实例变量，一般和statio联合使用，被称为常量。
 */
public class FinalText {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		
		final int k = 200;
		//编译错误：无法为最终变量k分配值
		
		final int m;
		m  = 200;
		////编译错误：无法为最终变量m分配值

	}

}
