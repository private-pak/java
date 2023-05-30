package com.javase.bean.reflect;
/*
可变长参数
    int...args这就是可变长度参数
    语法是：类型.，（注意：一定是3个点。）

1、可变长度参数要求的参数个数是：0~N个。
2、可变长度参数在参数列表中必须在最后一个位置上.而且可变长度参数只能有1个

 */
public class ArgSText {
    public static void main(String[] args) {

        m(01);

        m2(1,"打","sf","sdf");

      //  m3("da","asda","sad");

        m3("我","J","a","v","a", "开","发","员");
    }

    public  static void m(int... args){
        System.out.println("m方法 执行");

    }
 //Vararg 形参必须为列表中的最后一个形参   public  static  void m2(int...args2,String...args1){}

    //必须在最后 只能有1个
    public static  void m2(int a , String...args1){

    }
    public  static  void m3(String...args2){
        for (int i= 0;i< args2.length;i++){
            System.out.print(args2[i]);
        }
    }



}

