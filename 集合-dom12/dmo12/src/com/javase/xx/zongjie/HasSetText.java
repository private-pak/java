package com.javase.xx.zongjie;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetText {
/*
1.1、每个集合对象的创建（new）
1.2、向集合中添加元素
1.3、从集合中取出某个元素
1.4、遍历集合

 */
	public static void main(String[] args) {
		HashSet<String> set  = new HashSet<>();
		set.add("qwe");
		set.add("euqe");
		set.add("ad");
		
		//set集合中的元素不能通过下标取了。没有下标
		
		//遍历集合 迭代器
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----------");
		//遍历 foreach
		for(String s :set) {
			System.out.println(s);
		}
		
	}

}
