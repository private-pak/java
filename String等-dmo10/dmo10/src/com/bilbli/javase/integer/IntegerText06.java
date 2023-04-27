package com.bilbli.javase.integer;

public class IntegerText06 {
/*
 * *好消息：在java5之后，引入了一种新特性，自动装箱和自动拆箱
自动装箱：基本数据类型自动转换成包装类。
自动拆箱：包装类自动转换成基本数据类型
*
*有了自动拆箱之后，Number类中的方法就用不着了！

 */
	public static void main(String[] args) {
		//900是基本数据类型
		//×是包装类型
		//基本数据类型--（自动转换）--》包装类型：自动装箱
		Integer x = 900;
		System.out.println(x);
		
		//×是包装类型
		//y是基本数据类型
		//包装类型--（自动转换）--》基本数据类型：自动拆箱
		int y= x;
		System.out.println(y);

		//z是一个引用，Z是一个变量，z还是保存了一个对象的内存地址。
		Integer z =100;//等同于:Integer z = new Integer(100);
		//分析为什么这个没有报错呢？
		//+两边要求是基本数据类型的数字，Z是包装类，不属于基本数据类型，这里会进行自动拆箱,将 z 转换成基本数据类型
		System.out.println(z +1);
		
		
		Integer a = 200;
		Integer b = 200;
		System.out.println(a==b);//false //因为 == 比较是二个内存地址  所以使用equals
	}

}
