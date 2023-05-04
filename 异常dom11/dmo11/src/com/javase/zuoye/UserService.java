package com.javase.zuoye;

public class UserService {
	/*
	用户业务类，处理用户相关的业务：例如登录、注册等功能。
	*/

//	public static void main(String[] args) {
//
//		
//
//	}
	
	public void reguster(String username, String password) throws IllegaINameException {
		//引用等于nuLL的这个判断最好放到所有条件的最前面。
		//再分享一个经验：username==null不如写成null==username
		if(null == username||  username.length() <6  || username.length() > 14) {
			throw new IllegaINameException("用户名异常或无意义");
		}
		
		//程序能够执行到此处说明，用户名合法
		System.out.println("注册成功"+username);
	}
}
