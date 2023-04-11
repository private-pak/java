package com.bilbil.xuexi05;

import java.util.Scanner;//import java.util.*;也可以 怎么写

public class ScannerText01 {

	public static void main(String[] args) {
		//为什么 怎么写
		//因为ScannerText01类 和Scanner类不在同一个包下//java.util 就是Scanner类的包名
		//java.util.Scanner s =  new java.util.Scanner(System.in);
		//简写用 import导入 Scanner类
		
		Scanner  s = new Scanner(System.in);
		String str = s.next();
		System.out.println("您输入的字符串是："+  str);

	}

}
