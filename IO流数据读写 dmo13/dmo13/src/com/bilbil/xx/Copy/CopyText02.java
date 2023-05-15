package com.bilbil.xx.Copy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText02 {

	public static void main(String[] args) {
		FileReader inr = null;
		FileWriter outr = null;
		try {
			inr = new FileReader("D:\\新建文件夹 (2)\\Tem.txt");//读
			outr = new FileWriter("D:\\新建文件夹 (2)\\2\\1.txt");//写 
			
			//一边读一边写
			char[]chars  =  new  char[1024*10];
			int  readCount = 0;
			while((readCount  = inr.read(chars)) != -1) {
				outr.write(chars,0,readCount);
			}
			
			//刷新
			outr.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (inr != null) {
				try {
					inr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (outr != null) {
				try {
					outr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

}
