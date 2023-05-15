package com.bilbil.xx.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamText01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FileOutputStream  fos = null;
		try {
		//	文件不存在的时候会自动新建！
			//这种方式谨慎使用，这种方式会先将原文件清空，然后重新写入。
		//	fos =  new FileOutputStream("D:\\新建文件夹 (2)\\Tem.txt");
			
			//以追加的方式在文件末尾写入。不会清空原文件内容。			
			fos =  new FileOutputStream("D:\\新建文件夹 (2)\\Tem.txt",true);
			
			
			//开始写 
			byte [] bytes = {97,98,99,100};
			//将  byte数组全部写出
			fos.write(bytes);
			
			//将byte数组 部分写出
			
			fos.write(bytes, 0, 2);
			
			//字符串
			String s = "Java开发";
			byte[] bs =s.getBytes();
			fos.write(bs);
			
			//写完 之后  最后一定要刷新 
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

}
