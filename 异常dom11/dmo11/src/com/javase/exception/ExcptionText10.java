package com.javase.exception;

public class ExcptionText10 {
/*
 * finol  finatLy finaLize有什么区别
 * 	final关键字
			finaL修饰的类无法继承
			finaL修饰的方法无法覆盖
			finaL修饰的变量不能重新赋值。

finalLy关键字
		和try一起联合使用。
		finaLLy语句块中的代码是必须执行的。
		
finalize标识符
		是一个obiect类中的方法名
		finaLize(）方法是JVM的GC垃圾回收器负责调用。
 */
	public static void main(String[] args) {
		//finaL是一个关键字。表示最终的。不变的。
		final int  i = 100;
		//i=1;
		
		//finaLLy也是一个关键字，和try联合使用，使用在异常处理机制中
		//在fianLLy语句块中的代码是一定会执行的。
		try {
			
		} finally {
			System.out.println("finally");
		} 
		//finaLize()是object类中的一个方法。作为方法名出现。
		//所以finalize是标识符。
		//finaLize(）方法是JVM的GC垃圾回收器负责调用。
		Object obj;
		
	}

}
//final修饰的类无法继承
final class A{
	public static final  double PI = 3.14;
}
class B{
	//finaL修饰的方法无法覆盖
	public final void dosome() {
		
	}
}