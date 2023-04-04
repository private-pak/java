package com.bjpowernode.javase.text001;
public class Text01 {
	public static void main(String[] args) {
		//父类引用指向子类型对象
		//向上转型
		Animal a1 =  new Cat();
		
		Animal a2 =  new Bird();
		
		//向下转型【只有当访问子类对象当中持有的方法】
		if(a1 instanceof  Cat) {
			Cat c3 = (Cat)a1;
		}else if(a2 instanceof Bird) {
			Bird  b2 = (Bird)a2;

	}

}
}