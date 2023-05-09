package com.javase.xx.HashMap;

import java.util.Hashtable;
import java.util.Map;

public class HashMapText04 {
/*
 * HashtabLe的key可以为null吗？
 * 
 * HashtabLe的key和vaLue都是不能为nulL的。
 * HashMap集合的key和vaLue部是可以为nuLL的。

HashtabLe方法都带有synchronized：线程安全的。

	线程安全有其它的方案，这个HashtabLe对线程的处理
	导致效率较低，使用较少了。
	
	HashtabLe和HashMap一样，底层都是哈希表数据结构。
	HeshtabLe的初始化容量是11，默认加载因子是：0.75f
	HashtabLe的扩容是：原容量= ×2+1


 */
	public static void main(String[] args) {
		Map map= new Hashtable<>();
	//	map.put(null, 1);
		
	//	map.put(1, null);
		
		map.put(1, 100);
		System.out.println(map.size());// java.lang.NullPointerException
		
		

	}

}
