package com.javase.exception;

/*
 * java语言中异常是以什么形式存在的呢？
 * 1、异常在java中以类的形式存在，每一个异常类部可以创建异常对象
 * 
 * Java语言中对异常的处理包括两种方式：
第一种方式：在方法声明的位置上，使用throws关键字。
第二种方式：使用try..catch语句进行异常的捕提。

 */

public class ExceptionText01 {

	public static void main(String[] args) {
		//通过“异常类”实例化“异常对象”
		NumberFormatException nef =  new NumberFormatException("数字格式异常");
		
		System.out.println(nef);//java.lang.NumberFormatException: 数字格式异常
		
		NumberFormatException nef1 =  new NumberFormatException("空指针异常");
		System.out.println(nef1);

	}//638

}
