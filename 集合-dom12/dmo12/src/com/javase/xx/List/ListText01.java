package com.javase.xx.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * 测试list接口的常用方法
 * 1、List集合存储元素特点：有序可重复
		有序：List集合中的元素有下标。
		从0开始，以1递增。
		可重复：存储一个1，还可以再存储1
		
2、List既然是coLLection接口的子接口，那么肯定List接口有自已"特色"的方法：
			以下只列出List接口特有的常用的方法：
			
			void.add(int index, Object element)
			Object get(int index)
			int indexOf(object o)
			int LastIndexof(object o)
			Object remove(int index)
			Object set(int index, Object element)


 * 			
 */
public class ListText01 {
	public static void main(String[] args) {
		//创建list集合
		 // List mylist = new LinkedList<>();
		// list mylist  = new Vector<>();
		
		
		List mylist = new ArrayList();	
			//添加元素
		mylist.add("A1");
		mylist.add("A2");
		mylist.add("A3");
		mylist.add("A4");
		mylist.add("A3");
		mylist.add(1,"B2");//这里的1是下标 //在指定下标 末尾插入元素  //使用较低
		
		
		//迭代
		
		Iterator it1 = mylist.iterator();
		while(it1.hasNext()) {
			Object obj1 = it1.next();
			System.out.println(obj1);
					
		}
		
		System.out.println("---------------");
		//根据下标获取元素
		Object fisobj= mylist.get(1);
		System.out.println(fisobj);
		System.out.println("---------------");
		
		
		for (int i = 0; i < mylist.size(); i++) {
			Object obj2 = mylist.get(i);
			System.out.println(obj2);
		}
		System.out.println("---------------");
		
		//获取指定对象第一次出现的 索引
		System.out.println(mylist.indexOf("B2"));//1
		System.out.println("---------------");
		
		//获取指定对象最后一次出现处的索引。
		System.out.println(mylist.lastIndexOf("A3"));//5
		System.out.println("---------------");
		
		//删除指定下标位置的元素
		mylist.remove(2);
		System.out.println(mylist.size());
		System.out.println("---------------");
		
		//修改指定位置的元素
		mylist.set(1, "B3");
		for (int i = 0; i < mylist.size(); i++) {
			Object obj3 = mylist.get(i);
			System.out.println(obj3);
		}
		//680
	}
}
/*
 * 计算机英语：
增删改查这几个单词要知道：
		增：add，save、new
		
		删: deLete.drop、remove
		
		改：update，set，modify
		
		查: find，get、query、select

 * 
 * 
 * 
 */


