package com.javase.xx.collection;

public class ForEachText01 {

	public static void main(String[] args) {

		int[] arr = {13,6565,4,46,7,9,56,};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//增强for（foreach）
		//以下是语法 
		/*for（元素类型 变量名：数组或集合）{
		   System.out.printLn(变量名);
		}*/
System.out.println("-----------------");
		
		//foreach有一个缺点：没有下标。|在需要使用下标的循环中，不建议使用增强or循环。|
		 for(int data:arr) {
			//data就是数组中的元素
			 System.out.println(data);
		 }
	}

}
