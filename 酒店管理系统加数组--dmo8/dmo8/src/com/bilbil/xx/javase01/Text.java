package com.bilbil.xx.javase01;

import com.bilbil.xx.homework.MyStack;

public class Text {

	public static void main(String[] args) {
		//创建一个找对象，初始化容量是10个。
		MyStack stak = new MyStack();
		//调用方法压栈
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());
		stak.puse(new Object());//最后压入的。最先弹出来。（这个才符合规的数据结构。）	
		//压这个元素失败
		stak.puse(new Object());
		
		//弹栈
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		
		stak.pop();
		

	}
	
}
