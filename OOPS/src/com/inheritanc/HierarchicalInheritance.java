package com.inheritanc;

class Animal1{
	void see() {
		System.out.println("watchinggg....");
	}
}

class Dog2 extends Animal1{
	void Bark() {
		System.out.println("Barkinggg....");
	}
}

class Cat extends Animal1 {
	void Meow() {
		System.out.println("meowwww....");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.see();
		cat.Meow();
		
	}
}
