package com.javase.bean.service;
/*
用户数据类
 */
public class UserService {
    int ID;
    int password;
    public boolean login(String name,String password){
        if ("admin".equals(name) && "159".equals(password)) {
            return true;
        }
        return false;
    }

    public  void logout(){
        System.out.println("退出");
    }
}
