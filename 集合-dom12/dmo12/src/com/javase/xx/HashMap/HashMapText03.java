package com.javase.xx.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapText03 {
	/*
	 * HashMap集合key部分允许nuLL吗？
	 */

	public static void main(String[] args) {
		Map map= new  HashMap<>();
		map.put(null, null);
		
		//HashMap集合允许key为null
		System.out.println(map.size());//1
		
		///key重复的适value是覆盖
		map.put(null, 100);
		System.out.println(map.size());//1
		
		System.out.println(map.get(null));//100
		
	}

}
