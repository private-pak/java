package com.javase.Homework;

public class FIgji extends Weapon implements Moveable,Shootable{

	@Override
	public void shoot() {
		System.out.println("战斗机打鬼子");
		
	}

	@Override
	public void move() {
		System.out.println("战斗机飞翔");
		
	}
	

}
