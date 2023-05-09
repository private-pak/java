package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 关于java.util.ColLection接口中常用的方法。
1、CoLLection中能存放什么元素？
没有使用“泛型"之前，ColLection中可以存储object的所有子类型。
使用了"泛型之后，CoLLection中只能存储某个具体的类型。
集合后期我们会学习"泛型”语法。目前先不用管。ColLection中什么都能存，
只要是object的子类型就行。（集合中不能直接存估基本数据类型，也不能存
java对象，只是存储java对象的内存地址。）
2、CoLLection中的常用方法
boolean add(object e)向集合中添加元素
int size(）获取集合中元素的个数
void  cLear()清空空集
boolean contains（Object  o）判断当前集合中是否包含元素0，包含返回true，不包含返回flase
booLean  remove（Object  o）删除集合中的某个元素
booLean  is Empty（）判断该集合中元素的个数是否为0
调用这个方法可以把集合转换成数组【作为了解，使用不多。
Object[]to Array()调用这个方法可以把集合转换成数组

 */
public class CollectionText01 {

	public static void main(String[] args) {
		//创建一个集合对象
		//Collection c = new Collection(); 接口是抽象的 无法实例化
		//多态
		
		Collection c = new ArrayList();
		
		//测试coLLection接口中的常用方法
		c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。Integer × = newInteger(1200）
		c.add(c);
		c.add(true);
		c.add(new Studt());
		c.add("e");
		
		//获取集合中元素个数
		System.out.println("集合元素的个数 "+ c.size());//4
		
		//清空集合
//		c.clear();
//		System.out.println("集合元素的个数 "+ c.size());//0
		
		//判断集合中是否包含e
		boolean flay   = c.contains("e");
		System.out.println(flay);//true
		
		boolean flay2   = c.contains("e3");
		System.out.println(flay2);//false
		
		//删除集合某一个元素
		c.remove("e");
		System.out.println("集合元素的个数 "+ c.size());//4
		
		
		//判断集合是否为空
		System.out.println(c.isEmpty());//false
		c.clear();//清空元素
		System.out.println(c.isEmpty());//true(true 表示集合里面没有元素 )
		System.out.println("------------------------");
		
		c.add("asd");
		c.add("fgh");
		c.add(100);
		c.add("hell");
		
		//转换成数组
		Object[] objs= c.toArray();
		//遍历数组
		for (int i = 0; i < objs.length; i++) {
			
			Object o  =  objs[i];
			System.out.println(o);
		}
	}

}
class Studt{
	
}


