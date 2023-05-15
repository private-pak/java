package com.bilbil.xx.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamText02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\新建文件夹 (2)\\Tem.txt");
		/*	while (true) {

				int readDate = fis.read();
				if(readDate == -1) {
					break;
				}
				System.out.println(readDate);

			}*/
			
			//wile循环
			int readDate = 0;
			while((readDate  =  fis.read())  !=  -1) {
				System.out.println(readDate);
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

}
