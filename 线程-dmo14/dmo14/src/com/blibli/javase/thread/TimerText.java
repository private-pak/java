package com.blibli.javase.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerText {

	public static void main(String[] args) throws Exception {
		
		//创建定时对象
		Timer timer =  new Timer();
		//Timer timer =  new Timer(ture); 守护线程方式 
		
		//指点定时任务
	//	timer.schedule(定时任务 , 第一次执行时间，相隔多久执行一次);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date firstTime = sdf.parse("2023-05-22 21:50:01");
		timer.schedule(new LogTimerTask(), firstTime,1000*10);//到 时间每10秒 备份一次

	}

}
//编写一个定时任务类
//假设这是一个记录日志的定时任务

class LogTimerTask  extends TimerTask{

	@Override
	public void run() {
		// 编写需要执行的任务 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strTime = sdf.format(new Date());
		System.out.println(strTime+":成功完成了一次用户数据备份");
			
		
	}
	
}
