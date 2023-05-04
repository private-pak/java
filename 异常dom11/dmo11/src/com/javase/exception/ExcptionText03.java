package com.javase.exception;

public class ExcptionText03 {

	//第一种处理方式：在方法声明的位查上继续使用：throws，来完成异常的继续上抛。抛给调用者。
/*
	public static void main(String[] args) throws ClassNotFoundException{
		
			dosome();
		 
		
	}
*/

	/*
	 * @throws ClassNotFoundException
	 */
	
	
	//第二种处理方式：try..catch进行捕提。
	
	public static void main(String[] args) {
		try {
			dosome();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void dosome() throws ClassNotFoundException{
		System.out.println("dosme");

	}

}
