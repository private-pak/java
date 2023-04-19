package com.bilbil.xx.javase01;

public class ArrayText02 {
/*
 * 关于二维数组中元素的：读和改。
 * a[二维数组中的一维数组的下标][一维数组的下标】
 * 
	a[0][0]：表示第1个一维数组中的第1个元素。
	
	a[3][100]：表示第4个一维数组中的第101个元素。

 */
	public static void main(String[] args) {
		//二维数组
		int[][] a= {
				{1,2,3},
				{11,22,33,44},
				{0}
		};
		//请取出以上二位数中的第1个一维数组。
	/*	int[]我是第1个一维数组 =  a[0];
		int 我是第1个一维数组中的第1个元素 = 我是第1个一维数组[0];
		System.out.println（我是第1个一维数组中的第1个元素）；
		//合并以上代码*/
		
		System.out.println(a[0][2]);//3
		
		//改
		a[2][0]   =111;
		System.out.println(a[2][0]);
	}

}
