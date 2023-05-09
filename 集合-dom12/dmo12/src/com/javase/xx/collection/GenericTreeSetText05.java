package com.javase.xx.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class GenericTreeSetText05 {
/*
 * TreeSet集合中元素可排序的第二种方式：使用比较器的方式。
 * 		最终的结论：
	放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
			第一种：放在集合中的元素实现java.Lang.ComparabLe接口。
			第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象。
			
	ComparabLe和Comparator怎么选择呢?
				当比较规则不会发生改变的时候，或者说当比较规则只有1个的时候，建议实现ComparabLe接口。
				如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用comparator接口。
				Comparator接口的设计符合ocp原则。


 */
	public static void main(String[] args) {
		//创建TreeSet集合的时候，需要使用这个比较器。
		//TreeSet<WuGui>wuGuis=newTreeSet<>（);//这样不行，没有通过构造方法传递一个比较器进去
		
		//给构造方法传递一个比较器。
	//	TreeSet<Animal> animal= new TreeSet<>(new Animalcomparator());
			
		
		//大家可以使用匿名内部类的方式（这个类没有名字。直揭new接口）
		TreeSet<Animal> animal= new TreeSet<>(new Comparator<Animal>() {

			@Override
			public int compare(Animal o1, Animal o2) {
				// TODO 自动生成的方法存根
				return o1.age-o2.age;
			}
		});
		
		
			animal.add(new  Animal(100));
			animal.add(new  Animal(10));
			animal.add(new  Animal(700));
			
			for(Animal animals:animal) {
				System.out.println(animals);
			}
			

	}

}
class Animal{
	int age;

	public Animal(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal: [age=" + age + "]";
	}
	
	
}

/*

//单独编写一个比较器
//比较器实现java.util.Comparator接口。（ComparabLe是java，Lang包下的。Comparator是java.util包下的。
class Animalcomparator implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO 自动生成的方法存根 指定比较规则
		
		return o1.age- o2.age;
	}
	
}

*/

