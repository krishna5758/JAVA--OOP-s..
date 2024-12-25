package OverRidding;
// Q> Write a program to show method overriding in Java.


class Animal {
	
	void Sounds() {
		
		System.out.println("the animal makes Sound");
	}
}

class Dog extends Animal {
	
	@Override
	void Sounds() {
		
		System.out.println("the dog barks");
	}
}



public class Demo1 {

	public static void main(String[] args) {
		
		Animal anml = new Animal();
		Animal lilly = new Dog();
		
		anml.Sounds();
		lilly.Sounds();
	}
}
