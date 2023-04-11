package com.bilbil.xuexi;

public class FinalText01 {

	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(User.age);
		System.out.println(User.height);
		
		
	}

}

class User{//实例变量
	final static int age = 1;//final修饰的实例变量，需要手动赋值
	static final double height = 1.80;
	
	
	final int shijin;
	public User() {//构造方法 
		
		this.shijin = 112;
		System.out.println(this.shijin);
	}
}