package com.javase.exception;

public class ExceptionText08 {
/*
 * finally
 */
	public static void main(String[] args) {
		try{
			System.out.println("try...");
			//退出jvm
			System.exit(0);

		}finally {
			//这里就不会执行//退出JVM之后，finally语句中的代码就不执行了！
			System.out.println("finally....");
		}

	}

}
