package com.javase.bean.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;

//文件路径
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {

       // FileReader reader =  new FileReader("C:\\Users\\雷家大少爷\\IdeaProjects\\dom2\\chapter01\\classinfo.properties");

        //接下来说一种比较通用的一种路径。即使代码换位了，这样编享仍然是通用的。
        //注意：使用以下通用方式的前提是：这个文件必须在类路径下。
        //什么类路径下？方式在src下的都是类路径下。【记住它】
        //src是类的根路径
        /*
        解释：
                Thread.currentThread（）当前线程对象
                getContextCLassLoader（）是线程对象的方法，可以获成到当前线程的类加载器对象。
                getResource（）【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。

         */

        String  path  = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(path);
        // /C:/Users/%e9%9b%b7%e5%ae%b6%e5%a4%a7%e5%b0%91%e7%88%b7/IdeaProjects/dom2/chapter01/out/production/chapter01/classinfo2.properties
        //采用以上的代码可以拿到一个文件的绝对路径。

        //获取MyClass.java文件
      String path2 =  Thread.currentThread().getContextClassLoader().getResource("com/javase/bean/reflect/1.Txt").getPath();
        System.out.println(path2);
    }
}








