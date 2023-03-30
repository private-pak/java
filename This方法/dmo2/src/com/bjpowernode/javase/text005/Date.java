package com.bjpowernode.javase.text005;

/*
 * 定义日期类型
 * 		this可以用在那里：
 * 			1.可以使用在实例方法当中，代表当前对象【语法：this.】
 * 			2.可以使用在构造方法当中，通过当前的构造 方法调用其他的构造方法 【语法：this（实参）】
 * 注：
 * 		this（）这种语法只能出现在构造函数第一行
 * 		
 */
public class Date {
//属性
	private int year;
	private int month;
	private int daty;

	// get / set 方法
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDaty() {
		return daty;
	}

	public void setDaty(int daty) {
		this.daty = daty;
	}

	// 有参 构造函数

	/*
	 * 在调用无参的构造方法 的时候，默认创建日期是 1970-1-1
	 */

	public Date(int year, int month, int daty) {

		this.year = year;
		this.month = month;
		this.daty = daty;
	}

	// 无参 构造函数
	public Date() {
		/*
		 * this.year = 1970; this.month = 1; this.daty = 1;
		 */
		// 以上代码可以通过调用另一个构造方法来完成
		// 但是前提是不能创建新的对象，以下代码创建了一个全新的对象
		// new Date(1970, 1, 1);

		/*
		 * 需要采用以下这种语法来完成构造方法的的调用 这种方法不会创建新的java对象，但同时又可以达到调用其他的构造方法
		 */
		this(1970, 1, 1);
		//System.out.println(this.year + "年" + this.month + "月" + this.daty + "日");

	}

	// 对外提供一个 方法可以将日期打印输出到 控制台

	public void print() {
		System.out.println(this.year + "年" + this.month + "月" + this.daty + "日");
	}
}
