package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcptionText04 {
/*
 * 深入try....catch
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*try {
			FileInputStream fis = new FileInputStream("C:\\Users\\123\\Pictures\\Feedback\\{0E845F2B-5BC1-46FB-9977-1CF415C0EA0D}");
			//System.out.println("异常");
			//读取文件
			fis.read();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			System.out.println("文件不存在");
		}catch (IOException e) {
			System.out.println("文件读取错误");
		}*/
		
		
		//换个格式java8
		try {
			FileInputStream fis = new FileInputStream("1");
		} catch (FileNotFoundException | ArithmeticException | NullPointerException  e) {
			System.out.println("错误");
		
		}
		//647
	}
		

}
