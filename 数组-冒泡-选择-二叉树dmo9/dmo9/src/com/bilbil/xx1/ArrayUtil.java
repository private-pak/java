package com.bilbil.xx1;

public class ArrayUtil {
	/*
	 * 数组工具类 二分法查找
	 */
	public static void main(String[] args) {
		int[] arr = { 100, 200, 300,400, 500, 600, 700 };
		
		//找出arr这个数组中200所在的下标。
		//调用方法
		int index = BinarrySearch(arr,200);
		System.out.println(index == -1 ?  "该元素不存在" : "该元素的下标是" + index);

	}

	/**从数组中查找目标元素的下标。
	 * @ arr 查找的数组（这个必须是已经排序的。）
	 * @ dest 目标元素
	 * *@return-1表示该元素不存在，其它表示返回该元素的下标。
	 */
	public  static int BinarrySearch(int[] arr, int dest) {
		
			//开始下标
			int begin =0;
			//结束下标
			int end = arr.length -1;
	
			while(begin <= end) {
			//中间元素下标
			
			int mid =  (begin + end) / 2;
			
			if(arr[mid] ==  dest) {
				return mid;
				
			}else if(arr[mid]< dest) {
				begin = mid +1;
			}else {
				end= mid -1;
			}
			
			
			}
			return -1;
	}

}
