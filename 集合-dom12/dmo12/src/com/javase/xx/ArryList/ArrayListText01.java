package com.javase.xx.ArryList;

import java.util.ArrayList;
import java.util.List;


/*
 * ArrayList集合：
1、默认初始化容量10（底层先创建了一个长度为的数组，当添加第一个元素的时候，初始化容量10。

2、集合底层是一个object[]数组。

3、构造方法：
	newArrayList();
	newArrayList(20);
	
	5、数组优点：  
	
 检索效率比较高。
   数组缺点：

随机增删元素效率比较低。
向数组未尾添加元素，效率很高，不受影响。

面试官经常问的一个问题？

这么多的集合中，你用哪个集合最多？
	答：ArrayList集合。

 */
public class ArrayListText01 {
	
	public static void main(String[] args) {
		
	
	//默认初始化容量是10
	List list1= new ArrayList();
	
	
	//指定初始化容量
	List list2 = new ArrayList(20);
			
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	list1.add(1);
	
	System.out.println(list1.size());
	
	
	list1.add(1);

	}
	
}
