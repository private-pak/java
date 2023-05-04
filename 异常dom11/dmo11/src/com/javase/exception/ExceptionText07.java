package com.javase.exception;
/*
 * finall语句
 */
public class ExceptionText07 {

	public static void main(String[] args) {
		/*
		 * try和inaLLy，没有catch可以吗？可以。
		 * try不能单独使用。
			try  finally可以连用。
			
				以下代码的执行顺序：
					先执行try...
					再执行finalLy...
					最后执行return（return语句只要执行方法必然结束。

		 */
		try{
			System.out.println("try...");
				return;
		}finally {
			System.out.println("finally....");
		}
		//这里不能写语句，因为这个代码是无法执行到的。
		//System.out.println("1");
	}

}
