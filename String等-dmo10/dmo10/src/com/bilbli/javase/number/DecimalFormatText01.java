package com.bilbli.javase.number;

import java.text.DecimalFormat;

public class DecimalFormatText01 {
/*
 * 关于数字的格式化。

 */
	public static void main(String[] args) {
		//java.text.DecimalFormat专门负责数字格式化的。
		//DecimalFormat df= new DecimalFormat();//数字格式");

		/*
		 * 数宇格式有娜些？
				# 代表任意数字
				,  代表千分位
				. 代表小数点
				0  代表不够时候补上0
			
			"###,###.##"
						表示：加入千分位，保留2个小数。
		 */
		DecimalFormat df= new DecimalFormat("###,###.##");
		String  s = df.format(1811.223132);
		System.out.println(s);//1,811.22
		
		DecimalFormat df2= new DecimalFormat("###,###.0000");
		String s2  = df2.format(25836.13);
		System.out.println(s2);//25,836.1300

	}

}
