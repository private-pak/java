package com.bilbil.xx.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamText01 {
/*
java.io.PrintStream：标准的字节输出流。默认输出到控制台。
 */
	public static void main(String[] args) throws IOException {
		// 联合起来写
		System.out.println("你好不好");

		//分开写 
			PrintStream ps  =  System.out;
			ps.println("你好");
			ps.print("你好");
			ps.print("你好");
			ps.print("你好");
			//标准输出流不需要手动cLose()关闭。
			/*
			 可以改变标准输出流的输出方向？可以
			这些是之前system类使用过的方法和属性。
			System.gc();
			System.currentTimeMilLis();
			PrintStream ps2 = System.out
			System.exit(e);
			System.arraycopy(....);
*/
			//标准输出流不再指向控制台，指向“Tem"文件。
			 PrintStream printstream   = new PrintStream(new  FileOutputStream("D:\\\\新建文件夹 (2)\\\\Tem.txt",true));
			 System.setOut(printstream);//修改输出方向，输出方向修改到"Tem"文件。
			 
			 System.out.println("\n");
			 System.out.println("网不好");
	}

}
