package com.javase.bean.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesText {
    public static void main(String[] args) throws Exception {

/*        String  path  = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();

        FileReader Reader  = new FileReader(path);*/

        //直接以流的形式返回
        InputStream Reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo2.properties");

        Properties pro =  new Properties();
        pro.load(Reader);
        Reader.close();

        String  className  =  pro.getProperty("className");
        System.out.println(className);

        int classpassword = Integer.parseInt(pro.getProperty("classpassword"));
        System.out.println(classpassword);
//819
    }
}
