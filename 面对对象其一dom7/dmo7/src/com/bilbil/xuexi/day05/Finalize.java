package com.bilbil.xuexi.day05;

public class Finalize {
/*
 *  1、在object类中的源代码：
		protected void finalize()throws  Throwable{}
    2、finalize)方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。
    3、这个方法不需要程序员手动调用，JVM的垃坡回收器负责调用这个方法。
    4、finalize()方法的执行时机：
     	当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize()方法
	5、finalize)方法实际上是suN公司为java程序员准备的一个时机，垃圾销毁时机，
	如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize)方法当中，
	静态代码块的作用是什么？
	6、static{
	******
	*}
		静态代码块在类加载时刻执行，并且只执行一次，
	这是一个SUN准备的类加载时机，
		finalize)方法同样也是suN为程序员准备的一个时机.
		这个时机是垃圾回收时机
 */
	public static void main(String[] args) {
		/*
		//创建对象
		Person pn = new Person();
		//person 怎么回收
		pn = null;
		*/
		//多造点垃圾
		/*for(int i = 0;i < 1000;i++) {
			Person pn = new Person();
			pn  = null;
		}
		*/
		for(int  i = 0;i < 1000;i++) {
			Person pn = new Person();
			pn = null;
		if(i  % 3  == 0) {
			System.gc();
		}
	}

	}
}


/*
 * 	项目开发中有这样的业务需求：所有对象在V中被释放的时候，请记录一下释放时间！！！
	记录对象被释放的时间点，这个负责记录的代码写到哪里？
	写到finalize()方法中.

 */
class Person{
	
	protected void finalize() throws Throwable{
		// 重写finalize方法
		//Person类型的对象被垃圾回收器回收的时候，垃圾回收器负责调用：P.finalize()；
		System.out.println(this +" "+ "马上  注销!");
		
		
		
		}

	
	
	
	
	
	
}