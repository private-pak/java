package com.javase.bean.reflect;
/*
class.forName()发生了什么
        记住，重点：
    如果你只是希望一个类的静您代码块执行，其它代码一律不执行，
        你可以使用：
            CLass.forName（"完整类名"）；
            这个方法的执行会导致类加载，类加载时，静态代码块执行。！

 */
public class ReflectText02 {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            //CLass.forName(Q这个方法的执行会导致：类加载。
            Class.forName("com.javase.bean.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
/*
class MyClass{
    //静态代码块在类加载时执行，并且只执行一次。
    static {
        System.out.println("MyClass 类静态代码块");
    }
}*/
