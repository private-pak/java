package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionText03 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(100);
		c1.add(200);
		c1.add(300);
		c1.add(100);
		
		//迭代
		Iterator it =c1.iterator();
		while(it.hasNext()) {
			//存进去是什么类型，取出来还是什么类型。
			Object obj  = it.next();
//			if(obj instanceof Integer) {
//				System.out.println("integer类型");
//			}
			System.out.println(obj);//只不过在输出的时候会转换成字符审。因为这里printLn会调用toString(）方法。
		}
		
		System.out.println("----------------");
		//HashSet集合 无序不重复
		//无序：存进去和取出的顺序不同。
		Collection  c2  = new HashSet();
		c2.add(21);
		c2.add(2);
		c2.add(30);
		c2.add(1);
		c2.add(41);
		c2.add(21);
		
		
		Iterator it1 = c2.iterator();
		while(it1.hasNext()) {
			Object objt=  it1.next();
			
			System.out.println(objt);
		}
		
		
	}

}
