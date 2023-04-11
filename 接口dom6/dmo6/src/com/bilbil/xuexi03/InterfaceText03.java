package com.bilbil.xuexi03;

public class InterfaceText03 {
	/*
	 * 继承和实现都存在的话，代码应该怎么写？
	 * extends在前 implements 在后
	 */
	public static void main(String[] args) {
		Flyable f  = new Cat();//多态
		f.fly();
		
		Flyable f1  = new Pig();
		f1.fly();

		Flyable  f3 = new Fish();
		f3.fly();
	}
}
//动物类 父类
class Animal{
	
}
//动物类 子类
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变的可以飞

class Cat  extends Animal implements Flyable{

	@Override
	public void fly() {
		System.out.println("星猫,翱翔太空的一只猫;很神奇吧;我也许,我也能当一只猫");
		
	}
	
	
}

interface  Flyable{
	void fly();
}

//蛇类，如果你不想让它飞，可以不实现Flyable接口
//没有实现这个接口表示你没有翅膀，没有给你插翅膀，你肯定不能飞
class Snake  extends Animal{
	
}
class  Pig extends Animal implements Flyable{

	@Override
	public void fly() {
		System.out.println("飞🐖加上翅膀的天蓬元帅");
		
	}
	
}

/*
//鱼类 (默认实际上是存在继承的，默认继承 Object)
class Fish  extends Object implements  Flyable{

	@Override
	public void fly() {
		System.out.println("鲱鱼罐头");//鲱鱼罐头
		
	}
	
}
*/

class Fish  implements  Flyable{

	@Override
	public void fly() {
		System.out.println("鲱鱼罐头");//鲱鱼罐头
		
	}
	
}










