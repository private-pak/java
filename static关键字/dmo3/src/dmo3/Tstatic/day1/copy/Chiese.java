package dmo3.Tstatic.day1.copy;

public class Chiese {
	String id;
	String name;
	static String guoji = "中国";
	/*
	 * 什么时候成员变量声明为实例变量
	 * 		- 所有对象都有这个属性，但是这个值会随着对象的变化而变化【不同对象的这个属性具体的值不同】
	 * 什么时候成员变量声明为静态变量
	 * 		- 所以对象都有这个属性，并且所以对象的这个属性的值是一样的，建议定义为静态变量，节省内存开销
	 * 
	 * 关于java中的static关键字
	 * 		1  static 翻译为静态的
	 * 		2  static修饰的方法是静态方法
	 * 		3  static修饰的变量是静态
	 * 		4  所有static修饰的元素都采用 类名. 的方式
	 */
	int age;

	public Chiese() {

	}// 无参构造方法

	public Chiese(String id, String name,  int age) {

		this.id = id;
		this.name = name;
		
		this.age = age;
	}// 有参构造方法

}
