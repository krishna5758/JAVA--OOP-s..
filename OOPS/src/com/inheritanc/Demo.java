package com.inheritanc;


class ParentClass{
	void display() {
		System.out.println("this is a parent class");
	}
}


class ChildClass extends ParentClass{
	void show() {
		System.out.println("this is a child class");
	}
}

// it is a one way method means only child class can inherit properties from
// parent class so we just have to create the object of child class in main method

public class Demo {

	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		cc.display();
		System.out.println();
		
		cc.show();
	}
}
