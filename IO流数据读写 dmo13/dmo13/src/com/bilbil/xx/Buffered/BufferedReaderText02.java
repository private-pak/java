package com.bilbil.xx.Buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderText02 {

	public static void main(String[] args) throws IOException {
		
/*		//字节流
		FileInputStream in =  new FileInputStream("D:\\新建文件夹 (2)\\Tem.txt");
		//通过转换流转换（InputStreamReader将字节流转换成字符流。）
		//in是节点流。reader是包装流。
		InputStreamReader reader =  new InputStreamReader(in);
	
		//这个构造方法只能传一个字符流。不能传字节流。
		//reader是节点流。br是包装流。

		BufferedReader br = new BufferedReader(reader);
		*/ //  合并
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\新建文件夹 (2)\\\\Tem.txt")));
		
		//读
		String line = null;
		while((line = br.readLine()) != null) {
				System.out.println(line);
		}
		
		br.close();

	}

}
