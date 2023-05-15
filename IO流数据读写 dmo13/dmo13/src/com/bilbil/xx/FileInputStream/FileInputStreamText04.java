package com.bilbil.xx.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamText04 {
//最终版
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\新建文件夹 (2)\\Tem.txt");
			//数组 byte
			byte[] bytes = new byte[4];
	/*		while(true) {
				int readCount=  fis.read(bytes);
				if(readCount  == -1) {
					break;
				}
				System.out.print(new String (bytes,0,readCount));
			}*/
			
			int readCount = 0;
			while((readCount = fis.read(bytes)) != -1){
				System.out.print(new String (bytes,0,readCount));
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
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
//731
}
