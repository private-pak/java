package com.bjpowernode.javase.text007;

public class Text {
	public static void main(String[] args) {
		Text.dosme();
		dosme();
		
		Text  t =  new Text();
		t.dosme();
		
//		//引用是空
//		t = null;
//		t.dosme();
	}
	//带有static的方法 需要使用 类名. 的方式访问
	public static void dosme() {
		System.out.println("do sme");
	}
}
