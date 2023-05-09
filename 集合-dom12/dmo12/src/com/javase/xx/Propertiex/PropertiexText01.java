package com.javase.xx.Propertiex;

import java.util.Properties;

public class PropertiexText01 {
/*
 * 目前只需要掌橱Properties属性类对象的相关方法即可。
	Properties是一个Map集合，继承HashtabLe，Properties的key和vaLue部是string类型
	Properties被称为属性类对象。

 */
	public static void main(String[] args) {
		//创建Properties对象
		Properties pro=  new Properties();
		
		//需要掌握Properties 的两个方法 一个存 一个取
		pro.setProperty("1", "QWE1");
		pro.setProperty("2", "QWE2");
		pro.setProperty("3", "QWE3");
		pro.setProperty("4", "QWE4");
		
		//通过key获取value
		String A1 =pro.getProperty("1");
		String A2 =pro.getProperty("2");
		String A3 =pro.getProperty("3");
		String A4 =pro.getProperty("4");
		
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(A4);
		
		
	}

}
