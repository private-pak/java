package com.javase.Homework;

//*坦克是一个武器，可移动，可攻击。
public class Tank extends Weapon implements Moveable,Shootable{

	@Override
	public void shoot() {
		// TODO 自动生成的方法存根
		System.out.println("坦克攻击");
	}

	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println("坦克移动");
	}
	

}
