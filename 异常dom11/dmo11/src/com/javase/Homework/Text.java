package com.javase.Homework;

public class Text {

	public static void main(String[] args) {

//构建军队
		Army army  =  new Army(4);
		
		//创建武器对象
		Yunshuji yunshuji =new Yunshuji();
		Tank tank  =new Tank();
		Gaoshepao gaoshepao =  new Gaoshepao();
		FIgji flgjj = new FIgji();
		FIgji flgjj1 = new FIgji();
		FIgji flgjj2 = new FIgji();
		
		
		//添加武器
		try {
			army.addWeapon(yunshuji);
			army.addWeapon(tank);
			army.addWeapon(gaoshepao);
			army.addWeapon(flgjj);
			army.addWeapon(flgjj1);
			army.addWeapon(flgjj2);
			

		} catch (AddWeaponException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
		//移动
		army.moveAll();
		//攻击
		army.attackAll();
		
	}

}
