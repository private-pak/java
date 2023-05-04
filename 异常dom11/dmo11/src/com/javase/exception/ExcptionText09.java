package com.javase.exception;

public class ExcptionText09 {
/*
 * finally
 */
	public static void main(String[] args) {
		int result = m();
		System.out.println(result);//10

	}
	/*
	 * java语法规则（有一些规则是不能破坏的，一且这么说了，就必须这么做！）：
				java中有一条这样的规则：
						方法体中的代码必须遵错自上而下顺序做次摄行执行（互不变的语法！）
				return语句一且执行，整个方法必须结束（亘古不变的语法！）		

	 */
	
	
	
	public static int m() {
		int i = 10;
		try {
			//这行代码出现在int i=10的下面，所以最终结果必须是返回10
			return  i;
			
		}finally {
			i++;
		}
	}
}
