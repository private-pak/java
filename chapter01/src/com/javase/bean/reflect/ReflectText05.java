package com.javase.bean.reflect;

import com.javase.bean.Student;

import java.lang.reflect.Field;

/*
必须掌握：
怎么通过反射机制访问一个java对象的属性？
给属性赋值set
获取属性的值get

 */
public class ReflectText05 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
 /*       //我们不使用反射机制，怎么去访间一个对象的属性呢？
        Student s = new Student();
//给属性赋值
        s.ID = 1111;
//读属性值
        System.out.println(s.ID);

*/
      //  使用反射机制，怎么去访间一个对象的属性。（set get）
        Class studentClass =  Class.forName("com.javase.bean.Student");
       Object obj  =  studentClass.newInstance(); //obj就是student对象。（底层调用无参数构造方法）

        //获取 ID （根据属性的名称来获取FieLd）
        Field IDfield = studentClass.getDeclaredField("ID");
      //  System.out.println(IDfield);

        //给obj对象（Student）的ID属性赋值
        IDfield.set(obj,159357);  //给obj对象的 ID赋值

        //读取属性的值
        System.out.println(IDfield.get(obj)); //159357
    }
}



















