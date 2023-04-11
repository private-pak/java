package com.bilbil.xuexi;

public class FinalText {
	public static void main(String[] args) {
		Person p1 = new Person(111);
		System.out.println(p1.age);
		
		final Person  p2 = new Person(30);
		//p2 = new Person(22);
		p2.age = 40;
	System.out.println(p2.age);
		
//	final Person  p3 = new  Person();
//	p3 =  new Person();
//	System.out.println(p3);

	}

}

class Person {
	int age;

	public Person() {

	}

	public Person(int age) {
		this.age = age;
	}
}