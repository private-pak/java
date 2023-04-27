package com.bilbli.javase.integer;

public class IntegerText08 {
/*
 * 总结一下之前所学的经典异常？
 * 
	空指针异常：NuLLPointerException
	类型转换异常：CLassCastException
	数组下标越界异常：ArrayIndexOutofBoundsException
	数字格式化异常：NumberFormatException
	
Integer类当中有哪些常用的方法呢？

 */
	public static void main(String[] args) {
		//手动装箱
		Integer x  =new Integer(100);
		
		//手动拆箱
		int y =x.intValue();
		System.out.println(y);
		
		//编译的时候没问题，一切符合java语法，运行时会不会出间题呢？
		//不是一个“数字”可以包装成Integer码？不能。运行时出现异常。
		//java.Lang.NumberFormatException
		
		//  Integer a  = new Integer("中文");

		
		
		
		//重点方法
		// static int parseIrt(String s)
		//静态方法，传参string，返回int

		int revle= Integer.parseInt("100"); //String-转换->int
		//int revle1= Integer.parseInt("武大");//NumberFormatException
		System.out.println(revle + 500);
		
		double revle2 = Double.parseDouble("3.14");
		System.out.println(revle2 - 1);
		
		float revle3 =  Float.parseFloat("1.222");
		System.out.println(revle3  * 1);
		
		//*--------------------------------------------------------了解
		
		// static String toBinaryString(int i)
		//静态 方法将十进制转换成二进制字符串。
		String binaryString = Integer.toBinaryString(128);
		System.out.println(binaryString);//10000000 二进制字符串
		
		// static String toHexString(int i)
		//静态的：将十进制转换成十大进制字符审。
		String hexStringl = Integer.toHexString(110);
		System.out.println(hexStringl);// 十六进制 6e
		
		//static String tooctalString(int i)
		//静态的：将十进制转换成八进制宇符申。
		String tooctalString = Integer.toOctalString(8);
		System.out.println(tooctalString);
		
		Integer  s1  = Integer.valueOf("100");
		System.out.println(s1);
		

		
	}

}
