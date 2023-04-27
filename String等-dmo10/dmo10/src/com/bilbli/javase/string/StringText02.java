package com.bilbli.javase.string;

public class StringText02 {

	public static void main(String[] args) {
		//"heLLo"是存储在方法区的宇符申常量池当中
		//所以这个"heLLo"不会新建。（因为这个对象已经存在了！）
		String  s1  = "heloo";
		String  s2  = "heloo";
		//=双等号比较的是不是变量中保存的内存地址？是的。
		System.out.println(s1  ==  s2);//true
		
		String x = new String("xyz");
		String y = new String("xyz");
		//=双等号比较的是不是变量中保存的内存地址？是的。
		System.out.println(x == y);//flase
		//所以该调用Object的eqals方法
		System.out.println(x.equals(y));//true
		
		System.out.println("-----------------------");
		
		
		String k  = new String("text");
		//String k = null;
		
		//"text"这个字符串可以后面加"."呢？
		//因为"text是一个String字符串对象。只要是对象都能调用方法。
		System.out.println("text".equals(k));//true //建议使用这种方式，因为可以避免空指针
		System.out.println(k.equals("text"));//true
	}//586

}
