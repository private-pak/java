package com.javase.exception;

public class MyStack {
	/*
	 * 编写程序，使用一维数组，模拟栈数据结构。
要求：
1、这个栈可以存储java中的任何引用类型的数据。
2、在规中提供push方法模拟压栈。（栈满了，要有提示信息。）
3、在栈中提供pop方法模拟弹机。（栈空了，也有有提示信息。）
4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
*/


	 

//	public static void main(String[] args) {
//		
//	}
	//向机当中存储元素，我们这里使用一维数组模拟。存到机中，就表示存估到数组中。
	//因为数组是我们学习java的第一个容器。
	//为什么选择object类型数组？因为这个栈可以存估java中的任何引用类型的数组
	//new AnimaL（）对象可以放进去，new   Person()对象也可以放进去。因为Animal和Persol的超级父类都是Object

	 private Object[] elements; // =  new Object[10];
	 
	//栈帧，永远指向栈顶部元素
	//那么这个默认初始值应该是多少。注意：最初的机是空的，一个元素都没有。
	// private int index =0;//如果index采用0，表示栈慎指向了顶部元素的上方。
	//private int index = -1;//如果index采用-1，表示栈帧指向了顶部元素。
	 private int index;
	 
	 /*
	  * 无参数构造方法。默认初始化机容量10
	  */
	 
	 public MyStack (){
		//一维数组动态初始化
		//默认初始化容量是10
		 this.elements = new Object[10];
		 //给index 初始化
		 this.index = -1;
	 }
	 /*
	  * 压栈方法
	  */

	 public void puse(Object obj) throws MyStackOperationException {
		 if (this.index >=  this.elements.length -1) {
			//创建异常对象
		//	 MyStackOperationException e = new MyStackOperationException("栈已满，压栈失败");
			//手动将异常抛出去！
		//	 throw e;
			 //合并(手动抛出异常)
			 throw new MyStackOperationException("栈已满，压栈失败");
			 
		}
		 //程序到这说明栈 还有空间
		 this.index++;//向栈中加1个元素，栈帧向上移动一个位置。
		 this.elements[index]  = obj;
		 System.out.println("压栈"+obj+"成功 "+index);
	 }
	 
	 /*
	  * 弹栈的方法，从数组中往外取元素。每取出一个元素，栈赖向下移动一位。
	  */
	 
	 public void pop() throws MyStackOperationException{
		 if(index <0) {
			 //System.out.println("弹栈失败 栈已空");
			 //return;
			 throw new MyStackOperationException("弹栈失败 栈已空");
		 }
		//程序到这说明栈没有空
		 System.out.println("弹栈"+elements[index]+"成功 "+index);
		 index--;
		 System.out.println("栈帧指向"+index);
	 }
	 
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object[] getElements() {
		return elements;
	}

	public void setElements(Object[] elements) {
		this.elements = elements;
	}
	
}
