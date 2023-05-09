package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 关于集合遍历/迭代专题
 */
public class CollectionText02 {

	public static void main(String[] args) {
		//注意：以下讲解的逼历方式/选代方式，是所有ColLection通用的一种方式。
		//在Map集合中不能用。在所有的ColLection以及子类中使用。
		//创建集合对象
		Collection  c = new ArrayList<>();
		//添加元素
		c.add("asd");
		c.add(100);
		c.add(100);
		c.add(100);
		c.add(100);
		c.add("fgh");
		c.add(new Object());
		
		//对集合coLLection进行遍历/送代
		//第一步：获取集合对象的送选代器对象Iterator
		Iterator itr = c.iterator();
		/*第二步：通过以上获取的选代器对象开始选代/遍历集合。
		 * 
		 * 以下两个方法是选代器对象Iterator中的方法：
		 * 
		booLean   hasNext（）如果仍有元素可以选代，则返回true。
		Object next（）返回送代的下一个元素。
		*/
//		boolean   hasNext = itr.hasNext();
//		System.out.println(hasNext);
//		if(hasNext) {
//			//不管你当初存进去什么，取出来统一都是object。
//			Object  obj=itr.next();
//			System.out.println(obj);
//		}
//		
//		boolean   hasNext1 = itr.hasNext();
//		System.out.println(hasNext1);
//		if(hasNext1) {
//			//不管你当初存进去什么，取出来统一都是object。
//			Object  obj=itr.next();
//			System.out.println(obj);
//		}
		
		while(itr.hasNext()) {
			Object  obj=itr.next();
			System.out.println(obj);
		}
		
	}

}
