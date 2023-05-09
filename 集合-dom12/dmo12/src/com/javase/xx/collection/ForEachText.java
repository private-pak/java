package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		List<String> strlist = new ArrayList<>();
		
		strlist.add("100");
		strlist.add("200");
		strlist.add("300");
		strlist.add("400");
		strlist.add("500");
		
		
		Iterator<String> it1 = strlist.iterator();
		
		while(it1.hasNext()) {
			String stg  = it1.next();
			System.out.println(stg);
		}
		//使用下标方式（只针对于有下标的集合）
		for (int i = 0; i < strlist.size(); i++) {
			System.out.println(strlist.get(i));
		}
		 
		System.out.println("---------------------");
		
		//使用foreach
		for(String s:strlist) {
			System.out.println(s);
		}
	}

}
