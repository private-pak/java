package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * //注意：此时获取的送代器，指向的是那是集合中没有元素状态下的送代器。
//一定要注意：集合结构只要发生改变，选代器必须重新获取。
//当集合结构发生了改变，送代器没有重新获取时，调用next（)方法时：java.util.ConcurrentModificationException
	
	重点：在送代集合元素的过程中，不能调用集合对象的remove方法，删除元素：
	c.remove(obj2)；送代过程中不能这样。
	
	重点：在选代元素的过程当中，一定要使用送代器Iterator的remove方法，删除元素，
	不要使用集合自带的remove.方法删除元素。


 */

public class CollectionText06 {
	
	public static void main(String[] args) {
		Collection c  = new ArrayList();
		
		Iterator it = c.iterator();
		
		
		c.add("100");
		c.add("200");
		c.add("300");
		
		//迭代器
	//	Iterator it = c.iterator();
	/*	while (it.hasNext()) {
			
			Object obj = it.next();
			System.out.println(obj);
		}
		*/
		
		
/*		Collection cc = new  ArrayList();
		cc.add("WE");
		cc.add("WE");
		cc.add("WE");
		cc.add("WE");
		cc.add("WE");
		
		Iterator it2 = cc.iterator();
		while(it2.hasNext()) {
			Object obj2 = it2.next();
			System.out.println(obj2);
		}
	这个是没问题的
	
	*/
	
	
	
	Collection cc = new  ArrayList();
	cc.add("WE");
	cc.add("WE");
	cc.add("WE");
	cc.add("WE");
	cc.add("WE");
	
	Iterator it2 = cc.iterator();
	while(it2.hasNext()) {
		Object obj2 = it2.next();
		//删除元素
		//除元素之后，集合的结构发生了变化，应该重新去获取送代器
		//但是，循环下一次的时候并没有重新获取送代器，所以会出现异常：
		//java.util.ConcurrentModificationException
		//cc.remove(obj2);
		
		//使用迭代器删除
		it2.remove();  //删除的一定是选代器措向的当前元素。
		System.out.println(obj2);
	}
	System.out.println(cc.size());//0
}
	
}
