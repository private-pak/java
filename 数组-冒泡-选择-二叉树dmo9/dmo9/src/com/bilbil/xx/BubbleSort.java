package com.bilbil.xx;

import java.util.Arrays;

public class BubbleSort {
/*
 * 冒泡排序算法
 * 
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {1,9,5,4,8,77};
		
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//7条数据，循环6次。以下的代码可以循环6次。
//		for (int i = 0; i < arr.length-1; i++) {
//			System.out.println(i);//0 1 2  3   4
//		}
		
		//7条数据，循环6次。以下的代码可以循环6次。
		int count=0;
		
		
		for (int i = arr.length-1; i > 0; i--) {
			//System.out.println(i);//5 4  3 2 1
			for (int j = 0; j < i; j++) {
				count++;////不管是否需要交换位置，总之是要比较一次的。
				
				if(arr[j] > arr[i]) {
					//交换位置。
					//arr[j]和arr[j+1]交换
					int tmpe;
					tmpe = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =  tmpe;
					
				}
			}
		}
		System.out.println("比较次数 "+ count);//15
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}//580
