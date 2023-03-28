package text01;

/*
 * java语言当中方法调用的时候涉及到参数传递的 问题： 参数传递实际上传递的是变量中保存的具体值
 * 				- int i = 100；
 * 				add(i);等同于 add(100);
 */
public class Text01 {

	public static void main(String[] args) {
		int i = 100;
		int o = 200;
//		Text01 t1 =new Text01();
		add(i);
		System.out.println("add---->" + i);// 101

		abb(o);
		System.out.println("abb---->" + o);// 199

	}

	public static void add(int i) {
		i++;
		System.out.println("add---->" + i);// 100
	}

	public static void abb(int o) {
		o--;
		System.out.println("abb---->" + o);// 200
	}

}
