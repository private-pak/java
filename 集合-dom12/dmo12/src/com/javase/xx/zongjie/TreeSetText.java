package com.javase.xx.zongjie;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*TreeSet  
 * 	排序 不重复
 */
	
public class TreeSetText {

	public static void main(String[] args) {
	//	TreeSet<Integer> ts =  new TreeSet<>();
		
		//降序
		TreeSet<Integer> ts =  new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO 自动生成的方法存根
				return o1-o2;
			}
			
		});
		
		ts.add(11);
		ts.add(24);
		ts.add(11);
		ts.add(227);
		ts.add(1258);
		
		//遍历 迭代器
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			Integer i  =it.next();
			System.out.println(i);
		}
		
		System.out.println("-----------");
		//遍历 foreach
		for(Integer  x : ts) {
			System.out.println(x);
		}

	}

}
