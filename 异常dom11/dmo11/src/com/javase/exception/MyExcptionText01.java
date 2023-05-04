package com.javase.exception;

public class MyExcptionText01 {

	public static void main(String[] args) {
		//创建异常对象
		MyExcption men =new MyExcption("用户名异常");
		
		//打印异常堆栈信息
		men.printStackTrace();
		
		//获取异常简单描述信息
		String msg = men.getMessage();
		System.out.println(msg);
	}

}
