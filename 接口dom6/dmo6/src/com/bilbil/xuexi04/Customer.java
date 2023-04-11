package com.bilbil.xuexi04;
//顾客
public class Customer {
	//顾客手里有一个菜单
	//CustomerhasaFoodMenu！（这句话什么意思：顾客有一个菜单）
	//记住：以后凡是能够便用hasa来描述的，统一以属性的方式存在。
	//实例变量，属性
	//推荐怎么写 面向抽象对象编程  减低程序耦合度 提升程序扩展性
	 private FoodMenu foodMenu;//封装
	 
	
	//如果怎么单写 就代表只能吃谋一个厨师的菜就（扩展性低）
	//ChinaCooker cc;//中餐厨师
	//AmericCooker ac;//西餐厨师
	 
	//构造方法
	public Customer() {
		
	}
	public  Customer (FoodMenu foodMenu) {
		this.foodMenu  = foodMenu;
		
	}
	//setter and getter
	public FoodMenu getFoodMenu() {
		return foodMenu;
	}
	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}
	//提供一个点菜的方法
	public void order() {
		//拿到菜单  调用get方法
		//FoodMenu fm= this.getFoodMenu();
		//也可以不调用get方法 因为private 封装类可以访问在本类中
		foodMenu.xhscjd();
		foodMenu.yxrs();
		foodMenu.yxqz();
	}
	
}
	/*CatisaAnimal，但凡满足isa的表示都可以设置为继承
	Customer has a FoodMenu,但凡是满足hasa的表示都以属性的形式存在。
	*/
/*
class Adderss{
	String city;
	String street;
	String zioode;
}

class User{
	String id;
	String name;
	Adderss addr;
}

public static void main(String[] args){
 		//局部变量
		//Addressaddr;
		//addr=new Address();
		 
		//合并.
		Address addr = new Address();
		User u = new User();
		u.id = 1;
		u.name = "zhangsan";
		u.addr = new Address();
		System.out.println(u.addr.city);
		System.out.println(u.addr.street);
		
		u.addr.zioode;
 		
*/

/*
	"自己"类
	//Myselfhas a Friend;
class Myself(
	//你这个对象，应该有一个朋友对象的电话号码。
	//电话号码就是一个对象的内存地址。联系你朋友的时候，打电话。
	//f是一个引用，f默认值是null，是nul1表示，你没有朋友.
	 
	Friend f;
	
	publicMyself(){
	
	}
		//通过构造方法能不能给你一个朋友对象，
			public Myself(Friend f) {
			this.f = f;
		}
		
	public  static void main(string[]args){
		//创建朋友对象
	 Friend f =new  Friend()：//朋友对象有了
		//创建对象的同时交朋友，
		MySelf m2 =newMySelf(f);
		//创建自已对象
	目前还没有交朋友。
	Myselfm-newMyself（：//自己对象
	//交朋友
	 m.f = f;//吧朋友的地址给了你
	 //朋友类
 class Friend{
 }
 
*/





























