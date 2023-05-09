package com.javase.xx.collection;

import java.util.Set;
import java.util.TreeSet;


/*
 * TreeSet集合存储元素特点：
 * 
	1、无序不可重复的，但是存估的元素可以自动按照大小顺序排序！
		称为：可排序集合。
		
	2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同。并且没有下标。
 */
public class HashSet {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Set<String> strg= new TreeSet<>();
		strg.add("A");
		strg.add("Y");
		strg.add("C");
		strg.add("D");
		strg.add("E");
		//遍历
		for(String s:strg) {
			System.out.println(s);
			/*
			 * A
			   C
               D
               E
			   Y
			   从小到大
			 */
		}
		
	}

}
