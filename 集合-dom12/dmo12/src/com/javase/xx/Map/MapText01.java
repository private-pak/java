package com.javase.xx.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
1、Map和CoLLection没有继承关系。

2、Map集合以key和vaLue的方式存储数据：键值对
	key和vaLue都是引用数据类型。
	key和value都是存估对象的内存地址。
	key起到主导的地位，vaLue是key的一个属品。

3、Map接口中常用方法：
	void cLear() 清空map集合 
	
	boolean containsKey(object key) 判断map中是否包含某个key
	
	boolean containsValue(Object value) 判断map中是否包含某个value
	
	V get(object key)通过Key获取value
	
 	boolean isEmpty() 判断map集合中元素个数是否为0
 	
	Set<K> keySet() 获取map集合 所有的key(所有的建是一个set集合)
	
	V put(K key,V value) 向Map集合中 添加键值队
	
	V remove(Object key)  通过key删除建值队
	
	int size() 获取 map集合中键值对的个数
	
	ColLection <V> values  () 获取map集合中所有的value 返回一个collection
	
	Set<Map.Entry<K,V>> entrySet() 将map集合转换成set集合


 */
public class MapText01 {

	public static void main(String[] args) {
		//创建map集合对象
		Map<Integer, String> map = new HashMap<>();
		//向map集合中添加键值对
		map.put(1, "这个1");//1 自动装箱了
		map.put(2, "这个2");
		map.put(3, "这个3");
		map.put(4, "这个4");
		map.put(5, "这个5");
		//通过key获取value
		String value =map.get(3);
		System.out.println(value);
		//获取键值对的数量
		System.out.println("键值对有："+map.size());
		//通过key删除 key-value
		map.remove(2);
		System.out.println("键值对有："+map.size());
		//判断是否包含某个key
		//contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法。
		System.out.println(map.containsKey(4));//true
		
		//获取 所有的vlaue
		Collection<String> values = map.values();
		for(String s:values) {
			System.out.println(s);
		}
		
		//判断是否包含某个vaLue
		System.out.println(map.containsValue("这个2"));//false
		//清空map
		map.clear();
		System.out.println("键值对有："+map.size());
		//判断是否为空
		System.out.println(map.isEmpty());//true
	}//698

}
