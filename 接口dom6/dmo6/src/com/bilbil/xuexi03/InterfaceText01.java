package com.bilbil.xuexi03;

public class InterfaceText01 {

	public static void main(String[] args) {
		System.out.println(Mymath.PI);//3.14515926
		//能使用多态阿？
		//new Mymath();//错误：Mymath是抽象的；无法实例化
		
		//修正 父类调用指向子类
		Mymath mm = new MyUID();
		
		//调用接口里面的方法（面向接口编程。）
		int return1 = mm.sum(10, 20);
		System.out.println(return1);
		int retut2 = mm.summ(20, 30);
		System.out.println(retut2);
	}

}

/*
 * 接口的基础语法：
		1、类和类之间叫做继承，类和接口之间叫做实现
		别多想：你仍然可以将！实现看做 继承 。
		继承使用  extends  关键字完成
		实现使用  implements  关键字完成。
		五颗星（*****）：当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖、重写）
		接口的使用离不开多态机制

 */




interface Mymath {//特色的抽象类  完全抽象的 叫接口
	double PI = 3.14515926;

	int sum(int a, int b);

	int summ(int a, int b);
}
/*
编写一个类（这个类是一个非抽象的类）
这个类的名字是随意的。
*/
/*这样没错
abstract class MyUID implements Mymath {
	
}
*/
//错误：MyMathImp1不是抽象的，并且未覆盖MyMath中的抽象方法sub（int，int）
/*
class MyUID implements Mymath {
	
}
*/

//修正
class MyUID implements Mymath {

	//错误：正在尝试分配更低的访问权限；以前为public
	/*
	int summ(int a, int b) {
		return a-b;
	*/

	//重写/覆盖/实现 接口
	public int sum(int a, int b) {
		
		return a+b;
	}
	public int summ(int a, int b) {
		//a=1;b=2;错误在上面调用方法 赋值
		return a-b;
	}
	
	
}



