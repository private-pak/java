package com.bilbil.xx.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamText03 {
/*
int read(byte[] b)
	一次最多读取b.Length个字节。
	减少硬盘和内存的交互，提高程序的执行效率
	往byte[]数组当中读。|

 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		FileInputStream fis =null;
		try {
			fis =new FileInputStream("D:\\新建文件夹 (2)\\Tem.txt");
			//开始读，采用byte数组，一次读取多个宇节。最多读取“数组.Length"个字节。
			byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节。
			//这个方法的返回值是：读取到的字节数量。（不是字节本身）
			int  readCount =fis.read(bytes);
			System.out.println(readCount); //4
		//	System.out.println(new String (bytes));//将字节数组全部转换成字符串
			//不应该全部都转换，应该是读取了多少个宇节，转换多少个。！
			System.out.println(new String(bytes,0,readCount));//abcd
			
			
			readCount  = fis.read(bytes);
			System.out.println(readCount); //2
			System.out.println(new String(bytes,0,readCount));//ef
			
			readCount  = fis.read(bytes);
			System.out.println(readCount);//-1 一个 字节都没读到
			

			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(fis  != null){
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
