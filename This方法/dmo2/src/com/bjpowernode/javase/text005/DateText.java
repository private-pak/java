package com.bjpowernode.javase.text005;

public class DateText {

	public static void main(String[] args) {
		// 创建日期对象1
		
		Date time1 = new Date();
		time1.print();
		// 创建日期对象2
		Date time2 =  new Date(2001,1,1);
		time2.print();
	}

}
