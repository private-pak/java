package com.bilbil.xx.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class FileInputStreamText01 {
/*
 java.io.FiLeInputStream:
 
	1、文件宇节输入流，万能的，任何类型的文件部可以采用这个流来读。
	2、字节的方式，完成输入的操作，完成读的操作（硬盘---》内存）

 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FileInputStream  fis =null;
		
		try {
			fis = new FileInputStream("D:\\新建文件夹 (2)\\Tem.txt");
			//读
			int readDate = fis.read(); //这个方法的返回值是：读取到的"字节"本身。
			System.out.println(readDate);//53
			
			readDate  = fis.read();
			System.out.println(readDate);
			
			readDate  = fis.read();
			System.out.println(readDate);
			
			readDate  = fis.read();
			System.out.println(readDate);
			
			readDate  = fis.read();
			System.out.println(readDate);
			
			readDate  = fis.read();
			System.out.println(readDate);
			
			readDate  = fis.read();
			System.out.println(readDate); // -1 //已经读到文件的未居了，再读的时候读取不到任何数据，返回-1.
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//在finaLLy语句块当中保流一定关闭。
			if (fis != null) { //避免  空指针异常
				//关闭流的前提是：流不是空。流是nuLL的时候没必要关闭。
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
