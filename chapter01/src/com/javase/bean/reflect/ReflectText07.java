package com.javase.bean.reflect;

import com.javase.bean.service.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
重点：必须掌握，通过反射机制怎么调用一个对象的方法？
 */
public class ReflectText07 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Class userserviceClass = Class.forName("com.javase.bean.service.UserService");
            //创建对象
        Object obj = userserviceClass.newInstance();
        // 获取Method
        Method loginMethod = userserviceClass.getDeclaredMethod("login", String.class, String.class);
            /*
            //调用方法
            //调用方法有几个要素？也需要4要素。
            //反射机制中最最最最最重要的一个方法，必须记住。{ invoke }
//四要素：
/*
LoginMethod方法
obj对象
"admin","123"实参
retVatue返回值

             */
     Object retValue = loginMethod.invoke(obj,"admin","159"); //true
        System.out.println(retValue);


    }
}
