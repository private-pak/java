package com.javase.Homework;
/*
 * 军队
 */
public class Army {
	
	//武器数组
	private Weapon[] weapons;
	
	//创建军队的构造方法
	//武器数量
	public Army (int count) {
		
		//动态初始化数组中每一个元素默认值是nulL。
		//武器数组是有了，但是武器数组中没有放武器。

		
		weapons = new Weapon[count];
	}
	
	//将武器加入数组
	public void addWeapon(Weapon weapon) throws AddWeaponException {
		for (int i = 0; i < weapons.length; i++) {
			if (null == weapons[i]) {
				weapons[i] = weapon;
				System.out.println(weapon+"武器添加成功");
				return;
			}
		}
		//程序如果执行到此处说明，武器没有添加成功
		throw new AddWeaponException("武器已到达最大数无法添加");
		
		
	}
	//所有可攻击的武器攻击
	public void attackAll() {
		//遍历 数组
		for (int i = 0; i < weapons.length; i++) {
			if(weapons[i]  instanceof Shootable) {
				Shootable  shootable = (Shootable)weapons[i];
				shootable.shoot();
			}
		}
	}
	//所有可移动的武器移动
	public  void moveAll() {
		for (int i = 0; i < weapons.length; i++) {
			if(weapons[i]  instanceof Moveable) {
				Moveable  moveable = (Moveable)weapons[i];
				moveable.move();
			}
		}
	}
}
