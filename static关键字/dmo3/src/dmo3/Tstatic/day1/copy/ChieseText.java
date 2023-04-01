package dmo3.Tstatic.day1.copy;

public class ChieseText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chiese zhangsan = new Chiese("12", "张三", 123);
		System.out.println(zhangsan.id + "." + zhangsan.name + "." + Chiese.guoji + "." + zhangsan.age);

		Chiese lisi = new Chiese("112", "李四", 1223);
		System.out.println(lisi.id + "." + lisi.name + "." + Chiese.guoji + "." + lisi.age);

		System.out.println(Chiese.guoji);
		// 所以静态的数据都可以采用 类名.
		// 也可以采用引用.
		// 但推荐采用 类名. 的方式
	}

}
