package com.bilbil.xuexi;

public class SuperText01 {

	public static void main(String[] args) {
		Cat  c = new Cat();
		c.yiDong();

	}

}
class  Animal{
	public void move() {
		System.out.println("Animal move");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("Cat  move");
	}
	public void  yiDong() {
		this.move();
		move();
		super.move();
	}
}