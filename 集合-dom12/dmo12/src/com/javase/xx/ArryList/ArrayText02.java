package com.javase.xx.ArryList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayText02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		List mylist1 = new ArrayList<>();
		
		List mylist2 = new ArrayList<>(20);
		
		//创建一个hashSet集合
		Collection c = new HashSet<>();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		//通过这个构造方法就可以将hashset集合转换成list集合
		List mylist3 = new ArrayList<>(c);
		for (int i = 0; i < mylist3.size(); i++) {
			System.out.println(mylist3.get(i));
		}
	}

}
