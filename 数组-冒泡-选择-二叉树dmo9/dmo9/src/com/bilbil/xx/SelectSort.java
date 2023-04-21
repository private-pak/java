package com.bilbil.xx;

public class SelectSort {
/*
 * 选择排序：
		每一次从这堆参与比较的数据当中找出最小值
		拿着这个最小值和最前面的元素交换位置 。

 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {1,9,5,4,8,77};
		
		int count   = 0;
		
		
		//选择排序
		//6条数据循环5次。（外层循环5次。）
		for (int i = 0; i < arr.length-1; i++) {
			//i的值是 0 1 2 3  4
				//System.out.println(i);
			// i 正好是“参加比较的这堆数据中”最左边那个元素的下标。
			
			int min  =i;
			for (int j = i+1; j < arr.length; j++) {
				count++;
				
				//System.out.println("--->" +  j);
				if (arr[j] <  arr[min]) {
					min = j;
				}
				
			}
			if(min  !=i) {
				int temp;
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
			
		}
		System.out.println("比较次数 "+count);//15
		//冒泡排序和选择排序实际上比较的次数没变。
		//交换位适的次数减少了。
		
		
		//遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
