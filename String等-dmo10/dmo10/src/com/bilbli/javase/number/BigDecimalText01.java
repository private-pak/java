package com.bilbli.javase.number;

import java.math.BigDecimal;

public class BigDecimalText01 {
/*
 * 1、BigDecimal属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
这是SUN提供的一个类。专门用在财务软件当中。
2、注意：财务软件中doubLe是不够的
 */
	public static void main(String[] args) {
		// 这里的2000不是普通的2000 是高精度的2000
		BigDecimal v1 = new BigDecimal(2000);
		BigDecimal v2 = new BigDecimal(2000);
		//求和 
		BigDecimal v3  = v1.add(v2);
		System.out.println(v3);//4000
		
		BigDecimal v4  = v1.remainder(v3);
		System.out.println(v4);//2000 是求余运算
		
		BigDecimal v5  = v1.divide(v2);
		System.out.println(v5);
		
	}

}
