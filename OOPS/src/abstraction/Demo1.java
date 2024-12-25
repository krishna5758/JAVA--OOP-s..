package abstraction;

// Q>  Write a program to demonstrate abstraction in Java.

abstract class Shape {
	
	abstract void drew();
		
}

class Circle extends Shape {
	@Override
	void drew() {
		System.out.println("drawing the ciecle");
	}
}

class Rectangle extends Shape {
	@Override
	void drew() {
		System.out.println("drawing the rectangle");
	}
}


public class Demo1 {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		
		circle.drew();
		rectangle.drew();
	}
}
