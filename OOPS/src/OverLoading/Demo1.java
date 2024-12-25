package OverLoading;

// Q> Write a program to show method overloading in Java.



class Calculator{
	
	// method with 2 int parameters.
	int add (int a, int b) {
		
		return a + b;
	}
	
	// method with 3 int parameters.
	
	int add (int a, int b, int c) {
		
		return a + b + c;
	}
	
	// method with 2 double parameter.
	
	double add (double a, double b) {
		
		return a + b;
	}
	
	
	
	
}


public class Demo1 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("the sum of 2 and 3 is : "+cal.add(2,3));
		System.out.println("the sum od 32, 32, and 55 is : "+cal.add(32, 32, 55));
		System.out.println("the sum of 54.34 and 75.23 is : "+cal.add(54.34, 75.23));
	}
	
}
