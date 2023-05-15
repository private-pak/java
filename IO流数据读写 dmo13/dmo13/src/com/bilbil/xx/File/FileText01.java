package com.bilbil.xx.File;

import java.io.File;
import java.io.IOException;

public class FileText01 {
/*
File
	1、FiLe类和四大家族没有关系，所以FiLe类不能完成文件的读和写。
	2、FiLe对象代表什么？
		文件和目录路径名的独象表示形式。
			C：\Drivers这是一个Fle对象
			C:\DriverslLanRealteklReadme.txt也是FiLe对象。
	一个FiLe对象有可能对应的是目录，也可能是文件。
	FiLe只是一个路径名的抽象表示形式。
	
	3、需要掌握F记e类中常用的方法

 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		File fe1 = new File("D:\\新建文件夹 (2)\\Temm.txt");
		
		System.out.println(fe1.exists());//false  判断是否存在
		
		//如果不存在就以文件方式 创建 
	/*	if(!fe1.exists()) {
			fe1.createNewFile();
		}
		*/
		
	/*	if(!fe1.exists()) {
			fe1.mkdir();
		}
		*/
		
		//创建多目录
		File fe2 = new File("D:\\a\\b");
	/*	if(!fe2.exists()) {
			
			fe2.mkdir();
		}*/
		
		//获取文件的父路径
		String parentPath = fe1.getParent();
		System.out.println(parentPath);  //D:\新建文件夹 (2)
		File parentFile = fe1.getParentFile();
		System.out.println("绝对路径:"+parentFile.getAbsolutePath());//绝对路径:D:\新建文件夹 (2)
		

		
		
	}

}
