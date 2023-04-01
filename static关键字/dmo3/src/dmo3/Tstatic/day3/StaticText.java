package dmo3.Tstatic.day3;

public class StaticText {
	//实例变量
	int i  = 100000;
	//实例方法
	public void dosmoe() {
		
	}
	
	//静态方法
	public static void main(String[] args) {
		StaticText s1 = new StaticText();
		System.out.println(s1.i);
		s1.dosmoe();
		//静态方法想调用实例方法或变量  要先 new
		
		System.out.println(MathUtil.jiaInt(1, 20));
		
	}//149

}
