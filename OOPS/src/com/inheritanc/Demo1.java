package com.inheritanc;

class Vehicle{
	                                  // 2 imp methods
	String carname;                  // void display & void show
	String brand;
	double price;
	double mileage;
	
	void display() {
		System.out.println("Car Name : " +carname);
		System.out.println("Car brand : " +brand);
		System.out.println("Car price : " +price);
		System.out.println("Car mileage : " +mileage);
	}
}

 class Car extends Vehicle{
	 boolean sunroof;
	 String color;
	 
	 void show() {
		 System.out.println("sunroof availabel : " +sunroof);
		 System.out.println("color of car : "+color );
	 }
	 
	 
 }
public class Demo1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.brand = "Mahindra";
		car.carname = "Scorpio N";
		car.mileage = 17;
		car.price = 2500000;
		car.sunroof = true;
		car.color = "black";
		car.display();
		//System.out.println(car.sunroof);
		//System.out.println(car.color);
		car.show();
		
	}
}
