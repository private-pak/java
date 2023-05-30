package com.javase.bean.reflect;

import com.javase.bean.VipClass;

import java.lang.reflect.Constructor;

public class ReflectText09 {
    public static void main(String[] args)throws Exception {
        //不使用反射机制
        VipClass v1 = new VipClass();
        VipClass v2 = new VipClass(125,"你好",true);

        //使用反射机制怎么创建对象

        Class  c  = Class.forName("com.javase.bean.VipClass");
        //调用无参构造方法
        Object obj = c.newInstance();
//第一步：先获取到这个有参数的构造方法
      Constructor constructor= c.getDeclaredConstructor(int.class,String.class,boolean.class);
        //第二步：调用构造方法new对象
      Object newobj =  constructor.newInstance(357,"你好吗",true);
        System.out.println(newobj); //VipClass{ID=357, name='你好吗', sex=true}

        //获取无参数构造方法
        Constructor constructor1 =c.getDeclaredConstructor();
        Object newobj2 = constructor1.newInstance();
        System.out.println(newobj2); //VipClass{ID=0, name='null', sex=false}

    }
}
