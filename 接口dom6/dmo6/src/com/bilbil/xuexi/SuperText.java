package com.bilbil.xuexi;
/*
 * 部分情况下都是可以省略的，
1、this.  super.
2、this，什么时候不能省略？
public void setName(string name)(
		this.name  name;
什么时候不能省略？
	3、super.什么时候不能省略？
		父中有，子中又有，如果想在子中访问"父的特征”，super.不能省略
super.

super.的构造方法，目的是：创建子类对象的时候，先初始化父类型特征，
super的使用：
	super.属性名【访问父类的属性】
	super.方法名（实参）【访问父类的方法】



 */
public class SuperText {

	public static void main(String[] args) {
		Vip v  =  new Vip("张三");
		v.shopping();
		v.dosoem();

	}

}
class Customer{
	String name;
	public Customer() {}
	public   Customer(String name) {
		super();
		this.name  = name;
	}
	
	public void dosoem() {
		System.out.println(this.name+"do soem");
		System.out.println(name+"do some");
		
		//System.out.println(super.name + "do some"); 错误  找不到 符号
	}
}
class Vip extends Customer{
	
	//String name //= "张了";
	
	public Vip() {}
	public Vip(String  name) {
		super(name);
		
	}
	public void shopping() {
		System.out.println(this.name +  "正在购物");
		System.out.println(super.name +  "正在购物");
		System.out.println(name +  "正在购物");
	}
}
