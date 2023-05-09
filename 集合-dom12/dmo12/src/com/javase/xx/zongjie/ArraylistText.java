package com.javase.xx.zongjie;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistText {
/*
1.1、每个集合对象的创建（new）
1.2、向集合中添加元素
1.3、从集合中取出某个元素
1.4、遍历集合

 */
	public static void main(String[] args) {
		//创建Arraylist集合
		ArrayList<String> list = new ArrayList();
		//添加元素
		list.add("111");
		list.add("ewq1");
		list.add("asD");
		//取个某个元素
		//list集合是有下标的
		String  firstElt = list.get(0);
		System.out.println(firstElt);
		
		//遍历 下标方式
		for (int i = 0; i < list.size(); i++) {
			String elt = list.get(i);
			System.out.println(elt);
			
		}
		
		System.out.println("------------");
		
		//遍历 迭代器，这个是通用的，所有CoLLection都能用）
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------");
		
		//遍历 foreach
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
		
		//使用for循环
		for(Iterator<String> it2 = list.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		
	}

}
