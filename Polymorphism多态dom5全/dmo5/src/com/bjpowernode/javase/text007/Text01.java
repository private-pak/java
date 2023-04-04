package com.bjpowernode.javase.text007;

public class Text01 {

	/*
	 * 访问控制权限修饰符：
			1、访问控制权限修饰符来控制元索的访问范围
			
			2、访问控制权限修饰符包括：
				public    表示公开的，在任何位置都可以访问
				proteated 同包，子类
				块省		  同包
				private  表示私有的，只能在本类中访问

			3、访问控制权限修饰符可以修饰类、变量、方法...
			
			4.当某个数据只细希望子类使用，使用porotected进行修饰
			5.修饰符的范围：
				private < 缺省  < protected <  public

	 */
	public static void main(String[] args) {
			User u= new User();
			System.out.println(u.i);
			System.out.println(u.j);

	}

}
