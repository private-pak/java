package com.bilbli.javase.string;

public class StringText04 {
/*
 * String 类当中常用方法
 * 			
 * 			//面试题：判断数组长度和判断字符串长度不一样
 * 
			//判断数组长度是Length属性，判断字符串长度是Length(）方法。
	
 * 
 */
	public static void main(String[] args) {
		// char charAt (int index)
		char c1 = "青宁起始页".charAt(1);
		System.out.println(c1);//宁

			
		//int compareTo(String anotherString)
		int rest = "abcd".compareTo("abcd");
		System.out.println(rest);//0（等于0）前后一致
		
		int rest1 = "abcd".compareTo("abce");
		System.out.println(rest1);//-1 (小于0）前小后大

		
		int rest2 = "abce".compareTo("abcd");
		System.out.println(rest2);//1 （大于0）前大后小

		
		//（掌握）.booLean  contains(CharSequence s）
		//判断前面的字符串中是否包含后面的子字符串。
		System.out.println("hello word.py".contains("py"));//true
		
		//4（掌握）.booLean  endsWith(string suffix)
		//判断当前宇符串是否以某个字符串结尾。
		System.out.println("textteet".endsWith("teet"));//true
		System.out.println("text.teet".endsWith(".java"));//flase
		
		
		//6（掌握）.booLean equalsIgnoreCase(String anotherString)
		//判断两个宇符串是否相等，并且同时急略大小写。
		System.out.println("AbC".equalsIgnoreCase("abc"));//true
		
		System.out.println("---------------------------------");
		
		//7（掌握）.byte【】getBytes()
		//将字符串对象转换成字节数组
		byte[] bytes  =  "adsakd".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		//8（掌握）.int  indexof(string str)
		//判断某个子宇符串在当前宇符申中第一次出现处的素引。
		System.out.println("Java零基础教程视频（适合Java 0基础，Java初学入门）".indexOf("0"));//19
		
		
		//9（掌握）.boolean isEmpty()
		//判断某个字符串是否为空。
		
		String i = "11";
		
		String s = "";
		
		System.out.println(s.isEmpty());//true
		System.out.println(i.isEmpty());//false

		//10（掌握）.int Length()
		System.out.println("asdad".length());//5
		
		//11（掌握）.int LastIndexof(String str)
		//判断某个子字符串在当前字符串中最后一次出现的索引（下标）
		System.out.println("Java零基础教程视频（适合Java 0基础，Java初学入门）".lastIndexOf("0"));//19
		
		
		//12（掌握）.String repLace(CharSequence target,CharSequence replacement)
		//String的父接口就是：CharSequence 
		//替换
		String newString  =   "https://limestart.cn/".replace("https://limestart.cn/","https://www.baidu.com");
		System.out.println(newString);//https://www.baidu.com
		
		//把等号“=”换成“ ：”
		String newString2 = "neam=zhangs&password=123&agewsd=11".replace("=", ":");
		System.out.println(newString2);//neam:zhangs&password:123&agewsd:11
		
		
		
		//13（掌握）.String[]split(String regex)
		//拆分字符串
		String[] ymd= "1911-22-1".split("-");
		for (int j = 0; j < ymd.length; j++) {
			System.out.println(ymd[j]);
		}
		
		//14（掌握）、booLean startsWith(String prefix)
		//判断某个字符串是否以某个子宇符串开始。

		System.out.println("青宁起始页".startsWith("青"));//true
		System.out.println("青宁起始页".startsWith("青1"));//false
		
		
		//15（掌握）String  substring（int beginIndex）参数是起始下标。
		//截取字符串
		System.out.println("https://limestart.cn/".substring(5));//  ://limestart.cn/

		
		//16（掌握），String substring(intbeginIndex,int endIndex)
		//beginIndex起始位查（包括）
		//endIndex结束位置（不包括）
		System.out.println("https://limestart.cn/".substring(5,9)); // ://l
		
		
		//17(掌握)、char[]toCharArray()
		//将字符审转换成char数组
		char[] chars1 ="青宁起始页".toCharArray();
		for (int j = 0; j < chars1.length; j++) {
			System.out.println(chars1[j]);
		}
		
		
		//18（掌握）、String  toLowerCase()
		//转换为小写。
		System.out.println("ABCSADSDdsadaDAD".toLowerCase());//abcsadsddsadadad
		
		//19（掌握）、String  toUpperCase()
		//转换为大写。
		System.out.println("ABCSADSDdsadaDAD".toUpperCase());//ABCSADSDDSADADAD
		
		
		//20（掌握）. String  trim();
		//去除字符串前后空白
		System.out.println("         hell     word         ".trim());//hell     word
		
		
		//21（掌握），String中只有一个方法是静态的，不需要new对象
		//这个方法叫做valueof
		//作用：将 “非字符串”转换成“字符串”
		String s1 = String.valueOf(30.485265);
		System.out.println(s1);
		
		
		//这个静态的vaLueof(）方法，参数是一个对象的时候，会自动调用该对象的toString()方法
		String s2 = String.valueOf(new Custemio());
		//System.out.println(s2); //没有重写 toString()方法之前是对象内存地址 //com.bilbli.javase.string.Custemio@26f0a63f
		System.out.println(s2);
		
		
		Object obj = new Object();
		System.out.println(obj);//java.lang.Object@26f0a63f

	}
		
	
	

}

class Custemio{
	//重写toString方法

	@Override
	public String toString() {
		return "吊带黑丝";
	}
	
	
	
	
}










