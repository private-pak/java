package com.javase.exception;

//测试 改进 的myStack
public class ExcptionText11 {

	public static void main(String[] args) {
		// 创建 栈对象
		MyStack stack = new MyStack();
		
		
		//压栈
		try {
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			stack.puse(new Object());
			//栈已满，压栈失败
			stack.puse(new Object());
		} catch (MyStackOperationException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
		//弹栈
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			//弹栈失败 栈已空
			stack.pop();
			
		} catch (MyStackOperationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
