package com.bilbil.xx.Jiudian;

import java.util.Scanner;

public class HotelMgtSystem {
/*
 * 某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。净
1、该系统的用户是：酒店前台。
2、酒店使用一个二维数组来模拟。“Room[][]rooms;"
3、酒店中的每一个房间应该是一个java对象：Room
4、每一个房间RoOm应该有：间编号、房间类型、房间是否空闲
5、系统应该对外提供的功能：
可以预定房间：用户输入房间编号，订房。
可以返房：用户输人房间编号，退房。
可以查看所有房间的状态：用户输入某个搭令应该可以查看所有房间决态。

 */
	public static void main(String[] args) {
		//创建酒店对象
		Hotel  hotel = new Hotel();
		//打印房间状态
		//hotel.print();
		
		System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
		System.out.println("功能编号对应的功能：[1]表示查看房间列表。[2]表示订房。[3]退房。[0]推出系统");
		Scanner s = new Scanner(System.in);
		
		//一直循环  输入 0 退出系统
		while(true) {
		System.out.print("请输入功能编号 :");
		int i = s.nextInt();
		if(i == 1) {
			//查看房间列表
			hotel.print();
		}else  if(i  ==   2) {
			//订房
			System.out.println("请输入订房编号：");
			int roomID  = s.nextInt();
			hotel.order(roomID);
		}else if(i == 3) {
			//退房
			System.out.println("请输入退房编号：");
			int roomID =  s.nextInt();
			hotel.exit(roomID);
		
			
		}else if(i  ==  0){
		System.out.println("再见，下次再来");
		return;
	}else {
		//出错了 
		System.out.println("请输入正确的功能编号");
	}
	}
	}//567
}
