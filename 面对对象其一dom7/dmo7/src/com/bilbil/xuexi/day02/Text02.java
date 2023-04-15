package com.bilbil.xuexi.day02;//包变化了

import com.bilbil.xuexi.day01.User;

public class Text02 {

	public static void main(String[] args) {

				User user =  new User();
		    
				// System.out.println(User.age);//错误 protected
				// System.out.println(user.name);//错误 默认
				System.out.println(user.weidth);//public 公开的那都可以 


	}

}
