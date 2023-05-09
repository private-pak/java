package com.javase.xx.HashMap;

import java.util.HashSet;
import java.util.Set;

public class HashMapText02 {

	public static void main(String[] args) {
		Student s1= new  Student("张三");
		Student s2= new  Student("张三");
		
		//重写equals方法之前
	//	System.out.println(s1.equals(s2));//false
		
		//重写equals 方法之后
		System.out.println(s1.equals(s2));//true
		
		
		System.out.println("s1的hashcode"+s1.hashCode());
		System.out.println("s2的hashcode"+s2.hashCode());
		
		
		
		//s1.equaLs（s2）结果已经是true了，表示s1和s2是一样的，相同的，那么往Hashset集合中放的话，
		//按说只能放进去1个。（HashSet集合特点：无序不可重复）
		
		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());//2

	}

}
