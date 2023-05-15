package com.bilbil.xx.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterText01 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedWriter out  = new BufferedWriter(new FileWriter("D:\\新建文件夹 (2)\\Tem.txt",true));
		out.write("BufferedWriter");
		out.write("\n");
		out.write("123");
		
		//刷新
		out.flush();
		
		//关闭 外层 流
		out.close();
		
		
	}

}
