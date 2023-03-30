package com.bjpowernode.javase.text004;

public class UserText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		User u1 = new User(121, "李四", 24);
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u1.getAge());

		// 想办法修改名字
		u1.setName("你好");

		// 这里就不用getname 要用setname
	}

}
