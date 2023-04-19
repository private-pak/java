package com.bilbil.xx.javase;

public class ArrayText05 {
/*
 * main方法上面的"string[】args”有什么用？
分析以下：谁负责调用main方法（JVM）
JVM调用main方法的时候，会自动传一个string数组过来。

 */
	public static void main(String[] args) {
		 //这个方法程序员负责写出来，JVM负责调用。JVM调用的时候一定会传一个String数组过来。
		//JVM默认传递过来的这个数组对象的长度。//默认 0  说明args不是null
		System.out.println("JVM给传递过来的string数组参数，它这个数组的长度是？"+args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}//554
