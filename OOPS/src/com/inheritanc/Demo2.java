package com.inheritanc;



class Attributes{
	
	String bark;
	String eat;
	String play;
	
	void display() {
		System.out.println("Lilly barks loudly  " +bark);
		System.out.println("Lilly eats pedigree  "+eat);
		System.out.println("Lilly plays with baba  "+play);
	}
}

class Dog extends Attributes{
	
}



public class Demo2 {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
	     
		dog.bark = "";
		dog.eat = "";
		dog.play = "";
		
		dog.display();
	
	}
}
