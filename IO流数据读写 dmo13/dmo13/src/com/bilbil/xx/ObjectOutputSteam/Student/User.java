package com.bilbil.xx.ObjectOutputSteam.Student;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2363606234215458936L;
	//建议将序列化版本号手动的写出来。不建议自动生成
//	private  static final long  serialVersionUID = 147258369456L;
	
	// transient关键字表示游离的，不参与序列化。
	private transient int ID;
	private String name;
	

	@Override
	public String toString() {
		return "用户名  ID=" + ID + ", 名字 ：" + name;
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

	public User() {
		super();
	}

	public User(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

}
