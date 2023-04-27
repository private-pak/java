package com.bilbli.javase.integer;

public class IntegerText05 {
/*
 * 好消息：在JDK1.5之后，支持自动拆箱和自动装箱了。
 */
	public static void main(String[] args) {
		////自动装箱
		//int 类型 - 自动转化为----》Integer
		Integer x = 1000;
		
		//自动拆箱
		int y= x;
		System.out.println(y);

	}

}
