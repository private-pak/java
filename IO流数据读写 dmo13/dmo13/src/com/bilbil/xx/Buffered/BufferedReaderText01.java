package com.bilbil.xx.Buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderText01 {
/*
BufferedReader:
		带有缓冲区的字符输入流。
		使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。

 */
	public static void main(String[] args) throws Exception {
			FileReader  reader = new FileReader("D:\\新建文件夹 (2)\\Tem.txt");
			//当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
			//外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
			//像当前这个程序来说：FiLeReader就是一个节点流。BufferedReader就是包装流/处理流。

			BufferedReader br  =  new   BufferedReader(reader);
			//读一行
	/*		String fistLine  =  br.readLine();
			System.out.println(fistLine);
			
			String secoundLin  =  br.readLine();
			System.out.println(secoundLin);
			
			String line3 = br.readLine();
			System.out.println(line3);
			
			String line4 = br.readLine();
			System.out.println(line4);//  null	*/  // 改进
			
			//br.readLine()方法读取一个文本行，但不带换行符。
			String string = null;
			while((string = br.readLine()) != null) {
				System.out.println(string);
			}
			
			//关闭 流
			//对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭。
			
				br.close();
			
	}

}
