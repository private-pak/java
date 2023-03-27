package text005;

public class User {

	public User() {
		System.out.println("user的方法名");
	}

	// 有参数的构造方法
	public User(int i) {
		System.out.println("带有int");

	}
	public User(String name) {
		System.out.println("带有name");

	}
	public User(int i,String name) {
		System.out.println("带有int和name");

	}

}
