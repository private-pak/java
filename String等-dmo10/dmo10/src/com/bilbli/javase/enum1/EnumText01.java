package com.bilbli.javase.enum1;


public class EnumText01 {

	public static void main(String[] args) {
		boolean succerss= divide(10, 10);
		System.out.println(succerss ? "计算成功 " :  "计算失败");
		

	}

	/**以下程序，计算两个nt类型数据的商，计算成功返回1，计算失败返回0	
	 * @param a int类型的数据

	 * @param b int类型的数据
	 * 
	 * @return  返回1表示成功，返回0表示失败！
	 */
	public static boolean divide(int a ,int b) {
		try {
			int c = a / b;
			//程序执行到此处表示以上代码没有发生异常。表示执行成功！
			return true;
			
		}catch(Exception e) {
			//程序执行到此处表示以上程序出现了异常！
			//表示执行失败！

			return false;
		}
		
		

	}

}
