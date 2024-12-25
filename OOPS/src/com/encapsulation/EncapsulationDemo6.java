package com.encapsulation;


class Student {
	private String name;
	private int age;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		if (age > 0) {
			this.age = age;
		}  else {
			System.out.println("enter valid age!");
		}
		
	}
	
}
public class EncapsulationDemo6 {

	public static void main(String[] args) {
		
		Student sd = new Student();
		sd.setAge(25);
		sd.setName("krishna");
		
		System.out.println("the student age is : "+sd.getAge() );
		System.out.println("the name of student is : "+sd.getName() );
	}
}
