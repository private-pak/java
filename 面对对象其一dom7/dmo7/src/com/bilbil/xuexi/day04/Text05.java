package com.bilbil.xuexi.day04;

public class Text05 {

	public static void main(String[] args) {
		/*
		Stunde  sde1   = new Stunde(123123,"康师傅");
		Stunde  sde2   = new Stunde(123123,"康师傅");
		System.out.println(sde1 == sde2);//false 所以引用的字符串用equals
		System.out.println(sde1.equals(sde2));//ture
		*/
		//也可以怎么写
		Stunde  sde1   = new Stunde(123123,new  String("康师傅"));
		Stunde  sde2   = new Stunde(123123,new  String("康师傅"));
		System.out.println(sde1 == sde2);//false 所以引用的字符串用equals
		System.out.println(sde1.equals(sde2));//ture
		
	}

}
class  Stunde{
	int ID;
	
	String  school;
	
	//重写toString方法
	public String toString() {
		return "学号"+ ID +",所在学校名称"+school;
	}

	public Stunde() {
		super();
	}

	public Stunde(int iD, String school) {
		super();
		ID = iD;
		this.school = school;
	}
	
	//重写equals方法\
	//需要：当一个学生的学号相同，并且学校相同 表示同一个学生 
	
	public boolean equals  (Object obj) {
		if(obj == null ||  !(obj instanceof Stunde)) return false;
		if(this == obj) return true;
		Stunde sde =(Stunde)obj;
		if(this.ID == sde.ID &&  this.school.equals(sde.school)) {
			return  true;
		}
		return false;
	}
	
	
	
}