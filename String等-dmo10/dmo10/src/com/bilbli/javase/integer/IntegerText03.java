package com.bilbli.javase.integer;

public class IntegerText03 {
/*
 * 关于Integer类的构造方法，有两个：
		Integer(int)
		
		Integer(string)

 */
	public static void main(String[] args) {
		//JaVa9之后不建议使用这个构造方法了。出现横线表示已过时。
		//痔数字100转换成Integer包装类型（int--》Integer）
		Integer x = new Integer(100);
		System.out.println(x);
		
		//将string类型的数宇，转换成Integer包装类型。（String--》Integer）
		Integer y   = new  Integer("122");
		System.out.println(y);
		
		// doubLe-->DoubLe
		Double d = new Double(1.22);
		System.out.println(d);
		
		// String-->Double
		Double  e  = new Double("3.11");
		System.out.println(e);
	}//611

}
