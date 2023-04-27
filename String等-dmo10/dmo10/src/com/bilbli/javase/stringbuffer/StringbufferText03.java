package com.bilbli.javase.stringbuffer;

public class StringbufferText03 {

	public static void main(String[] args) {

/*
 * 
 * 
 * 面试题：String为什么是不可变的？
1、
			我看过源代码，String类中有一个byte[]数组，这个byte[]数组采用了final修饰
			因为数组一旦创建长度不可变。并且被inaL修饰的引用一且指向某个对象之后，不
			可再指向其它对象，所以string是不可变的！
			"abc"无法变成"abcd"
			
2、StringBuiLder/StringBuffer为什么是可变的呢？

		我看过源代码，StringBuffer/StringBuilder内部实际上是一个byte[]数组
		这个byte[】数组没有被final修饰，StringBuffer/StringBuiLder的初始化
		容量我记得应该是16，当存满之后会进行扩容，底层调用了数组拷贝的方法
		System.arraycopy（)...是这样扩容的。所以stringBuilder/StringBuffer
		适合使用字符串的频繁拼接操作

 */
		
		
		
		//字符串不可变是什么意思？
		//是说双引号里面的宇符申对象一且创建不可变。
		
		String s = "asd";//"asd"放到了字符串常量池当中。"asd"不可变。
		
		s= "syyasd";//"syyasd"放到了字符串常量池当中。"syyasd"不可变。
		//s变量是可以指向其它对象的。|
		//宇符串不可变不是说以上变量s不可变。说的是"abc"这个对象不可变。
		System.out.println(s);

	}

}
