package com.bjpowernode.javase.text002;



public class Text {
/*
 * 多态在实际开发中的作用，以下以主人喂养宠物为例说明多态的作用
	1、分折：主人喂养宠物这个场景要实现需要进行类型的抽象：
		主人【类】
			主人可以喂养宠物，所以主人有喂养的这个动作
		宠物【类】
			宠物可以吃东西，所以宠物有吃东西的这个动作
		面向对象编程的核心：定义好类，然后将类实例化为对象，给一个环境驱使一下，让各个对象之间协作起来形成一个系统
	3.多态的作用是什么？
			降低程序的揭合度，提高程序的扩展力。
			能使用多态尽量使用多态。
			父类型引用指向子类型对象。

	核心：面向抽象编程，尽量不要面向具体编程。

	
 */
	public static void main(String[] args) {
		//创建主人对象
//		Master zhangsan = new Master();
//		//创建猫对象
//		Cat  tom = new Cat();
//		//主人喂猫
//		zhangsan.feed(tom);
//		//创建小狗对象
//		Dog erha  =  new  Dog();
//		zhangsan.feed(erha);
		
		Master zhangsan = new  Master();
		zhangsan.feed(new  Cat());
		zhangsan.feed(new Dog());
		//创建蛇对象 
		Snake  mangshe  =  new Snake();
		zhangsan.feed(mangshe);
		//创建龙对象
		Dragon longL =  new Dragon();
		zhangsan.feed(longL);
	}

}
