package com.bilbil.xx.Copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyText01 {
	/*
	 * 使用FiLeInputStream+FiLeOutputStream完成文件的拷贝。 拷贝的过程应该是一边读，一边写。
	 * 使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件部能拷贝。
	 * 
	 */
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("D:\\视频\\1.mp4");
			fos = new FileOutputStream("D:\\视频\\2\\1.mp4");

			//最核心的：一边读，一边写
			byte[] bytes = new byte[1024*10];
			int readCount  = 0;
			while((readCount =  fis.read(bytes))  !=-1) {
				fos.write(bytes, 0, readCount);
			}
			
			// 刷新
			fos.flush();

		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			
			//分开try，不要一起try。
			//一起t的时候，其中一个出现异常，可能会影响到另一个流的关闭。

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}

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
