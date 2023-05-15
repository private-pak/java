package com.bilbil.xx.ObjectOutputSteam.Student;

import java.io.Serializable;

/*
SerializabLe这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成

 */
public class StudentText01 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6011914972609043723L;
	private int ID;
	private String name;

	public StudentText01() {
		super();
	}

	public StudentText01(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "学生信息:" + ID + ", 名字：" + name;
	}
}
