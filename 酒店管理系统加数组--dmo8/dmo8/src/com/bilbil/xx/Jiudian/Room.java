package com.bilbil.xx.Jiudian;

import java.util.Objects;

public class Room extends Object{
/*
 * 房间
 */
	
	private  int ID;
	private String type;
	//*true表示空闲，房间可以被预定。
	//*faLse表示占用，房间不能被预定。

	private boolean status;

	public Room(int iD, String type, boolean status) {
		super();
		ID = iD;
		this.type = type;
		this.status = status;
	}

	public Room() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		
		return status;
	}
//	public boolean getStatus() {
//		return status;
//	}

	public void setStatus(boolean status) {
		this.status = status;
	}



//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Room other = (Room) obj;
//		return ID == other.ID && status == other.status && Objects.equals(type, other.type);
//	}
	
	//equals 重写
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Room)) return false;
		if(this   == obj) return true;
		Room other = (Room) obj;
		//当前房间编号等于传过来的房间对象的房间编号。认为是同一个房间。
		return this.getID() == other.getID();
	}
	
	
	
	//toString 重写
	public  String toString() {
		//return"[191,单人间，占用]";
		//return"[191,单人间，占用]";//写死了
		//动态（把一个变量塞到一个字符串当中，口诀：加一个双引号，双引号中间加两个加号，两个加号中加变量名
		return"["+ID+","+type+","+(status  ? "空闲" : "占用")+"]";
	}
	
	////编写一个临时程序测试以下
	//一会可以删除这个moin方法
	/*public static void main(String[] args) {
		Room  rm  =new Room(101,"单人间",false);
		System.out.println(rm.toString());  [101,单人间,占用]
	}
	
	*/
	
	
	
	
	
}
