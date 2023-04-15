package com.bilbil.xuexi.day04;

public class Text04 {
/*
 * java语言当中的字符串string有没有重写tostring方法，有没有重写ecquals方法，
 * 
 * 总结：
 * 		1、String类已经重写了equals方法，比较两个字符串不能使用==，必须使用equals.
 * 		ecquals是通用的。
 * 		2、String类已经重写了toString方法，
 * 		
 * java中什么类型的数据可以使用"=="判断
 * 		java中基本数据类型比较是否相等，使用==
 * java中什么类型的数据需要使用equals判断
 * 		Java中所有的引用数据类型统一使用equals方法来判断是否相等.
 */
	public static void main(String[] args) {
		//大部分情况下，采用这样的方式创建字符串对象
		String sl ="hello";
		String s2 = "abc";
		//实际上string也是一个类。不属于基本数据类型，
		//既然string是一个类，那么一定存在构造方法.
		String s3 = new String  ("test1");
		String s4 = new String  ("test1");
		//System.out.println(s3 ==  s4);//false  == 比较的是s3  和 s4 的内存地址不同
		
		//比较两个字符串能不能使用双等号？
		//不能，必须调用equals方法。
        //String 类已经重写equals方法了
		System.out.println(s3.equals(s4));//ture
		
		//string类有没有重写tostring方法呢？
		String stg = new String("机器学习");
		//如果String没有重写toString（）方法，输出结果：java.lang.string@十六进制的地址
		//通过测试 说明  String类语句重写toString（）方法
		System.out.println(stg.toString());//机器学习
		System.out.println(stg);//机器学习
	}//

}
