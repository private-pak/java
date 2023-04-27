package com.bilbli.javase.random;

import java.util.Arrays;
import java.util.Random;

public class RandmoText0 {
/*
 *	编写程序，生成5个不重复的随机数【0--100】。重复的话重新生成。
	最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。

 */
	public static void main(String[] args) {
//创建randmo对象
		Random random = new Random();
		//准备一个长度为5的一维数组。
		int[] arr  = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=  -1;
		}

		
		//循环 生成 随机数
		int index = 0;
		while(index  < arr.length) {
			//生成随机数
			int num = random.nextInt(101);
			//判断arr数组 中有没有 这个num
			//如果没有这个num 就放进去
			if(!contains(arr, num)) {
				arr[index++] =num;
		}
	}
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

}

/*
单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
@paramarr数组

@paramkey元素
?
@return true表示包含，faLse表示不包含。
*/
public  static boolean  contains(int[]arr,int key) {
	/*有问题bug
	//对数组进行升序
	Arrays.sort(arr);
	//进行二分法查找
	//二分法查找的结果>=说明，这个元素找到了，找到了表示存在
	return Arrays.binarySearch(arr, key) >=0;
	*/
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] ==  key) {
			return true;
		}
	}
	return false;
}
}







