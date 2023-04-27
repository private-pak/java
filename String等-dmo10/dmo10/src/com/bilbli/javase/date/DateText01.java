package com.bilbli.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateText01 {
/*
 * java中对日期的处理
 * 		这个案例最主要掌握：
 * 		
		知识点1：怎么获取系统当前时间
		知识点2:String--->Date
		知识点3:Date--->String

 * 
 */
	public static void main(String[] args) throws ParseException {
		//获取系统当前时间（精确到毫秒的系统当前时间）
		//接调用无参数构造方法就行。
		Date noewTime = new Date();
		
		//java.util.Date类的toString()方法已经被重写了。
		//输出的应该不是一个对象的内存地址，应该是一个日期字符串。
			//System.out.println(noewTime);//Tue Apr 25 20:50:59 CST 2023
		
		//日期可以格式化吗？
		//将日期类型bate，按照指定的格式进行转换：Date--转换成具有一定格式的日期字符串-->String
		//SimpLeDateFormat是java.text包下的。专门负责日期格式化的。
		//注意：在日期格式中，除了 y M d H m s S 这些字符不能随便写之外，剩下的符号格式自己随意组织。

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String noewTimeStr = sdf.format(noewTime);
		
		System.out.println(noewTimeStr);
		
		
		//假设现在有一个日期宇符串string，怎么转换成Date类型？
		//String -->  Date
		String time = "2022-04-25 04:11:11 195";
		//SimpLeDateFormatsdf2=neiwSimpleDateFormat（"格式不能随便写，要和日期字符串格式相同")
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dateTime  = sdf2.parse(time);
		System.out.println(dateTime);//Mon Apr 25 04:11:11 CST 2022
		
	}

}
