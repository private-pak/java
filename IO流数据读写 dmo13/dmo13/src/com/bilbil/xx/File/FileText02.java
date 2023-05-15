package com.bilbil.xx.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileText02 {
/*
File
	
 */
	public static void main(String[] args) {
		File f1 = new File("D:\\新建文件夹 (2)\\Temm.txt");
		//获取文件名
		System.out.println("文件名:"+f1.getName());//文件名:Temm.txt
		
		//判断是否是个目录
		System.out.println(f1.isDirectory());  //false
		//判断是否是个文件
		System.out.println(f1.isFile());//true

		//获取文件最后一次修改时间
		long  haomiao = f1.lastModified();//这个毫米是从 1970年到现在的总毫秒数
		
		//转换
		Date time = new Date(haomiao);
		SimpleDateFormat   sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss SSS");
		String strTime = sdf.format(time);
		System.out.println(strTime); //2023-05-13 20:50:005 548

		//获取 文件大小
		System.out.println(f1.length());//7字节
		
	}

}
