package com.bilbli.javase.string;

public class StringText03 {
	/*
	 * String 类中的构造方法
	 * 		
	 * 
	 * 			*关于string类中的构造方法。
	 * 
第一个: String s = new String("");

第二个：Strings="";最常用

第三个:String s =  new String(char数组);

第四个：5tring  s = new String(char数组，起始下标，长度)；

第五个：String s  = new  String(byte数组);

第大个:String s = new String(byte数组，起始下标，长度）

	 * 
	 */
	public static void main(String[] args) {
		// 创建宇符串对象最常用的一种方式
		String s1 = "hell";
		//s1这个变量中保存的是一个内存地址。
		//按说以下应该输出一个地址。
		//但是输出一个字符串，说明string类已经重写了toString()方法
		
		System.out.println(s1);//hell
		System.out.println(s1.toString());//hell
		
		//这里只掌握常用的构造方法。
		byte[] bytes = {97,98,99};//97是a，98是b，99是c
		String s2 = new String(bytes);
		
		//前面说过：输出一个引用的时候，会自动调用toString(）方法，默认object的话，会自动输出对象内存地址
		//通过输出结果我们得出一个结论：String类已经重了toString()方法
		//输出宇符串对象的话，输出的不是对象的内存地址，而是宇符串本身。
		
		System.out.println(s2);//abc
		System.out.println(s2.toString());//abc
		
		
		//String（宇节数组，数组元素下标的起始位置，长度）
		String s3 = new String(bytes,1,2);
		System.out.println(s3);//bc
		
		
		//将char数组全部转换成字符审
		char[] chars= {'青','宁','起','始','页'};
		String  s4 = new String(chars);
		System.out.println(s4);//青宁起始页
		
		//将char数组的一部分转换成字符串
		String s5 = new  String(chars,2,3);
		System.out.println(s5);//起始页

		
	}

}
