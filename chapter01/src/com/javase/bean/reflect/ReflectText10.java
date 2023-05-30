package com.javase.bean.reflect;

public class ReflectText10  {
    public static void main(String[] args) throws Exception {
        Class stringClass = Class.forName("java.lang.String");
        //获取String的父类
        Class superCLass = stringClass.getSuperclass();
        System.out.println(superCLass.getName());

        //获取String类实现的所有接口（一个类可以实现多个接口）
        Class[] inter = stringClass.getInterfaces();
        for (Class intr : inter){
            System.out.println(intr.getName());
        }

    }
}
