package com.org.apache;


import com.bjpowernode.javase.text004.Text01;
import com.bjpowernode.javase.*;
import java.util.*;
public class Text04 {

	public static void main(String[] args) {
		com.bjpowernode.javase.text004.Text01  tt = new com.bjpowernode.javase.text004.Text01();
		System.out.println(tt);
		//简写
			Text01 ttt = new Text01();
			System.out.println(ttt);
		//java.lang.*;  不需要手动引用系统自动引入 lang：language语言包 是java语言核心类 不需要引用
			String  s ="adad";
			System.out.println(s);
		//编译错误 因为Date类没有 找到
			//  Date   D = new Date();
		//java.util.Date d =  new java.util.Date();
			//使用import语句：import java.util.Date;
			Date d = new Date();
			System.out.println(d);//Tue Apr 04 21:18:54 CST 2023
	}

}
