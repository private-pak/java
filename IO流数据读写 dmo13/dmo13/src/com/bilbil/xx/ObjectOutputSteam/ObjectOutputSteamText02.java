package com.bilbil.xx.ObjectOutputSteam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputSteamText02 {
	/*
	 * 反序列化
	 */
	
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream ois  = new  ObjectInputStream(new FileInputStream("D:\\新建文件夹 (2)\\2\\101.txt"));
		
		//开反序列化 读
		Object obj  = ois.readObject();
		////反序列化回来是一个学生对象，所以会调用学生对象的toString方法。
		System.out.println(obj);
		ois.close();
	}

}
