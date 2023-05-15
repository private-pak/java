package com.bilbil.xx.DateaOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;

public class DateaInputSteamText01 {
/*
		DataInputStream：数据字节输入流。
		DataOutputStream的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道耳入的顺序。
		读的顺序需要和写的顺序一致。才可以正常取出数据。
	
 */
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("date"));
		//开始读 
		byte b =  dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long  l  = dis.readLong();
		float  f   = dis.readFloat();
		double d =dis.readDouble();
		boolean sex  = dis.readBoolean();
		char c =dis.readChar();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i  +  120);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(sex);
		System.out.println(c+"c");
		

		dis.close();
		
		
		
	}

}
