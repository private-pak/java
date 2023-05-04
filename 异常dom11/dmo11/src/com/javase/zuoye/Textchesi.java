package com.javase.zuoye;

public class Textchesi {

	public static void main(String[] args) {
		//创建UserService对象
		UserService usesice  = new UserService();
		
		try {
			usesice.reguster("jack","147258369");
		} catch (IllegaINameException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}

	}

}
