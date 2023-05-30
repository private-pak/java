package com.javase.bean;

/*
获取到CLass，能干什么？
    通过cLass的newInstance（）方法来实例化对象。
    注意：newInstance（）方法内部实际上调用了无参数构造方法，必须保证无参构造存在才可以
 */
public class ReflectText01 {
    public static void main(String[] args) {
        //这是不使用反射机制，创建对象
        User user = new User();
        System.out.println(user);


        //通过反射机制 获取class 通过class 来实例化对象
        //下面这段代码是以反射机制的方式创建对象。
        try {
            Class c = Class.forName("com.javase.bean.User"); //c代表USer类
            try {

                Object obj = c.newInstance();
                //重点是：newInstance（）调用的是无参构造，必须保证无参构造是存在的！
                //newInstance（）这个方法会调用User这个类的无参数构造方法，完成对象的创建。

                System.out.println(obj); //com.javase.bean.UserService@10f87f48
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
