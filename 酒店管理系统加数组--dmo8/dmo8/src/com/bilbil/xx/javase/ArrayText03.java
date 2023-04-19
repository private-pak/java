package com.bilbil.xx.javase;

public class ArrayText03 {
	//// main方法的编写方式，还可以采用c++的语法格式哦！
	public static void main(String args[]) {

		System.out.println("123123");

		// java的风格。
		int[] a1 = { 1, 23, 3 };
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		// C++的写法，不建议。
		int a2[] = { 1, 4, 2 };
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
			System.out.println("-----------------------");
		//调用方法
		int[] x = {1,2,1};
		printAry(x);
		
		//创建String数组
		String[] strs= {"aada","asdasd","asd"};
		printAry(strs);
		
		String[] strArry = new String[10];
		printAry(strArry);
		
		int[] strArry01 = new int[8];
		printAry(strArry01);
		System.out.println("-----------------");
		
		//也可以怎么写
		printAry(new String[2]);
		printAry(new int[2]);
	}

	public static void printAry(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			System.out.println("int数组"+arry[i]);
		}

	}
	
	public static void printAry(String[] arry1) {
		for (int i = 0; i < arry1.length; i++) {
			System.out.println("String数组"+arry1[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
