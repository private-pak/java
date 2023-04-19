package com.bilbil.xx.javase01;

public class ArrayText04 {
/*
 * 动态初始化二维数组。
 */
	public static void main(String[] args) {
	/*	// 3行 4列
		//3个一维数组，每一个一维数组当中4个元素。
		int [][] array = new int[3][4];
		
		//二维数组遍历
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
			
		}*/
		
		//静态初始化
		int[][] a = {{1,2,3,4},{4,5,6,76},{1,23,4}};
		printArray(a);
		System.out.println("-------------------------------");
		
		//可以怎么写
		printArray(new int[][]{{1,2,3,4},{4,5,6,76},{1,23,4}});
		
	}
	public static void printArray(int[][] array) {
	for (int i = 0; i < array.length; i++) {
		//遍历二维数组
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	}//569

}
