package com.bilbli.javase.date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateText03 {

	public static void main(String[] args) {
		//这个时间是什么时间？
		//1970-01-0100:00:00001

		Date time = new Date(1);
		
		SimpleDateFormat sdf   =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strTime = sdf.format(time);
		//北京是东8区。差8个小时。
		System.out.println(strTime);//1970-01-01 08:00:00 001
		
		
		//获取昨天的此时的时间。
		Date time2 = new Date(System.currentTimeMillis()- 1000 * 60  * 60 *24);
		String strTime2 =sdf.format(time2);
		System.out.println(strTime2); // 2023-04-24 22:04:22 228
	}

}
