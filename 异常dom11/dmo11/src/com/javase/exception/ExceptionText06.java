package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionText06 {
/*
 * 关于try..catch中的finalLy子句：
		1、在finalLy子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了
		finaLLy子句必须和try一起出现，不能单独编写。
		
2、finaLly语句通常使用在娜些情况下呢？
	通常在finaLLy语句块中完成资源的释放/关闭。
	因为finaLLy中的代码比较有保障。
	即使try语句块中的代码出现异常，finalLy中代码也会正常执行。


 */
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//创建输入流对象
			fis = new FileInputStream("D:\\java kf\\day1-115");
			//.....
			
			String s =null;
			//这里一定会出现空指针异常
			s.toCharArray();
			
			////流使用完需要关闭，因为流是占用资源的。
			//fis.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			//流的关闭放在这里比较保险。
			//finalLy中的代码是一定会执行的。
			//即使try中出现了异常！
			if (fis != null) {//避免空指针 异常
				try {//采用捕捉
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
		}
			
		}

	}


