package com.bilbil.xuexi.day04;

public class Text01 {

	public static void main(String[] args) {
		Mytime  t1 = new  Mytime(1991,1,1);
		String s1 = t1.toString();
		//一个日期对象转换成 字符串形式 我更希望看到具体的日期
		
		//Mytime类重写toString()方法之前
		System.out.println(s1);//Mytime@十六机制 Mytime@5e91993f
		
		//Mytime类重写toString()方法之后
		System.out.println(s1);
		
		System.out.println(t1.toString());//也可以怎么写直接 调用t1的toString方法
		
		System.out.println(t1);//注意：输出引用的时，会自动调用该引用的tostring()方法。

		
	}

}
class Mytime{
	int year;
	int month;
	int day;
	
	public  Mytime() {
		
	}

	public Mytime(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	


/*
	重写tostring()方法
	这个tostring(方法怎么重写呢？
	越简洁越好，可读性越强越好。
	向简洁的、详实的、易阅读的方向发展
*/

public String toString() {
	return this.year+"年"+this.month+"月"+this.day+"日";
}
}
















