package com.bilbli.javase.string;

public class StringText {

	public static void main(String[] args) {
		//这两行代码表示底层创建了3个字符申对象，都在宇符申常量池当中。
		String s1 = "arrr";
		String s2 = "asd" + "dasd";
		
		
		
		//分析：这是使用new的方式创建的字符申对象。这个代码中的"asd"是从娜里
		//凡是双引号括起案的部在宇符申常量池中有一份。
		//new对象的时候一定在堆内存当中开辟空间。
 
		String s3= new String("asd");
	}

}
