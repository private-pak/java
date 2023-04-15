package com.bilbil.xuexi.day04;

public class Text06 {

	public static void main(String[] args) {
//		Address addr  = new Address("成都","大学","11111");
//		User uu = new User("张三",addr);
		//也可以怎么写
		User uu = new User("张三", new Address("成都","大学","11111"));
		User uu01 = new User("张三", new Address("成都","大学","11111"));
		System.out.println(uu.equals(uu01));//ture
		
		User uu02 = new User("张三", new Address("北京","大学","11111"));
		System.out.println(uu.equals(uu02));//false
	}

}
class User{
	String name;
	Address adder;
	
	public User() {
		super();
	}

	public User(String name, Address adder) {
		super();
		this.name = name;
		this.adder = adder;
	}
	
	//重写equlas方法
	//重写规则：一个用户的用户名和家庭住址都相同，表示同一个用户
	public boolean equals(Object obj) {
		if(obj  == null || !(obj instanceof User))
			return  false;
		if(this == obj) 
			return true;
	
		User  u  =(User)obj;
		if(this.name.equals(u.name) &&  this.adder.equals(u.adder)) {
			return true;
		}
		return false;
	}

}
class Address{
	String city;
	String street;
	String zipootde;
	
	public Address() {
		
	}
	public Address(String city, String street, String zipootde) {
		super();
		this.city = city;
		this.street = street;
		this.zipootde = zipootde;
	}
	/*
	 * 注意：这里并没有重写equals方法。
	 * 这里的ecuals方法判断的是：Address对象和Address对象是否相等：
	 * Address中的equals方法没有重写的时候，比较的是对象的内存地址。
	 */
	public boolean equals(Object obj) {
		if(obj == null  || !(obj instanceof Address)) 
			return  false;
		if(this  == obj)
			return true;
		Address ads  = (Address)obj;
		if(this.city.equals(ads.city)
				&& this.street.equals(ads.street)
				&& this.zipootde.equals(ads.zipootde)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
