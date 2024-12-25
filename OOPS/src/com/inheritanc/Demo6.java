package com.inheritanc;

class Motor{
	
	void Start() {
		
		System.out.println("Vehicle is starting!");
	}
}

class Bike extends Motor {
	
	void drive() {
		
		System.out.println("Bike is being ridden");
	}
}

public class Demo6 {

	public static void main(String[] args) {
		
		Bike car = new Bike();
		
		car.Start();
		car.drive();
	}
}
