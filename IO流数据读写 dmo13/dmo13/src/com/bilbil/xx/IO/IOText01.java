package com.bilbil.xx.IO;

public class IOText01 {
/*
5、javaIo流这块有四大家族：

		java.io.Inputstream 字节输入流
		
		java.io.outputstream 字节输出流

		Java.io.Reader 字符输入流

		java.io.Writer 字符输出流
		四大家族的首领都是抽象类（abstract class）
	所有的流都实现了：java，io.closeable接口，都是可关闭的，都有close)方注
	
	流毕竟是一个管道，这个是内存和硬盘之间的通道，用完之后一定要关闭，不然会耗费（占用）很多资源。
	
	java.io.Flushable接口，都是可刷新的，都有flush（)方法。
			养成一个好习惯，输出流在最终输出之后，一定要记得flush（）
			刷新一下。这个剧新表示将通道/音道当申剩余未输出的数据
			强行输出完（清空管道！）刷新的作用就是清空管道。
			注意：如果没有flush（)）可能会导致丢失数据。


注意：在java中只要"类名以strean结尾的都是节流，以"Reader/writer"结尾的都是字符流


java.io包下需要掌握的流有16个：
	
	文件专属：
	java.io.FileInputstream
	java.io.FileOutputstream
	Java.io.FileReader
	java.io.FileWriter
	
		转换流：（将字节流转换成字符流）
		java.io.InputstreamReader
		Java.io.Outputstreamwriter
	
	缓冲流专属：
	Java.io.BufferedReader
	Java.io.Bufferedwriter
	java.io.BufferedInputstream
	java.io.Bufferedoutputstream
	
	数据流专属：
	java.io.DataInputstream
	java.io.DataOutputstream
	
	标准输出流：
java.io.PrintWriter
java.io.Printstrean
	
			对象专属流：
			java.io.objeotInputstream
			java.io.Objectoutputstream


 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
