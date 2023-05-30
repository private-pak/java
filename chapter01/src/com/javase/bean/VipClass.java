package com.javase.bean;

public class VipClass {
    int ID;
    String name;
    boolean sex;

    public VipClass() {
    }

    public VipClass(int ID, String name, boolean sex) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "VipClass{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
