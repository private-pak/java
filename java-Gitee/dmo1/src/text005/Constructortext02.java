package text005;
/*
 * 构造方法的作用：
 * 		1-创建对象 
 * 		2-创建对象的同时，初始化实例变量的内存空间
 */

public class Constructortext02 {

	public static void main(String[] args) {
		// 创建对象
		// 查看访问是那个属性 按着 ctrl鼠标移动到查看元素 出现下划线
		// 在 一个类元素过多，想快速查看 所以 ctrl + o
		Account act1 = new Account();

		System.out.println("账户" + act1.getActno());
		System.out.println("余额" + act1.getBalance());

		Account act2 = new Account("1101", 111);

		System.out.println("账户  " + act2.getActno());
		System.out.println("余额  " + act2.getBalance());

	}

}
