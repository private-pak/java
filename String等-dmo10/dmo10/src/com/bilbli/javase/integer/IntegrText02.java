package com.bilbli.javase.integer;

public class IntegrText02 {
/*
 * 8种基本数据类型对应的包装类型名是什么？
包装类型					基本数据类型
------------------------------
byte					java.Lang.Byte(父类 Number)
short					java.Lang.Short(父类 Number)
int						java.Lang.Integer(父类 Number)
Long					java.Lang.Long(父类 Number)
float					java.Lang.FLoat(父类 Number)
double					java.Lang.DoubLe(父类 Number)
booLean					java.Lang.BooLean(父类 Object)
char					java.Lana.Character(父类 Object)

Number 是一个抽象类，无法实例化

 */
	
	public static void main(String[] args) {
		//123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换。
		//基本数据类型-（转换为）->引用数据类型（装箱）
		Integer  s = new  Integer(123);
		
		//将引用数据类型--（转换为）-》基本数据类型
		float f  = s.floatValue();
		System.out.println(f);//123.0
		
		//将引用数据类型--（转换为）-》基本数据类型（拆箱）
		int retVaue =  s.intValue();
		System.out.println(retVaue);//123

	}

}
