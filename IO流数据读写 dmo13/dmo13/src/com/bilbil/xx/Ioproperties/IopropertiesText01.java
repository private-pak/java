package com.bilbil.xx.Ioproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
IO+Properties的联合应用。

		非常好的一个设计理念：
			以后经常改变的数据，
			可以单独到一个文件中，使用程序动态读取。
			将来只需要修改这个文件的内容，java代码不需要改动，不需要重新
			编译，服务器也不需要重启。就可以拿到动态的信息。
			
			
			类仪于以上机制的这种文件被称为配置文件。
			并且当配适文件中的内容格式是：
				keyl=value
				key2=value
			的时候，我们把这种配文件叫做属性配置文件
			
java规范中有要求：属性配置文件建议以.properties结尾，但这不是必须的。
	
	这种以.properties结的文件在java中被称为：属性配适文件。
	其中Properties是专门存放属性配置文件内容的一个类。



 */
public class IopropertiesText01 {

	public static void main(String[] args) throws IOException {
		// Properties是一个Map集合，key和value部是string类型。
		//将D:\新建文件夹 (2)\3\1025.properties的数据加载到properties对象当中
		
		//新建输入流对象
		FileReader redaer  = new FileReader("D:\\新建文件夹 (2)\\3\\1025.properties");
		
		//新建一个map集合 
		Properties pos  = new Properties();
		
		//调用Properties对象的Load方法存文件中的数据加载到Map集合中。
		pos.load(redaer);//文件中的数据顺管道加载到Map集合中，其中等号左边做key，右边做vaLue
		
		//通过 key来获取value
	 String  username =	pos.getProperty("username");
	 System.out.println(username); //admin
	 
	 String  password = pos.getProperty("password");
	 System.out.println(password);  //111
	 
	 String date  = pos.getProperty("date");
	 System.out.println(date);
		

	}

}
