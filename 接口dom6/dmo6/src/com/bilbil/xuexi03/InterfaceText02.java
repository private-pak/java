package com.bilbil.xuexi03;

public class InterfaceText02 {
/*
 * 接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？
			对于计算机来说，一个机箱上有多个接口，一个接口是接键盘的，个接口是接鼠标的，一个接口是接电源的，一个接口是接显示器的
	重点（五颗星****）：一个类可以同时实现多个接口.
	这种机制弥补了java中的哪个缺陷？
		java中类和类只支持单继承。实际上单继承是为了简单而出现的，现实世界中存在多继承，Java中的接口弥补了单继承带来的缺陷，

 */
	public static void main(String[] args) {
		//多态该怎么用 
		//都是父类引用指向子类
		A a =new D();
		B b =new D();
		C c =new D();
		
		A a1 = (A)b;
		a1.m1();
		
		B b2 = (B)a;
		b2.m2();
		
		C c3 = (C)a;
		c3.m3();
		System.out.println("----------------------");
		//向下转型D
		D d  =(D)a;
		d.m1();
		d.m2();
		d.m3();
		
		/*
		M m = new E();
		K k  = (K)m;//经过测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。但是一定要注意，运行时可能会出现class cast Exception异常。
		*///编译没问题 运行有问题
		M m = new E();
		if(m instanceof  K) {
			K k = (K)m;
		}
	}

}
interface K{}

interface M{}

class E implements M{
	
}
//-----------------------------------
/*
interface X{}

interface Y{}

interface Z extends X,Y{接口和接口支持多继承。	
}
*/
//------------------------------------
interface A{
	void m1();
}
interface B{
	void m2();
}
interface C{
	void m3();
}
 class D implements  A,B,C{
//实现A B  C 接口的m1-3();
	@Override
	public void m3() {
		// TODO 自动生成的方法存根
		System.out.println("m3-------");
		
	}

	@Override
	public void m2() {
		// TODO 自动生成的方法存根
		System.out.println("m2-------");
	}

	@Override
	public void m1() {
		// TODO 自动生成的方法存根
		System.out.println("m1-------");
	}
	
}