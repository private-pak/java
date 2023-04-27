package com.bilbli.javase.integer;

public class IntegerText07 {

	public static void main(String[] args) {
		
				Integer a= 128;
				Integer b= 128;
				System.out.println(a ==b);//false
				/*
				jaVa中为了提高程序的执行效率，将[-128到127]之间所有的包装对象提前创建好
				放到了一个方法区的“整数型常量池”当中了，目的是只要用这个区间的数据不需要
				再new了，查接从整数型常量池当中取出来
				*/
				
				Integer x= 127;
				Integer y= 127;
				System.out.println(x == y);//true

	}

}
