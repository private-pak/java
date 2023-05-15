package com.bilbil.xx.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream05 {
/*
FiLeInputStream类的其它常用方法：
  		intavaiLabLe（）：返回流当中剩余的没有读到的字节数量
 		Long skip（Long n）：就过几个字节不读。

 */
	public static void main(String[] args) {
		FileInputStream  fis =  null;
		try {
			fis  = new FileInputStream("D:\\新建文件夹 (2)\\Tem.txt");
			
			System.out.println("总字节有：" + fis.available());
/*			//读一个字节
		//	int readByte = fis.read();
		//	System.out.println("还剩多少个字节没读："+fis.available()); //还剩多少个字节没读：14
			
			byte[] bytes =new  byte[fis.available()]; //这种方式不太适合太大的文件，因为byte[]数组不能太大。

			//不需要循环
			//直接读一次就行
			int readCount = fis.read(bytes);
			System.out.println(new String(bytes)); //FileInputStream
		*/	
			//skip跳过几个宇节不读取，这个方法也可能以后会用！
			fis.skip(3);
			System.out.println(fis.read());//101
			
			
			
			
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

}
