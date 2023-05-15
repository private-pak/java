package com.bilbil.xx.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAll {
//拷贝目录
	public static void main(String[] args) {
		//拷贝源
		File srcFile   = new File("D:\\新建文件夹 (2)\\1\\1.txt");
		//拷贝目标
		File daetFile = new  File("C:\\");
		//调用拷贝 方法
		FileInputStream  in   = null;
		FileOutputStream out  = null;
		 
		try {
			in = new FileInputStream(srcFile);
			String path =(daetFile.getAbsolutePath().endsWith("\\") ? daetFile.getAbsolutePath() : daetFile.getAbsolutePath() +  "\\" )+srcFile.getAbsolutePath().substring(3);
			out = new FileOutputStream(path);
			
			byte[] bytes = new byte[1024*10];
			int readCount = 0;
			while((readCount = in.read(bytes)) !=-1) {
				out.write(bytes,0,readCount);
			}
			
			out.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}
		
		
		copyDir(srcFile,daetFile);
		
	}

private static void copyDir(File srcFile, File daetFile) {
	if(srcFile.isFile()) {
		//srcfile  如果是一个文件的话就 递归结束
		return;
	}
	
	//获取原下面的子目录
	File[] files =srcFile.listFiles();
	//测试一下
	//System.out.println(files.length);
	for(File  file : files) {
		//获取所有文件 的绝对路径
		System.out.println(file.getAbsolutePath());
		if(file.isDirectory()) {
			String srcDir = file.getAbsolutePath();
			String destDir =  (daetFile.getAbsolutePath().endsWith("\\") ? daetFile.getAbsolutePath() : daetFile.getAbsolutePath() +  "\\" )  +  srcDir.substring(3);
			File newFile = new File(destDir);
			if(!newFile.exists()) {
				newFile.mkdirs();
			}
			
		}
		
		
		//递归
		copyDir(file, daetFile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
