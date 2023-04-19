package com.bilbil.xx.javase;

public class ArrayText02 {

	public static void main(String[] args) {
		// 声明/定义一个数组，采用动态初始化的方式创建
		int[] a1 = new int[4];// 创建长度为4的int数组，数组中每个元素的默认值是0
		// 遍历数组
		for (int i = 0; i < a1.length; i++) {
			System.out.println("数组中下标为"+i+"的元素是"+a1[i]);
		}
		
		//初始化 一个Object类型的数组 采用动态初始化方式
		Object[] objs  = new Object[3];//3个长度，动态初始化，所以每个元素默认值是null
		for(int i = 0;i <objs.length;i++) {
			System.out.println(objs[i]);//null
		}
		
		System.out.println("----------------------------------");
		String[] stg = new String[4];
		for(int i = 0;i <stg.length;i++) {
			System.out.println(stg[i]);//null
		}
		System.out.println("----------------------------------");
		
		//采用 静态初始化方式
		String[] strs = {"avbb","asd","asdas"};
		for(int i = 0;i <strs.length;i++) {
			System.out.println(strs[i]);
		}
		System.out.println("----------------------------------");
		//存储Object 采用静态初始化
			/*Object o1 = new Object();
			Object o2 = new Object();
			Object o3 = new Object();
			*///换个方式
		
			Object[] objects = {new  Object(),new Object(),new Object()};
			for(int i = 0;i <objects.length;i++) {
				System.out.println(objects[i]);
			}
	}
}