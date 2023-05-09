package com.javase.xx.HashMap;

import java.util.Objects;

public class Student {

//	public static void main(String[] args) {
//		
//
//	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
		
	//equals
/*	public boolean equals(Object obj) {
		if(obj ==  null || !(obj instanceof Student)) return false;
		if(obj == this)return true;
		Student s = (Student)obj;
		if(this.name.endsWith(s.name)) return true;
		return false;
	}
		*/
	
	
	//705
	
	
}
