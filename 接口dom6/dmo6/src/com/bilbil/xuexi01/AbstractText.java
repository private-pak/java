package com.bilbil.xuexi01;

/*
 * 面试题（判断题）：java语言申凡是没有方法体的方法都是抽象方法，
					不对，错误的。
					
	object类中就有很多方法都没有方法体，都是以"；"结尾的，但他们都不是抽象方法，例如：

	publicnative int hashCode();
	这个方法底层调用了C++写的动态链接库程序。前面修饰符列表中没有：abstract。有一个native.表示调用JVM本地程序。I
 */

/*
 * 类到对象是实例化。对象到类是抽象。
抽象类：
		1、什么是抽象类？
			类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类，
			类本身是不存在的，所以抽象类无法创建对象《无法实例化》：
		2、抽象类属于什么类型？
			抽象类也属于引用数据类型，
		3、抽象类的定义：
			【修饰符列表】abstract class 类名{
				类体;
			}
		4、抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
		5、final和abstract不能联合使用，这二个关键字是对立的 
		6、抽象类的子类可以是抽象类
		7、抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。

1、抽象类
第一：抽象类怎么定义？.在class前添加abstract关键字就行了，
第二：抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
第三：final和abstract不能联合使用，这两个关键字是对立的。
第四：抽象类的子类可以是抽象类。也可以是非抽象类。
第五：抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
第六：抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
第七：抽象方法怎么定义？
		public,abstract void dosome():
第八：一个非抽象的类，继承抽象类，必须将抽象类中的抽象方法覆盖/重写，或者也可以叫做"实现"。
 * 
 */
public class AbstractText {
	public static void main(String[] args) {
		//Account act = new = Account();错误Accent是抽象的；无法 实例化

	}

}
//银行账户类
abstract  class Account{
//	public Account() {}
//		public Account(String s) {
//	}
	
	//抽象方法
	public abstract void with();
	//非抽象方法
	//public void dosem() {}
	}




/*
 
final abstract  class Account{
}
*/
//子类继承抽象类 子类可以实例对象
abstract class CreditAccount extends Account{
	public  CreditAccount() {
		super();
	}
	
}
