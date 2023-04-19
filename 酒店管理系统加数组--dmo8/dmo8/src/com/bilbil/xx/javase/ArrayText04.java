package com.bilbil.xx.javase;

public class ArrayText04 {
/*
 * 当一个方法的参数是一个数组的时候，我们还可以采用这种方式传
 */
	public static void main(String[] args) {
		// 静态初始化一维数组
		int [] a = {1,2,1,3};
		printArry(a);
		System.out.println("-------------------");
		
		//如果直接传一个静态数组的话可以怎么写
		printArry(new int[] {1,2,3});
		
		// 多态初始化一维数组
		int[] a2  = new int[3];
		printArry(a2);//三个0
		
		System.out.println("--------------------");
		printArry(new int[2]);
	}

	public static void printArry(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
