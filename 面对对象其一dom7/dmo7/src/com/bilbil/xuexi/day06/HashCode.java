package com.bilbil.xuexi.day06;

public class HashCode {
/*
 * hashcode方法：
	在object中的hashCode方法是怎样的？
		publicnativeinthashCode();
		
	这个方法不是抽象方法，带有native关键字，底层调用c++程序，
	
	hashCode（方法返回的是哈希码：
		实际上就是一个java对象的内存地址，经过哈希算法，得出的一个值
		所以hashCode（)方法的执行结果可以等同看做一个java对象的内存地址，

 * 
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Object o  = new Object();
		int hashCodeValue = o.hashCode();
		
		//对象内存地址经过哈希算法转换的一个数字,可以等同内存地址
		System.out.println(hashCodeValue);//1651191114
		
		Myclass ms =  new Myclass();
		int hashCodeValue2   = ms.hashCode();
		System.out.println(hashCodeValue2);//474675244
		
		Myclass mc2 = new  Myclass();
		System.out.println(mc2.hashCode());//932583850
	}

}
class Myclass{
	
}