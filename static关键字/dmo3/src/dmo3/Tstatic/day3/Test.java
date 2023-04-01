package dmo3.Tstatic.day3;
/*
 * 实例语句块/代码块
 */
public class Test {
	//构造函数
	public Test(){
		System.out.println("text类的缺省构造器执行");
	}
	
	//实例语句块/代码块
	{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	{
		System.out.println(3);
	}

	//主方法 
	public static void main(String[] args) {
		System.out.println("1----------1");
		Test ne = new Test();
		new Test();
		
		

	}

}
