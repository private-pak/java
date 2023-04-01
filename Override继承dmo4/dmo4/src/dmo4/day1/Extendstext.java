package dmo4.day1;

public class Extendstext {
/*
 * 测试类
 * 关于 java语言的继承
 * 		1.继承是面向对象的三大特征之一。三大特征：封装.继承.多态
 * 		2.继承"基本"的作用是：代码复用。但是继承 最重要的作用是：有了继承才有了以后的"方法的覆盖 和 多态机制"
 * 		3.继承语法格式：
 * 			【修饰符列表】 class 类名 extends 父类名{
 * 					类体 = 属性 + 方法 
 * 				}
 * 		4. java语言当中的继承只支持单继承，一个类不能同时继承很多类，只能继承一个类
 * 		5.关于 继承中的一写术语：
 * 			A类称为：父类、基类、超类、superclass
 * 			B类称为：子类、派生类、subclass
 * 		6.在java语言当中子类继承父类都继承那些数据
 * 			- 私有的不支持继承 
 * 			- 构造方法不支持继承
 * 			- 其他数据都可以继承
 * 		7.虽然java语言当中只支持单继承，但是一个类也可以间接继承其它类：
 * 			C 类 extens B类{
 * 			}
 * 			B 类 extens A类{
 * 			}
 * 			A 类 extens T类{
 * 			}
 * 			c直接继承b类,但是c类间接继承T A类
 * 
 */
	public static void main(String[] args) {
		Extendstext et = new  Extendstext();
		String s =et.toString();
		System.out.println(s);//dmo4.day1.Extendstext@626b2d4a
		
		CreditAccount cat   = new CreditAccount();
		cat.setActno("cat---112");
		cat.setBalance(-1000);
		cat.setCredit(0.991);
		
		System.out.println(cat.getActno()+"."+cat.getBalance()+"."+cat.getCredit());
		
		
		
	}

}
