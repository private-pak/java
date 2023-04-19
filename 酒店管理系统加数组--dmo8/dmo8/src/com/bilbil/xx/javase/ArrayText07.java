package com.bilbil.xx.javase;

public class ArrayText07 {
/*
 * 一维数组的深入，数组中存储的类型为：引用数据类型
 */
	public static void main(String[] args) {
		
		int[] b  = {100,200,300};
		System.out.println(b[1]);
		
		
		int[] a = {1000};
		
		int[]  array  = {1,2,3};
		for (int i = 0; i < array.length; i++) {
			/*int temp  =  array[i];
			System.out.println(temp);*/
			System.out.println(array[i]);
		}
		
		
		
		
		// 创建一个AnimaL类型的数组
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal[]   animals  = {a1,a2};
		//对 Animal 数组进行遍历
		for(int i = 0; i < animals.length;i++) {
			/*Animal a = animals[i];
			a.move();*/
			//合并
			animals[i].move();//这个move()方法不是数组的。是数组当中AnimaL对象的move()方
			
			
			Animal[] ans  = new Animal[2];
			//创建一个AnimaL对象，放到数组的第一个盒子中。
			ans[0] =  new  Animal();
			
			//Animal数组中只能存放AnimaL类型，不能存放Product类型。
			//ans[1] = new produt();
			
			//Animal数组中可以存放Caatt类型的数据，因为Caatt是一个AnimaL。
			//Caatt是AnimaL的子类。
			ans[1] = new Caatt();
			
			
			//创建一个Animal类型的数组   ，数组 当中存储 Caatt  和Bird
			/*Caatt c1 =  new Caatt();
			Bird b1 = new Bird();
			Animal[] anis  = {c1,b1};*/
			Animal [] anis = {new Caatt(),new Bird()};
			for (int j = 0; j < anis.length; j++) {
				//这个取出来的可能是caatt，也可能是Bird，不过肯定是一个Animal
				//如果调用的方法是父类中存在的方法不需要向下转型。查接使用父类型引用调用即可。
				//anis[j]
				Animal an = anis[j];
				an.move();
				
			}
		}
	}

}
class Animal{
	public void  move() {
		System.out.println("Animal move.....");
	}
}
class produt{
	
}
class Caatt extends Animal{
	public void move() {
		System.out.println("小猫喵喵喵喵喵喵");
	}
	
}
class Bird extends Animal{
	public void move() {
		System.out.println("Bird fiy");
	}
}
