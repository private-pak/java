package com.bjpowernode.javase.text005;

public class Text03 {

	public static void main(String[] args) {

		
		//Text01 tt = new Text01();编译报错 他们不在同一个package包
		//System.out.println(tt);
		
		//所以这里的包名不可以省略
		com.bjpowernode.javase.text004.Text01  tt = new com.bjpowernode.javase.text004.Text01();
		System.out.println(tt);//com.bjpowernode.javase.text004.Text01@5e91993f
	}

}
