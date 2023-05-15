package com.bilbil.xx.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

//记录日志的方法。

public class Runzhi {	
		public static void  log(String mag) throws IOException {
			
			PrintStream out = new PrintStream(new FileOutputStream("D:\\\\新建文件夹 (2)\\\\Tem.txt",true));
			System.setOut(out);
			
			//获取时间
			Date  nowTime = new Date();
			SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss SSS");
			String strTime = simpledateformat.format(nowTime);
			
			System.out.println(strTime+":"+mag);
			
			
			
		}

}
