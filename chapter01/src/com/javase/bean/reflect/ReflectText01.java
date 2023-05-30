package com.javase.bean.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/*
验证反射机制的灵活性。
        验证反射机制的灵活性。
    java代码写一遍，再不改变java源代码的基础之上，可以做到不同对象的实例化。
    非常之灵活。（符合OCP开闭原则：对扩展开放，对修改关闭。I）

 */
public class ReflectText01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //通过lo流读取cLassinfo.properties文件
        FileReader  reader =  new FileReader("C:\\Users\\雷家大少爷\\IdeaProjects\\dom2\\chapter01\\classinfo.properties");
        //创建属性 类对象map
        Properties properties   =  new Properties();
        //加载
        properties.load(reader);
        //关闭流
        reader.close();

        //通过key获取value
        String  className = properties.getProperty("className");
        // System.out.println(className);

        //通过反射机制实例化对象
        Class  c = Class.forName(className);
        Object object = c.newInstance();
        System.out.println(object); //Thu May 25 20:53:23 CST 2023
    }
}
