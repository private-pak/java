package com.javase.xx.Map;

import java.util.HashSet;
import java.util.Set;

public class MyclassTxext01 {
	
	//声明一个静态内部类
	private static class InnerCalss{
		//静态方法
		public static void mi() {
			System.out.println("静态内部类的m1方法");
			
			
		}
		
		//实例方法
		public void m2() {
			System.out.println("静态内部类的实例方法");
		}
	}

	public static void main(String[] args) {
		MyclassTxext01.InnerCalss.mi();
		
		//创建静态内部类对象
		MyclassTxext01.InnerCalss mi=new MyclassTxext01.InnerCalss();
		mi.m2();
		
		//给一个Set集合
		//该Set集合中存储的对象是：MyCLassTxext01.InnerCLass类型
		Set<MyclassTxext01.InnerCalss> set = new  HashSet<>();
		
		//这个set集合中存储的是字符串对象
		Set<String> set2 = new HashSet<>();

	}

}
