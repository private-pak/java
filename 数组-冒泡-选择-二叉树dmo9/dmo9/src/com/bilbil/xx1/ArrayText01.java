package com.bilbil.xx1;

import java.util.Arrays;

public class ArrayText01 {
/*
 * 数组工具类
 * 		java.util.Arrays
 */
	public static void main(String[] args) {
		int [] arr = {4,5,99,41,11};
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//二分查找
		int index = Arrays.binarySearch(arr, 41);
		System.out.println(index  ==  -1 ?  "该元素不存在" : "该元素的下标是" + index);

	}

}
