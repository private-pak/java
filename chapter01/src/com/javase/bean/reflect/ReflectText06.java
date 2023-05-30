package com.javase.bean.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectText06 {
    public static void main(String[] args) throws Exception {
        //获取userService  类
        Class userserviceClass = Class.forName("com.javase.bean.service.UserService");

        //获取所有的Method
        Method [] methods = userserviceClass.getMethods();
      //  System.out.println(methods.length);

        //遍历
        for (Method method : methods){
            System.out.println(Modifier.toString(method.getModifiers()));// 返回修饰符列表

            System.out.println(method.getReturnType().getSimpleName());//返回值类型

            System.out.println(method.getName());//方法名

            Class [] classgetParameterTypes = method.getParameterTypes();
           for (Class classgetParameterType : classgetParameterTypes){
               System.out.println(classgetParameterType.getSimpleName());
           }
        }
    }
}
