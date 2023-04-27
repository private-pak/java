package com.bilbli.javase.random;

import java.util.Random;
/*
 * 随机数
 */
public class RandomText01 {

	public static void main(String[] args) {
		// 创建随机数对象
		Random randmo = new  Random();
		
		//随机产生一个int类型的取值范围的数字
		int num1  =   randmo.nextInt();
				System.out.println(num1);
				
				//产生[0~100]之间的随机数。不能产生101。
				//nextInt翻译为：下一个int类型的数据是101，表示只能取到100
			int num2 = 	randmo.nextInt(101);//不过阔101
			System.out.println(num2);
			
			
	}

}
