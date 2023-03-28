package text01;

public class Text02 {

	public static void main(String[] args) {

		User u1 = new User(10);
		add(u1);
		System.out.println("main---" + u1.age);// 9
	}

	public static void add(User u1) {
		u1.age--;
		System.out.println("add---" + u1.age);// 9

	}

}

class User {
	// 实体变量
	int age;

	// 构造方法
	public User(int i) {
		age = i;
	}

}
//135
