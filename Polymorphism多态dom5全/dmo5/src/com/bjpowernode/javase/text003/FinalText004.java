package com.bjpowernode.javase.text003;

public class FinalText004 {

	public static void main(String[] args) {
	System.out.println(Chinese.GUO_JI);
	System.out.println("圆周率："+Math.PI);

	}

	
}

	class Math{
		public static final  double PI = 3.1515926;
	}

class Chinese{
	//国际不变 加final
	//final 修饰的实例变量是不可变的，这种变量一般和static 联合使用称为 常量
	//常量的语法格式 public static final 类型 常量名 = 值；
	//static final String country = "中国";
	public static String GUO_JI = "中国";//java 规定中要求所有的常量名字全部 大写 词与词之间用 _ 相连
	//157
}
