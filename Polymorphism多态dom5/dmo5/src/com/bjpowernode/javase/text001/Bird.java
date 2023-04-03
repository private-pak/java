package com.bjpowernode.javase.text001;

//鸟儿类 
public class Bird extends Animal {
	// 重写父类中继承过来的方法
	public void move() {
		System.out.println("鸟儿在ikun叫");
		//System.out.println("------------");
	}
	public void fly() {
		System.out.println("Bird fly");
	}

}
