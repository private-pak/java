package com.javase.bean.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectText08 {
    public static void main(String[] args) throws Exception{
        StringBuffer s = new StringBuffer();
        Class VipClasss = Class.forName("com.javase.bean.VipClass");
        s.append(Modifier.toString(VipClasss.getModifiers()));
        s.append("class");
        s.append(VipClasss.getSimpleName());
        s.append("{\n");

        //拼接构造方法
        Constructor[]constructors = VipClasss.getConstructors();
        for(Constructor constructor :constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(VipClasss.getSimpleName());
            s.append("(");
            //拼接参数
            Class [] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes){
                s.append(parameterType.getSimpleName());
                s.append(",");

            }
            //删除最后下标位置上的宇符
            s.deleteCharAt(s.length() -1);
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);

    }
}
