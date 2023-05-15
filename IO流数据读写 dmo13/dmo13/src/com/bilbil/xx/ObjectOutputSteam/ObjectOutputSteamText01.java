package com.bilbil.xx.ObjectOutputSteam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bilbil.xx.ObjectOutputSteam.Student.StudentText01;
/*
java.io.NotSerializableException:
	
	StudentText01对象不支持序列化！！！！
	
2、参与序列化和反序列化的对象，必须实现seriaLizabLe接口。

3、注意：通过源代码发现，SerializabLe接口只是一个标志接口：
		public interface Serializable {
		}
		
		这个接口当中什么代码都没有。
		那么它起到一个什么作用呢？
		起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇。
		SerializabLe这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成
		一个序列化版本号。！
		
		java语言中是采用什么机制来区分类的
				第一：首先遇过类名进行比对，如果类名不二样，肯定不是同一个类。
				第二：如果类名一样，再怎么进行类的区别？靠序列化版本号进行区分。
	
	请思考？
		这种自动生成序列化版本号有什么缺陷？
		这种自动生成的序列化版本号缺点是：一旦代码码定之后，不能进行后续的修改
		因为只要修改，必然会重新编译，此时会生成全新的序列化版本号，这个时候java
		虚拟机会认为这是一个全新的类。（这样就不好了）\
		
		最终结论：
			凡是一个类实现了SeriaLizabLe接口，建议给该类提供一个固定不变的序列化版本号。
			这样，以后这个类即使代码修改了，但是版本号不变，java虚拟机会认为是同一个类。
			//建议将序列化版本号手动的写出来。不建议自动生成




 */
public class ObjectOutputSteamText01 {

	public static void main(String[] args) throws IOException, IOException {
		StudentText01  s01 = new StudentText01(2514112,"张三");
		//序列化
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\新建文件夹 (2)\\2\\101.txt"));
		
		//序列化对象
		oos.writeObject(s01);
		
		//刷新
		oos.flush();
		
		//关闭
		oos.close(); 

	}

}
