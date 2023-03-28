package text005;
/*
 * java类中构造方法
 * 		- 构造 方法又称构造函数、构造器、Constructor
 * 		- 构造方法的语法 
 * 			.【修饰符列表】 构造方法名（形式参数列表）{
 * 				构造方法体；
 * 			}
 * 		普通方法的语法构成：
 * 			【修饰符列表】 返回类型  方法名 （形式 参数列表 ）{
 * 					方法体；
 * 			} 
 * 	对于 构造方法来说“返回值类型”不需要指定，并且也不能 写 void
 * 	只要写void那么这个 方法就变成普通方法了
 * 
 * 对于构造方法来说 构造方法的方法名必须和类 名一致；
 * 	构造方法的作用：
 * 		构造方法的意义是通过构造方法的调用 ，可以创建对象
 * 	构造方法的调用：
 * 		- 普通方法是：方法修饰符有static的时候 类名.方法名（实参列表 ）
 * 			·-没有static的时候  引用.方法名（实参列表）
 * 		-  new 构造方法（实参列表）
 * 	每一个构造方法都有 返回值 但是“return的值 这种不要
 * 并且返回 值 类型是  构造方法 所在的类型，由于构造方法的返回值类型结束类本身，所以返回值不需要类型不需要编写
 *	
 * 	注释和取消注释 ctrl  +  /,多行注释 ctrl + shift + /
 * 
 * 	当一个类没有定义任何构造方法的话，系统默认给该类一个无参数 的构造方法，这个构造方法被称为缺省构造器
 */
//131

public class Constructortext01 {

	public static void main(String[] args) { // TODO 自动生成的方法存根

		// System.out.print("123");

		// 调用user类的构造方法 来 完成对象的创建 
		User u = new User();
		User u1 = new User(10);
		User u2 = new User("你好");
		User u3 = new User(10,"你不好");
		
		Constructortext01.do1();//do some
		do1();//do some
		
		Constructortext01 dddd  = new Constructortext01();
		dddd.do2();//do2 some2

	}
	private static void do1() {
		System.out.println("do some");
		
	}
	public void do2() {
		System.out.println("do2 some2");

	}
	

}
