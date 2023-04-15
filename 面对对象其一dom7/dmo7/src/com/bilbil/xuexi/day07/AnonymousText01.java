package com.bilbil.xuexi.day07;

public class AnonymousText01 {
/*
 * 匿名内部类：
		1、什么是内部类？
			内部类：在类的内部又定义了一个新的类。被称为内部类。
			
		2、内部类的分类：
			静态内部类：类似于静态变量
			实例内部类：类似于实例变量
			局部内部类：类似于局部变
		3、使用内部类编写的代码，可读性很差：能不用尽量不用，
 * 
 */
//	public static void main(String[] args) {
//		
//
//	}


/*
class Text1{
	//该类在类的内部，所以称为内部类
	////由于前面有static，所以称为静态内部类"
	static  class Inner01{
		
	}
	//该类在类的内部，所以称为内部类
	//没有static叫做实例内部类。
	class  Inner02{
		
	}
	public void dosme() {
		//局部变量
		int i  = 100;
		//该类在类的内部，所以称为内部类
		//局部内部类
		class Inner03
		{
			
		}
	}
	
	public void doOther() {
		//dosme（）方法中的局部内部类Inner3，在doother（)中不能用


	}
	*/
	public static void main(String[] args) {
		/*
			//调用MyMath中的mysum方法
		MyMath mm =  new MyMath();
		Compute cc =  new ComputeImpl();
		mm.Mysum(cc, 100, 100);
		
		//也可以怎么写
		MyMath mm01 =  new MyMath();
		mm01.Mysum(new ComputeImpl(), 1, 1);
	*/
		
		////使用置名内部类，表示这个ComputeImp1这个类没名字了，
		//这里表面看上去好像是接口可以直接new了，实际上并不是接口可以new了
		//后面的{}代表了对接口的实现。
		//不建议使用匿名内部类，为什么？
		//因为一个类没有名字，没有办法重复使用。另外代码太乱，可读性太差
		
		MyMath mm01 =  new MyMath();
		mm01.Mysum(new Compute() {
			public int sum(int a, int b) {
				
				return a+b;
			}
		}, 10, 10);
	
	
	}

	
	
}

//接口 负责计算
interface Compute{
	//抽象方法
	int sum(int a,int b);
}

/*
//你自动会在这里编写一个Compute接口的实现类
class ComputeImpl implements Compute{
	//方法的实现
	public  int sum(int a,int b) {
		return a+b;
	}
}

*/

//数学类
class MyMath{
	//数学求和
	public void Mysum(Compute m,int x, int y) {
		int retValue = m.sum(x, y);
		System.out.println(x+"+"+y+"="+retValue);
	}
}








