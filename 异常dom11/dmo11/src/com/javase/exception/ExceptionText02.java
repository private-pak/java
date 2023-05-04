package com.javase.exception;

public class ExceptionText02 {
/*
 * 以下代码报错的原因是什么？
	因为doSome(）方法声明位置上使用了：throwsCLassNotFoundException
	而CLassNotFoundException是编译时异常。必须处理

 */
	public static void main(String[] args) {
		//在main方法调用dosome方法
		
		 	//因为doSome()方法声明位置上有：throws CLassNotFoundException
			//我们在调用doSome（）方法的时候必须对这种异常进行预先的处理。
			//如果不处理，编译器就报错。
			//编译器报错信息：UnhandLedexception：java.Lang.CLassNotFoundException
		//dosome();
		 
		
	}
	/**
	 * doSome方法在方法声明的位置上使用了：throws CLassNotFoundException
	 *这个代码表示doSome（)方法在执行过程中，有可能会出现cLassNotFoundException异常
	 *叫做类没找到异常。这个异常直接父类是：Exception，所以cLassNotFoundException属于编译时异常。


	 * @throws ClassNotFoundException
	 */
	public static void dosome() throws ClassNotFoundException{
		System.out.println("dosme");

	}

}
