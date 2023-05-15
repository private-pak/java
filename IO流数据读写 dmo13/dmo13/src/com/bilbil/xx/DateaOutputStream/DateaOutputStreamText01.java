package com.bilbil.xx.DateaOutputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateaOutputStreamText01 {
/*
java.io.DataOutputStream：数据专属的流。
这不流可以数据连同数据的类型一并写入文件
注意：这个文件不是普通文本文档。（这个文件使用记事本打不开。）
		

 */
	public static void main(String[] args) throws IOException {
		// //创建数据专属的宇节输出流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("date"));
		
		//写数据
		byte b = 100;
		short s = 200;
		int i= 300;
		long l= 400L;
		float f = 3.0F;
		double d = 3.14;
		boolean sex = false;
		char c = 'a';
		
		//写
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(1);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(sex);
		dos.writeChar(c);

		
		
		//刷新
		dos.flush();
		
		//关
		dos.close();
		
	}

}
