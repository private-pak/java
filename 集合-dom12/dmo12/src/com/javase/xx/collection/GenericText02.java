package com.javase.xx.collection;

import java.util.TreeSet;

public class GenericText02 {
/*
1、TreeSet集合底层实际上是一个TreeMap
2、TreeMap集合底层是一个二叉树。
3、放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了。
4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序。
称为：可排序集合。

 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet<String> tsg = new TreeSet<>();
		tsg.add("张三");
		tsg.add("李四");
		tsg.add("吉阿达");
		
		//遍历
		for(String s:tsg) {
			//按照字典顺序  升序
			System.out.println(s);
		}
		
		TreeSet<Integer> tsg2 = new TreeSet<>();
		tsg2.add(125);
		tsg2.add(5493);
		tsg2.add(81);
		
		for(Integer elt : tsg2) {
			//升序
			System.out.println(elt);
		}
	}

}
