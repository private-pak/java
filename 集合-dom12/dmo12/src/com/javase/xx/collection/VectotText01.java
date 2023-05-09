package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * Vector :
1、底层也是一个数组。

2、初始化容量：10

3、怎么扩容的？
	扩容之后是原容量的2倍。
	10--> 20 --> 40 --> 80
4、ArrayList集合扩容特点：
	ArrayList集合扩容是原容量1.5倍。
	
5、Vector中所有的方法部是线程同步的，部带有synchronized关键宇，
		是线程安全的。效率比较低，使用较少了。
		
6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？

使用集合工具类：
		java.util.ColLections;
		java，utiL.ColLection是集合接口。

 */
public class VectotText01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//Vector vector = new Vector<>();
		List vector  = new Vector<>();  //推荐这个
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		vector.add(10);
		//满了之后扩容（扩容之后的容量是20.）
		vector.add(11);

		Iterator it = vector.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//这个可能以后要使用！！！！
		List mylist = new ArrayList<>();//非线程安全的。
		//变成线程安全的
		Collections.synchronizedList(mylist);
		
		//myList集合就是线程安全的了。
		mylist.add("100");
		mylist.add("200");
		mylist.add("300");
		mylist.add("400");
		
	}

}
