package com.javase.xx.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapText02 {

	/*
	 * Map遍历
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"张三");
		map.put(2,"张4");
		map.put(3,"张5");
		map.put(4,"张6");
		//遍历
		//获取所有的key，所有的key是一个Set集合

		Set<Integer> keys  = map.keySet();
		
		//遍历key，通过key获成value
		//送代器可以
/*
		Iterator<Integer>  it = keys.iterator();
		while(it.hasNext()) {
			//取出其中一个key
			Integer key  = it.next();
			//通过key获取vaLue
			String value = map.get(key);
			System.out.println(key+"="+value);
		}
	*/
		
		
		
		//foreach也可以
		for(Integer key: keys) {
			System.out.println(key+" == "+map.get(key));
		}
		
		System.out.println("----------------");

		//第二种方式：Set<Map.Entry<K,V>> entrySet()
		//以上这个方法是把Map集合直接全部转换成set集合。
		//Set集合中元素的类型是：Map.Entry
		Set<Map.Entry<Integer,String>> set= map.entrySet();
		//遍历set集合，每一次取出一个node
		//选代器
		
	/*	Iterator<Map.Entry<Integer, String>> it2  = set.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, String>  node = it2.next();
			Integer key  = node.getKey();
			String value = node.getValue();
			System.out.println(key+"=="+ value);
		}
		*/
		
		//foreach
		//这种方式效率比较高，因为获取key和vaLue帮是直接从node对象中获取的性值。
		//这种方式比较适合于大数据量。

		for(Map.Entry<Integer, String> node:set) {
			System.out.println(node.getKey()+"----->"+node.getValue());
		}
	}

}
