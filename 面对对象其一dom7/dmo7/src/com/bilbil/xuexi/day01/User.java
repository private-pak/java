package com.bilbil.xuexi.day01;
/*
 * .1、访问控制权限都有娜些？
		4个
		private 私有
		protected 受保护
		publia 公开
				默认
				
1.2、以上的4个访问控制权限：控制的范围是什么？
	private表示私有的，只能在本类中访问
	public表示公开的，在任何位置都可以访问
	"默认“表示只能在本类，以及同包下访问。
	protected表示只能在本类、同包、子类中访问，
	
	访问控制修饰符     本类      同包		子类 		其他任意位置
	------------------------------------------------
	public 		   可以 		可以		可以 			可以
	protencted     可以		可以		可以			不行
	默认 			   可以		可以		不行			不行
	private		   可以  		不行		不行			不行
	
	访问控制权限修饰符可以修饰什么？
		属性（4个都能用）
		方法（4个都能用）
		类（public和默认能用，其它不行。）
		接口（public和默认能用，其它不行。
		...

	

 */
public class User {
//	public static void main(String[] args) {
//		
//	}
	private int id;//私有的
	protected int age;//受保护的
	public int weidth; //公开的
	String name;//默认的的
	

}
