package com.bilbil.xx.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText01 {
/*
FiLewriter:
文件字符输出流。写。
只能输出普通文本。

 */
	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("D:\\新建文件夹 (2)\\Tem.txt",true);
			//写
			char[] chars = {'你','好','.'};
			out.write(chars);
			out.write(chars,0,2);
			
			out.write("你好holl word 你好");
			out.write("\n");  //  换行符
			out.write("你好holl word 你好");
			
			
			//刷新
			out.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
