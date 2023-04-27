/**
 * 
 */
package com.bilbli.javase.date;

/**
 * 
 *获取自1970年1月1日00:00：00009到当前系统时间的毫秒数。
 *简单总结一下system类的相关属性和方法：
 *
System.out【out是system类的静态变量。】
System.out.printLn()[printLn()方法不是System类的，是printStream类的方法。】
System.gc（）建议启动垃圾回收器
System.currentTimeMiLLis()获取自1970年1月1日到系统当前时间的总毫秒数。
System.exit(0)退出jVM。

 */
public class DateText02 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// 获取自1970年1月1日00:00：00009到当前系统时间的总毫秒数。
		long newTimeMills = System.currentTimeMillis();
		System.out.println(newTimeMills);//1682429757620
		
		
		//统计一个方法耗时
		//在调用目标方法之前记录一个毫秒数
		long begin =  System.currentTimeMillis();
		print();
		//在执行完目标方法之后记录一个毫秒数
		long end = System.currentTimeMillis();
		System.out.println("print耗时"+(begin-end)+"毫米");
		
	}
	//需求：统计一个方法执行所耗费的时长
	public static void print() {
		for (int i = 0; i <100010; i++) {
			System.out.println("i =" + i);
			
		}
	}

}
