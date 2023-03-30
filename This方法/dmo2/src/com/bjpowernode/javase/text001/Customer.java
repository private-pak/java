package com.bjpowernode.javase.text001;
/*
 * 关于java语言当中的 this关键字
 * 		1-this关键字 翻译为 这个
 * 		2-this是一个引用，this是一个变量，this变量当中保存了内存地址指向自身，this存储在 jvm堆内存java对象内部
 * 		3-创建一个java对象，每一个对象都有this
 * 		4-this 多少情况下可以省略
 * 		5-this不能使用在带有static的方法当中
 */

public class Customer {
	String name;

	public Customer() {
		/*
		 * 没有static关键字的 方法 被称为 实例方法 实例方法访问： 引用. 没有static关键字的 变量 被称为 变量方法 实例变量
		 */

	}

	public void shpping() {
		System.out.println(this.name + "在购物");
	}

//		public static void dosme() {
//			
//		}
//	

	// 假如想访问name实例变量
	public static void dosther() {
		Customer c3 = new Customer();
		System.out.println(c3.name + "在购物");
	}

}
