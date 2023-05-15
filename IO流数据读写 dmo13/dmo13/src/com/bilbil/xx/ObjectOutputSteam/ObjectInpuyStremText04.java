package com.bilbil.xx.ObjectOutputSteam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.bilbil.xx.ObjectOutputSteam.Student.User;

public class ObjectInpuyStremText04 {
/*
 * 反序列化
 */
	public static void main(String[] args) throws Exception, Exception {

		ObjectInputStream ois  = new  ObjectInputStream(new FileInputStream("D:\\新建文件夹 (2)\\2\\101.txt"));
	/*	Object obj = ois.readObject();
		//验证一下返回是否是个list集合
		System.out.println(obj instanceof List); //true */
		
		List<User> userlist = (List<User>)ois.readObject();
		for(User  user :  userlist) {
			System.out.println(user);
		}
		
		ois.close();
	}

}
