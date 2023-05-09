package com.javase.xx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionText05 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		//创建用户对象
		User u1 = new User("jk");
		User u2 = new User("jk");
		
		//加入集合
		c.add(u1);
		
		//判断集合中是否保含u2
		//没有重写equals方法之前   所以是false
		//System.out.println(c.contains(u2));//false
		
		//重写equals 之后比较是name
		
		System.out.println(c.contains(u2));//true

	}

}
class User{
	private String name;
	public User() {}
	public User(String name) {
		this.name = name;
	}
		//重写equals方法
	//将来调用equaLs方法的时候，一定是调用这个重享的equaLs方法。
	//这个equals方法的比较原理是：只要姓名一样就表示同一个用户。

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	*/
	
	public boolean equals(Object o) {
		if(o == null || !(o instanceof User)) return false;
		if(o == this) return true;
		User u = (User)o;
		return u.name.equals(this.name);
	}
	
}