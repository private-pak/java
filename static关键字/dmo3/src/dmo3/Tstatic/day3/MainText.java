package dmo3.Tstatic.day3;

public class MainText {
	/*
	 * public表示公开的，在任何位置都是可以访问的
	 * static表示静态的，所以 类名. 的方式 即可访问，不需要创建对象，就可以 调用mian方法
	 * void表示mian方法执行结束之后不返回任何值
	 * main是mian方法的方法名
	 * (string[] args)是mian方法的形式参数列表
	 */

	public static void main(String[] args) {
			main(1);

	}
	public static void main(int i) {
		System.out.println(i);
	}

}
