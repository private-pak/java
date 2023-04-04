package com.bjpowernode.javase.text004;

public class Text02 {

	public static void main(String[] args) {
		//完整类名 com.bjpowernode.javase.text004.Text01
		com.bjpowernode.javase.text004.Text01 t = new com.bjpowernode.javase.text004.Text01();
		System.out.println(t);//com.bjpowernode.javase.text004.Text01@5e91993f
		 //可以省略包名 ，因为text01和text02在同一个目录下或者在同一个包当中
		Text01 tt  = new   Text01();
		System.out.println(tt);//com.bjpowernode.javase.text004.Text01@1c4af82c

	}

}
