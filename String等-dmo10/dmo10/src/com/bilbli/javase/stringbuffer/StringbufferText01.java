package com.bilbli.javase.stringbuffer;

public class StringbufferText01 {
	/*
	 * 思考：我们在实际的开发中，如果需要进行字符串的频擎拼接，会有什么问题？ 因为java中的宇符串是不可变的，每一次拼接部会产生新宇符串
	 * 这样会占用大量的方法区内存。造成内存空间的浪费。
	 * 
	 * String s ="abc"; s+="hello";
	 * 
	 * 就以上两行代码，就导致在方法区字符串常量池当中创建了3个对象： "abc" "hello" "abchello"
	 * 
	 * 
	 * 如果以后需要进行大量字符串的拼接操作，建议使用jDK中自带的：
				java.Lang.StringBuffer	
				java.Lang.StringBuiLder

	 */
	public static void main(String[] args) {
		//创建 一个初始化容量为16个byte【】数组 （字符串缓冲区）
		StringBuffer stgbuffer = new StringBuffer(50);//这里的50是指定byte长度为50
		
		//拼接字符串，以后拼接字符串都调用append（）方法
		stgbuffer.append("a");
		stgbuffer.append("e");
		stgbuffer.append("R");
		stgbuffer.append("B");
		stgbuffer.append(3.156);
		stgbuffer.append(true);
		stgbuffer.append(1000L);
		//append方法底层进行追加时满了 会自己扩容
	
		//System.out.println(stgbuffer.toString());
		System.out.println(stgbuffer);

	}

}
