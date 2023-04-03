package com.bjpowernode.javase.text002;
/*
 * 主人类 
 */
public class Master {
	/*
	 * 喂养宠物
	 */
	/*
	 * 这种方式没有使用java语言当中的多态机制，存在的缺点：Master的扩展力很差，因为只要加一个新的宠物，Maste类就需要添加新的方法

	 */
	/*
	public void feed(Cat c) {
		c.eat();
	}
	public void feed(Dog d) {
		d.eat();
	}
*/
	
	//提高程序的扩展力.
	
	//Master主人类面向的是一个抽象的Pet，不再面向具体的宠物
	//提侣：面向抽象编程，不要面向具体编程。
	//面向抽象编程的好处是，耦合度低，扩展力强
	public void feed(Pet pet) {//Pet  pet 是一个父类型
		pet.eat();
	}
	
}
