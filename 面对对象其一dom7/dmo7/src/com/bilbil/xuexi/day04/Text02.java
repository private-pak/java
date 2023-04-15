package com.bilbil.xuexi.day04;

public class Text02 {
/*
  关于object类中的ecquals方法
		1、ecuals方法的源代码
	publicboolean ecruals(objectobj){
		return (this == obj);
			}
		以上这个方法是objeot类的默认实现。
	suN公司设计ecuals方法的目的是什么？
	以后编程的过程当中，都要通过equals方法来判断两个对象是否相等。
	ecquals方法是判断两个对象是否相等的.
3，我们需要研一下obiec卖给的这不款获的euals方法够不够用！！！！
 */
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		System.out.println(a == b); //true

		//判断两个java对象是否相等，我们怎公办？能直接使用"=="吗？
		
		//创建一个日期对象是：2008年1月1日。
		MyTime01 t01  = new MyTime01(2008,1,1);
		//创建了一个新的日期对象，但表示的日期也是：2008年1月1日。
		MyTime01 t02  = new MyTime01(2008,1,1);
		
		//测试以下，比较两个对象是否相等，能不能使用=="？？？
		System.out.println(t01 ==  t02);//false
		//这里的""判断的是：t01中保存的对象内存地址和t02中保存的对象内存地址是否相等
			
		//重写object equals方法之前
		boolean fals = t01.equals(t02);
		System.out.println(fals);//true
		
		//在重新 创建一个新的日期
		MyTime01  t03 = new MyTime01(2008,1,2);
		System.out.println(t01.equals(t03));//false
		
		//程序有bug？ 可以但是效率怎么样 低
		MyTime01 t4   =null;
		System.out.println(t01.equals(t4));//false
		
	}

}
class MyTime01{//extends object{
	int year;
	int month;
	int day;
	
	public  MyTime01() {
		
	}

	public MyTime01(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	
	
	//默认的equals方法
	/*
	public boolean equals(Object obj) {
		return(this == obj);
	
	*/
	}
	/*
		//重写object类的ecuals方法
		//怎么单写？复制粘贴。相同的返回值类型、相同的方法名、相同的形式参数列表
		public boolean equals(Object obj) {
		//当年相同，月相同，并且日也相同的时候，表示两个日期相同。两个对象相等
			//获取第一个日期的年月日
			int year1  =  this.year;
			int month1  = this.month;
			int  day1  = this.day;
			//获取第二个日期的年月日
			//int year2= obj.year; 错误 
			if(obj instanceof  MyTime01) {
				MyTime01 t = (MyTime01)obj;
				int year2 =t.year;
				int month2 = t.month;
				int day2 =  t.day;
				if(year1 == year2 && month1 == month2 && day1==day2) {
					return  true;
				}
			}
			
			
			//开始比对
			
		//程序能到这就代表日期不相等	
		return false;
			
			}
		
		*/
		
		
		/*
		//改良equals方法
	public boolean equals(Object obj) {
		//如果obj是空  直接返回false
			if(obj == null) {
				return false;
			}
			//如果ob不是一个MyTime，没必要比较了，直接返回false
			if(!(obj instanceof MyTime01)) {
				return false;
			}
			//如果this和obj保存的内存地址相同，没必要比较了，直接返回true。
			//内存地址相同的时候指向的堆内存的对象肯定是同一个，
			if(this == obj) {
				return true;
			}
			//程序能够执行到此处说明什么？
			//说明obj不是null，obj是MyTime类型。
			MyTime01  t = (MyTime01)obj;
			if(this.year == t.year && this.month ==  t.month && this.day == t.day) {
				return true;
			}
			//程序能到这里返回false
			return   false;
		}
		*/
	
		//再次改良
	/*
	public boolean equals(Object obj) {
		//如果obj是空  直接返回false
			if(obj == null) {
				return false;
			}
			//如果ob不是一个MyTime，没必要比较了，直接返回false
			if(!(obj instanceof MyTime01)) {
				return false;
			}
			//如果this和obj保存的内存地址相同，没必要比较了，直接返回true。
			//内存地址相同的时候指向的堆内存的对象肯定是同一个，
			if(this == obj) {
				return true;
			}
			//程序能够执行到此处说明什么？
			//说明obj不是null，obj是MyTime类型。
			MyTime01  t = (MyTime01)obj;
			return this.year == t.year && this.month ==  t.month && this.day == t.day;
			
		}
	*/
	
	//再次改良+1
	public boolean equals(Object obj) {
			if(obj == null  || !(obj instanceof MyTime01)) {
				return false;
			}
			if(this == obj) {
				return true;
			}
			MyTime01  t = (MyTime01)obj;
			return this.year == t.year && this.month ==  t.month && this.day == t.day;
	}
}	
		
		
		
	
