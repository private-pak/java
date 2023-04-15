package com.bilbil.xuexi.day03;//包 变化了

import com.bilbil.xuexi.day01.User;

/*
 * User在 com.bilbil.xuexi.day01包下
 * Vip在  com.bilbil.xuexi.day03包下
 * User和Vip不在 同一个包下
 * 但是 vip是User的子类
 */
public class Vip  extends User{
	public void shipping() {//实例方法
		//this  表示当前对象
		System.out.println(this.age);//protected 可以
		//System.out.println(this.name);//这个默认的name不行
	}

}
