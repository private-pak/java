package com.bjpowernode.javase.text003;

public class FinalText003 {

	public static void main(String[] args) {
		//创建用户对象 
		User  u = new User(100);
		//又创建一个新的user对象
		u = new User(200);
		
		final User user = new User(10);
		//user = new User(20);
		System.out.println(user.id);
		//final修饰的引用，一旦指向某个对象之后，不能在指向其他对象，那么被指向的对象无法被垃圾回收器回收
		user.id = 50;
		System.out.println(user.id);
		//final修饰的引用蛋然指向某个对象之后不能指向其它对象，但是所指向的对象内部的内存是可以被修改的：

	}

}
