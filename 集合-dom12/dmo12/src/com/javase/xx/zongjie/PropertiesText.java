package com.javase.xx.zongjie;

import java.util.Properties;

public class PropertiesText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Properties pros= new Properties();
		pros.setProperty("name", "Java");
		pros.setProperty("password", "14782369");
		
		//取
		String name =pros.getProperty("name");
		String  password  = pros.getProperty("password");
		System.out.println(name);
		System.out.println(password);
	}

}
//720