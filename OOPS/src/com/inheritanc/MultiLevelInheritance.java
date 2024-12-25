package com.inheritanc;

class Animal {
	void eat() {
		System.out.println("Eating...");
	           
	    }
		
	}

class Dog1 extends Animal  {
	void bark() {
		System.out.println("Barking...");
	}
}

class Puppy extends Dog1 {
	void weep() {
		System.out.println("weepinggg.....");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Puppy pup = new Puppy();
		pup.eat();
		pup.bark();
		pup.weep();
	}
}
