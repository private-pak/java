package com.bilbil.xuexi02;
/*
 * 接口
 * 	接口也是一种 引用数据类型
	1.接口是完全抽象的。
	2、（插象卖是半抽象。）或者也可以说要口是特殊的抽象类，
	3、接口怎么定义，语法是什么？
		【修饰符列表】interface 接口名{}
	4、接口可以支持多继承 ，一个接口可以继承多个接口27
	5、接口中包含两部分：
		接口中只包含两部分内容，
			一部分是：常量。
			一部分是：抽象方法。接口中没有其它类
		接口中所有的元素都是public修饰的。，（都是公开的。）
	7、接口中的抽象方法定义时：publiaabstrapt修饰符可以省略
	8、接口抽象方法不能带有主体
	9、接口中的 常量 publuc static final 可以省略
 * 
 * 
*/
public class JiekouText {
	public static void main(String[] args) {
		
	
		//访问接口常量
		System.out.println(Mymath.PI);
		//Mymath.PI=1111;  错误无法为最终 变量pi分配值
		
		System.out.println(Mymath.K);
		System.out.println(Mymath.JIekou);
		
	}
}
//定义接口 生成 class 文件
interface A{
	
}
//定义接口 接口支持继承
interface B  extends A{
	
}
//定义接口 接口可以支持多继承 ，一个接口可以继承多个接口
interface C extends A,B{
	
}
//数学接口
interface Mymath{
	//常量
	public static final String JIekou = "对外界的";
	//publuc static final 可以省略嘛？
	double PI  = 3.1415926;
	int K = 100;
	
	//抽象方法
	//public abstract int sum(int a,int b);
	//接口当中既然都是抽象方法，那么在编写代码的时候，public abstract可以省略吗？
	int sum(int a,int b);
	
	//接口申的方法可以有方法体吗？
	//错误：接口抽象方法不能带有主体
/*	void dosmeo() {
		
	}
	*/
	
	int  subb(int a,int b);
	
}