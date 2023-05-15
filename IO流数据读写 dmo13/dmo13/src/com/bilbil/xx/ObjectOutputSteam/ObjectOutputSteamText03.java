package com.bilbil.xx.ObjectOutputSteam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.bilbil.xx.ObjectOutputSteam.Student.User;

public class ObjectOutputSteamText03 {
/*
一次序列化多个对象呢？
		可以，可以舞对象放到集合当中，序列化集合。

 */
	public static void main(String[] args) throws Exception, Exception {
		
		
	 List<User>   userlist = new ArrayList<>();
	 userlist.add(new User(147,"张三"));
	 userlist.add(new User(258,"大威德"));
	 userlist.add(new User(369,"阿斯顿"));
	 userlist.add(new User(159,"啊实打实的"));
	 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\\\新建文件夹 (2)\\\\2\\\\101.txt"));
	 
	 //序列化一个集合 这个集合包含多个其他对象
	 oos.writeObject(userlist);
	 
	 oos.flush();
	 oos.close();
	}

}
