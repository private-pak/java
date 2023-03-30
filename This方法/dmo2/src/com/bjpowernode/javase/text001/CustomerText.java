package com.bjpowernode.javase.text001;

public class CustomerText {

	public static void main(String[] args) {
		// 创建customer对象
		Customer c1 = new Customer();
		c1.name = "张三";
		c1.shpping();

		// 创建customer对象
		Customer c2 = new Customer();
		c2.name = "李四";
		c2.shpping();

		// 调用dosme方法//修饰符 带有static
		// Customer.dosme();

		Customer.dosther();
	}

}
