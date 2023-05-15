package com.bilbil.xx.File;

import java.io.File;

public class FileText03 {
/*
 * FiLe中的ListFiLes方法。
 */
	public static void main(String[] args) {
			/*
			 * file [] listfile()
			 * 获取当前目录下的所有子文件
			 * 
			 */
		File f1  = new File("D:\\");
		File[] files = f1.listFiles();
		
		//foreach
		for(File  file:files) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
		}

	}

}
