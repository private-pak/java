package com.bilbil.xuexi.day01;

public class Text01 {
	public static void main(String[] args) {
		User user =  new User();
		//private 修饰的元素只能在本类中使用 
		//System.out.println(user.id);
		
		System.out.println(user.age);
		System.out.println(user.name);
		System.out.println(user.weidth);

	}

}
