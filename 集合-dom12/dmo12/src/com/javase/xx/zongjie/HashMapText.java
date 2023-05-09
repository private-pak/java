package com.javase.xx.zongjie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "阿瑟东");
		map.put(1, "打算东");
		map.put(3, "阿瑟阿萨德东"); //key 重复value会覆盖
		
		//获取元素个数
		System.out.println(map.size());
		
		//取
		System.out.println(map.get(3));
		
		//遍历Map集合很重要，几种方式都要会。
		//第一种方式：先获取所有的key，遍历key的时候，通过key获成vaLue
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key +"==" +map.get(key));
		}
		
		System.out.println("-----------");
		
		//第二种方式：是Map集合转换成Set集合，Set集合中每一个元素是Node
		//这个Node节点中有key和vaLue
		Set<Map.Entry<Integer, String >> nodes = map.entrySet();
		for(Map.Entry<Integer, String> node : nodes) {
			System.out.println(node.getKey()+"=="+node.getValue());
		}
		
	}

}
