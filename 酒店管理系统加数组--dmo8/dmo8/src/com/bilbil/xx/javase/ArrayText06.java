package com.bilbil.xx.javase;

public class ArrayText06 {
	//模拟一个系统，假设这个系统要使用，必须输入用户名和密码。
	public static void main(String[] args) {
		//用户名和密码输人到string[]args数组当中
		if(args.length != 2) {
			System.out.println("请输入您的账户和密码进行后续操作");
			return;
		}
		//程序执行到此处说明用户确实提供了用户名和密码。
		//接下来你应该判断用户名和密码是否正确。
		//取出用户名		
		String username = args[0];
		//取出密码
		String password  = args[1];
		
		//假设用户名是admin，密码是123的时候表示登录成功。其它一律失败。
		//判断两个字符串是否相等，需要使用equaLs方法。		
		//if(username.equals("admin") && password.equals("123")) {
		//这样写可以避免  空指针异常
		//采用这种 即使 username和password  都是null
		if("admin".equals(username)&& "123".equals(password)) {
			System.out.println("登录成功，欢迎["+ username +"]回来");
			
		}else {
			System.out.println("登陆失败：用户名或密码错误");
		}
		
		
	}
	

}
