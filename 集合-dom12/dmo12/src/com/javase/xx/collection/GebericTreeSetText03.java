package com.javase.xx.collection;

import java.util.TreeSet;

public class GebericTreeSetText03 {
/*
对自定义的类型来说，TreeSet可以排序吗？
		以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则
		谁大谁小并没有说明啊。
		
以下程序运行的时候出现了这个异常：

	java.Lang.ClassCastException
 	class com.bjpowernode.javase.colLection.Person
 	cannot be cast to-cLass java.Lang.Comparable
 	出现这个异常的原因是：
 	Person类没有实现java.Lang.ComparabLe接口。

 */
	public static void main(String[] args) {
		perss p1 = new perss(12);
		perss p2 = new perss(42);
		perss p3 = new perss(18);
		perss p4 = new perss(56);
		
		//创建TreeSet集合
		
		TreeSet<perss> perss1 =new TreeSet<>();
		//添加元素
		perss1.add(p1);
		perss1.add(p2);
		perss1.add(p3);
		perss1.add(p4);
		
		//遍历 
		 for(perss p :perss1) {
			 System.out.println(p);
		 }
		

	}

}
/*class perss{
	int age;

	public perss(int age) {
		super();
		this.age = age;
	}
	//重写toString方法
	public String toString() {
		return "perss[age="+age+"]";
	}
	
}*/

//修改方法
//放在TreeSet集合中的元素需要实现java.Lang.ComparabLe接口。
//并且实现compareTo方法。equals可以不写。

class  perss implements Comparable<perss>{
	int age;

	public perss(int age) {
		super();
		this.age = age;
	}
		//重写toString方法
		public String toString() {
			return "perss --> [age="+age+"]";
		}
		
		//需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较！
		//k.compareTo(t.key)
		//拿着参数和集合中的每一个进行比较，返回值可能是>0 <0 =0
		//比较规则最终还是由程序员指定的：例如按照年龄升序。或者按照年龄降序。
		@Override
		public int compareTo(perss p) {
			// TODO 自动生成的方法存根
			
	/*		int age1 =  this.age;
			int age2 = p.age;
			
			if(age1 == age2) {
				return 0;
			}else if(age1 > age2) {
				return 1;
			}else {
				return -1;
			}这个可以
			*/
			return this.age - p.age; //
			
		}
}

