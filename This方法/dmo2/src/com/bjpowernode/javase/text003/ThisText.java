package com.bjpowernode.javase.text003;

public class ThisText {
	// 带有static的主方法
	public static void main(String[] args) {
		// 调用domes方法
		ThisText.domes();
		domes();

		// dothes是实例方法 实例方法调用必须有对象存在
		ThisText t1 = new ThisText();
		t1.dothes();
		t1.runlei();
	}

	// 带有static
	public static void domes() {
		System.out.println("domes");
	}

	// 实例方法
	public void dothes() {
		// this表示当前对象
		System.out.println("dothes");
	}

	public void runlei() {
		System.out.println("runlei");
//		dothes();
//		domes();
	}
}
