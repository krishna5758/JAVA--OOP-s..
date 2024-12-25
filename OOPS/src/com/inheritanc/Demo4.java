package com.inheritanc;

class Vehicle1{
	
	String name;
	String brand;
	double price;
	
	void display() {
		System.out.println(" car name :" +name);
		System.out.println("car brand :" +brand);
		System.out.println(" car price :"+price);
	}
}

class Car1  extends Vehicle1{
	
     
	boolean sunroof;
	String color;
		
	void show() {
		System.out.println("sunroof availabel :"+sunroof);
		System.out.println("car color :"+color);
				
	}
}



public class Demo4 {

	public static void main(String[] args) {
		
		Car1 car = new Car1();
		
		car.name = "Scorpio";
		car.brand = "mahindra";
		car.price = 3000000;
		car.color = "black";
		car.sunroof = true;
		
		
		car.display();
		car.show();
				}
}
