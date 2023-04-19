package com.bilbil.xx.javase;

public class ArrayText08 {
/*
 * 关于一维数组的扩容。
*在iava开发中，数组长度一且确定不可变，那么数组满了怎么办？
		数组满了，需要扩容。
		
java中对数组的扩容是：
		先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组中

 */
	public static void main(String[] args) {
		//java中的数组是怎么进行拷贝的呢？
		//System.array copy(5个参数);
		
		//拷贝源
		int[] src   = {1,22,33,44,55};
		
		//拷贝目标
		int [] dest = new int[20];//动态初始化一个长度为20的数组，每一个元素默认值0
		
		//调用JDk System类中的arraycopy方法，来完成数组的拷贝
		//System.arraycopy(src,srcPos:1,dest,destPos:3, length:2)
	/*	System.arraycopy(src,1,dest,3,2);

		//遍历数组
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]);//0 0 0 22 33 0.....0
		}
		*/
		System.arraycopy(src, 0, dest, 0, src.length);
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);//1 22 33 44  55 0.....0
		}
		System.out.println("-------------");
		
		//数组中如果存储的元素是引用，可以拷贝？当然可以。
		String[] strt = {"hello","java","c++","mysql","jdbc"};
		String[] newStrs  =new String[20];
		System.arraycopy(strt, 0, newStrs, 0, strt.length);
		for (int i = 0; i < newStrs.length; i++) {
			System.out.println(newStrs[i]);//hello java c++ mysql jdbc null...null
		}
		System.out.println("-------------");
		
		Object[] objes =  {new Object(),new Object(),new Object()};
		Object[] newobject  = new Object[10];
		//思者一下：这里拷贝的时候是拷贝对象，还是拷贝对象的地址。（地址。）
		System.arraycopy(objes, 0, newobject, 0, objes.length);
		for (int i = 0; i < newobject.length; i++) {
			System.out.println(newobject[i]);
			/*java.lang.Object@626b2d4a
			java.lang.Object@5e91993f
			java.lang.Object@1c4af82c
			null
			null
			null*///558
		}
	}

}
