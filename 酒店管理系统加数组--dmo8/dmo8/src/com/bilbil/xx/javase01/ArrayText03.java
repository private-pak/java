package com.bilbil.xx.javase01;

public class ArrayText03 {

	public static void main(String[] args) {
		// 二维数组遍历
		String [][] array = {
				{"java","oracle","c++","python","c#"},
				{"张三","李四","王五"},
				{"lucy","jack","rose"}

		};
		/*
		 * for（int i=θ；i <  array.length；i++)（//外层循环3次。（负责纵向。）
				String[] 一维数组  = array[i];
		//负责逼历一维数组
			for(int i=θ;j  <  一维数组.length;i++)(
				System.out.print(一维数组[i]+"");
		 * 
		 */
		//遍历二维  数组 
		for (int i = 0; i < array.length; i++) {//外层循环3次  负责纵向
			//内层循环负责输出一行
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}
