package com.bilbli.javase.enum1;

public class SwitchText01 {

	public static void main(String[] args) {
		/*
		 * //switch语句支持枚举类型
				//switch也支持string、int
				//低版本的JDK，只支持int
				//高版本的JDK，支持int、String、枚举。
				//byteshortchar也可以，因为存在自动类型转换。

		 */
		switch(SeasonText01.SUMMER) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
	}

}
//629