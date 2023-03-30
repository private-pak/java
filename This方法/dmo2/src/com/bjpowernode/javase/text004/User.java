package com.bjpowernode.javase.text004;

/*
 * this.什么时候 不能省略 
 * 		用来区分实例变量 和 局部变量的时候
 */
public class User {

	// 用户类
	private int id;
	private String name;
	private int age;

	public User(int id, String name, int age) {
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 构造函数
	// set和get
//	public void setid(int a) {
//		this.id = a;
//		
//	}

//	public void setid(int id) {
//		/*
//		 * 等号前面的this.id是实例变量 id 等会后面的id是局部变量id 使用这里的this不是省略
//		 */
//		this.id = id;
//
//	}

}
