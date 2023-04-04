package com.bjpowernode.javase.text003;

public class FinalText02 {
	//成员变量之实例变量
	//实例变量的默认值 +  final修饰的变量一旦赋值不能程序赋值
	//final int age//编译报错
	final int  age  =  1;
	
	final int  num;
	public  FinalText02() {
		this.num = 200; 
		
	}
	
	public static void main(String[] args) {
		final int a;
		a = 100;
		//不可以二次赋值

	}

}
