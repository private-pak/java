package com.bilbil.xx;

import java.util.Arrays;

public class ArraysText01 {
/*
 * 使用以下suN公司提供的数组工具类：java.util.Arrays;
 */
	public static void main(String[] args) {
		int[] arr  = {1,21,44,13,7,81,112};
		
		//工具类当中的方法大部分部是静态的。
		Arrays.sort(arr);
		
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
