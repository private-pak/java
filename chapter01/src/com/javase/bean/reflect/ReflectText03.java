package com.javase.bean.reflect;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射Student类当中所有的FieLd
 */
public class ReflectText03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取类
        Class  studentClass = Class.forName("com.javase.bean.Student");

        String className =  studentClass.getName();
        System.out.println("完整类名："+className);

        String simpleName = studentClass.getSimpleName();
        System.out.println("简单类名："+simpleName);

        //获取类中所有的pubic修饰的field
       Field[] files = studentClass.getFields();
       System.out.println(files.length); //只返回 1 个
        //取出这个field
        Field  field   = files[0];
        //取出这个field的名字
         String fieldName = field.getName();
         System.out.println(fieldName);//ID

        System.out.println("-------------------");

        //取出所有的field
        Field[] fs =  studentClass.getDeclaredFields();
        System.out.println(fs.length); //4

        //遍历
        for (Field field1 :fs){
            //获取属性的修饰类型列表
        int  field1Modifiers =    field1.getModifiers();
            System.out.println(field1Modifiers); //返回的修饰符是一个数字，每个数字是修饰符的代号！！！
            //可以这个“代号"数宇转换成“字符申”码？
            String modifierString = Modifier.toString(field1Modifiers);
            System.out.println(modifierString);

            //获取属性的类型
            Class fieldType= field1.getType();
             //    String   fName  =  fieldType.getName();
            String fName = fieldType.getSimpleName();
            System.out.println(fName);

            //获取属性的名字
            System.out.println(field1.getName());
        }

    }
}
