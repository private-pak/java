package com.bilbli.javase.stringbuffer;

public class StringBuilderText02 {
/*
 * 	java.Lang.StringBuiLder
StringBuffer和stringBuiLder的区别？

StringBuffer中的方法都有：synchronized关键字修饰。表示stringBuffer在多线程环境下运行是安全的。

StringBuiLder中的方法都没有：synchronized关键字修饰，表示stringBuilder在多线程环境下运行是不安全的

StringBuffer是线程安全的。
StringBuiLder是非线程安全的。

 */
	public static void main(String[] args) {
		////使用stringBuiLder也是可以完成字符申的拼接
		StringBuilder sb = new StringBuilder();
		sb.append(1);
		sb.append(10L);
		sb.append(true);
		sb.append("武当派");
		System.out.println(sb);
	}

}
