package com.bjpowernode.javase.text001;
public class Text03 {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int retvalue = sumInt(i,j);
		System.out.println(retvalue);

	}

	public static int sumInt(int i, int j) {
		int c = i+j;
		int b = 15;
		int result = divide(c,b);
		return result;
	}

	private static int divide(int c, int b) {
		int a  = c /  b ;
		return a;
		//153
	}

}
