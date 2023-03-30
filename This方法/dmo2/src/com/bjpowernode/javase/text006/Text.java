package com.bjpowernode.javase.text006;

public class Text {
	// 没有static的变量
	int i = 100;

	// 带有static的方法
	public static void doSome() {
		System.out.println("do some");
	}

	// 没有static的方法
	public void doOther() {
		System.out.println("do other");
	}

	// 带有static的方法
	public static void method1() {
		// 调用dosme
		// 完整方式调用
		Text.doSome();
		// 省略方式调用
		doSome();

		// 调用doother
		// 完整方式调用
		Text t = new Text();
		t.doOther();
		// 省略方式调用

		// 访问 i
		// 完整方式访问
		System.out.println(t.i);
		// 省略方式访问
	}

	// 没有static的方法
	public void method2() {
		// 调用dosome
		// 完整方式访问
		Text.doSome();
		// 省略方式访问
		doSome();// 疑问

		// 调用doother
		// 完整方式访问
		this.doOther();
		// 省略方式访问
		doOther();

		// 访问 i
		// 完整方式访问
		System.out.println(this.i);
		// 省略方式访问
		System.out.println(i);

	}

	// 主方法
	public static void main(String[] args) {
		// 要求在这里编写程序调用 metho1
		// 完整方式访问
		Text.method1();
		// 省略方式访问
		method1();

		// 要求在这里编写程序调用 metho2
		// 完整方式访问
		Text t = new Text();
		t.method2();
		// 省略方式访问

	}

}
