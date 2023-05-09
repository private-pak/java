package com.javase.xx.collection;

import java.util.TreeSet;

public class GebericTreeSetText04 {
//先按照年龄升序，如果年龄一样的再按照姓名升序
	
	public static void main(String[] args) {
		TreeSet<Vip> vips = new TreeSet<>();
		vips.add(new Vip("张三",15));
		vips.add(new Vip("达瓦",85));
		vips.add(new Vip("阿德",55));
		vips.add(new Vip("奥迪",36));
		for(Vip vip : vips) {
			System.out.println(vip);
		}

	}

}
class Vip implements Comparable<Vip>{
	String name;
	int  age;
	public Vip(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[名字=" + name + ", 年龄=" + age + "]";
		
	/*	compareTo方法的返回值很重要：
			返回0表示相同，vaLue会覆盖。
			返回>0，会继续在右子树上找。【10-9=1，1>0 】 的说明左边这个数宇比较大。所以在右子树上找。
			返回<0，会继续在左子树上找。
*/
	}
	@Override
	public int compareTo(Vip o) {
		// TODO 自动生成的方法存根
		if(this.age == o.age) {
			//年龄相同时按照名字排序。
			//姓名是string类型，可以查接比。调用compareTo来完成比较。
			return this.name.compareTo(o.name);
		}else {
			//年龄不一样
			return this.age - o.age;
		}
		
	}//713
	
	
}