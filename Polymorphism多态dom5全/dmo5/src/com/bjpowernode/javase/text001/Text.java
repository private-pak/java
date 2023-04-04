package com.bjpowernode.javase.text001;

/*
 * 关于java语言当中的多态
 * 		1.Animal、Cat、Bird三个类之间的关系：
 * 				Cat继承Animal
 * 				Bird继承Animal
 * 				Cat和Bird之间没有任何继承关系
 * 		2.关于多态中涉及几个概念：
 * 				*向上转型（upcasting)
 * 					子类型--》父类型
 * 						
 *   			*向下转型（downcasting）
 * 					父类型--》子类型
 * 		3.java规范要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免出现java.lang.ClassCastException
 */
public class Text {

	public static void main(String[] args) {
		//之前的方法---dmo4
		Animal a1 =  new Animal();
		a1.move();
		Cat c1 = new Cat();
		c1.move();
		Bird b1 = new Bird();
		b1.move();
		
		//使用多态语法机制
		/*
		 * 1.Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
		 * 2.new Cat（）创建的对象类型是Cat，a2这个引用的数据是Animal，可见他们可以 进行类型转换
		 * 3.子类转型成父类.向上转型/upcasting
		 */
		Animal a2 =  new Cat();//向上转型
		a2.move();
		
		Cat c2 = (Cat)a2;
		c2.catchMomuse();//向下转型
		
		Animal a3 =  new Bird();
		a3.move();
		//Cat c3 =  (Cat)a3;
		//程序虽然编译通过了，但是程序在运行阶段会出现异常，因为jvm堆内存，当中真实存在的对象是Bird类型，Bird对象无法转换Cat因为没有任何继承关系/java.lang.ClassCastException这种经常出现在向上转型
		if(a3 instanceof  Cat) {
			Cat c3 = (Cat)a3;
			c3.catchMomuse();
		}else if(a3 instanceof Bird) {
			Bird  b2 = (Bird)a3;
			b2.fly();
		}
		

	}

}
