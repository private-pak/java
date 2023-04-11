package com.bilbil.xuexi01;

public class AbstactText01 {
		public static void main(String[]arg) {
			//使用多态  父类引用指向子类对象
			Animal a = new Bird();//向上转型
			a.move();//11111
			Animal  c =  new Cat();
			c.move();
		}

}
//动物类
abstract class Animal{
	//抽象方法
  abstract	public void  move();
	
}
//子类  非抽象
/*错误：Bird不是抽象的，并且未覆盖Animal中的抽象方法move（)

 class Bird extends Animal{
	//public abstract void move();
	 
	*/ 
	//需要将从父类中继承过来的抽象方法进行覆盖/重写，或者也可以叫做"实现"。
	//把抽象的方法实现了。 
 class Bird extends Animal{
	public  void move(){
		System.out.println("鸟儿");
		
	}
	 
}
 class Cat extends Animal{
	 public void move() {
		 System.out.println("猫猫");
	 }
 }