package dmo3.Tstatic.day1;

public class ChieseText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chiese zhangsan = new Chiese("12", "张三", "中国", 123);
		System.out.println(zhangsan.id + "." + zhangsan.name + "." + zhangsan.guoji + "." + zhangsan.age);

		Chiese lisi = new Chiese("112", "李四", "中国", 1223);
		System.out.println(lisi.id + "." + lisi.name + "." + lisi.guoji + "." + lisi.age);
	}

}
