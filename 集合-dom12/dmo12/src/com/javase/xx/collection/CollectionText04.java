package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 深入ColLection集合的contains方法：
boolean contains(Object o)

			判断集合中是否包含某个对象。
			如果包含返回true，如果不包含返回false。
			
contains方法是用来判断集合中是否包含某个元素的方法
			那么它在底层是怎么判断集合中是否包含某个元素的呢？
					调用了equals方法进行比对。
					equals方法返回true，就表示包含这个元素。

 */
public class CollectionText04 {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		
		String s1 = new String("adad");
		c.add(s1);
		
		String s2 = new String("jkl");
		c.add(s2);
		
		String s3 = new String("147");
		c.add(s3);
		//...
		
		//集合的元素的个数
		System.out.println("该集合的元素是"+c.size());//3
		
		//创建新对象string
		String x = new String("adad");
		//c集合是否包含x
		
		System.out.println(c.contains(x));//true


	}//674

}
