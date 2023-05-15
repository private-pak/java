package com.bilbil.xx.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderText01 {
/*
 * FiLeReader,
文件字符输入流，只能读取普通文本。
读取文本内容时，比较方便，快捷。

 */
	public static void main(String[] args) {
		FileReader  reader= null;
		try {
			//创建文件字符输入流
			reader = new  FileReader("D:\\新建文件夹 (2)\\Tem.txt");
			
			char[] chars  =  new char[50]; //按照字符的方式读取：
			reader.read(chars);
			for (char c : chars) {
				System.out.print(c);
			}
			
//			//读
//			char[] chars  = new  char[4];
//			int readCount = 0;
//			while((readCount = reader.read(chars))  !=  -1) {
//				System.out.print(new String(chars,0,readCount));
//			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		

	}

}
