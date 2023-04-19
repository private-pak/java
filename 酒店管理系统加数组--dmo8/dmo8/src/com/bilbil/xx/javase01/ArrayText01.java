package com.bilbil.xx.javase01;

public class ArrayText01 {
	/*关于java的二维数组
	 * 1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
2、三维数组是什么？
	三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组。实际的开发中使用最多的就是一维数组。二维数组也很少使用。三维数组几乎不用。
3、二维数组静态初始化
	int [][] a = {
				{1,2,3},
				{1,2},
				{1,2,3,0},
				{1,2,3,3}
		};
	 */
	
	
public static void main(String[] args) {
		//一维数组
		int [] array= {11,22,11};
		System.out.println(array.length);//3
		
		//二维数组
		//一下代码中里面有4个一维数组 
		int [][] a = {
				{1,2,3},
				{1,2},
				{1,2,3,0},
				{1,2,3,3}
		};
		System.out.println(a.length);//4
		System.out.println(a[0].length);//3
		

	}
}
