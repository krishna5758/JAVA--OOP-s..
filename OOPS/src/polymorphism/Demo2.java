package polymorphism;

// Dynamic Method Dispatch

class Shape {
	void Draw() {
		System.out.println("Drawing a Shape");
	}
}

class Rectangle extends Shape{
	
	@Override
	void Draw() {
		System.out.println("Drawing a Rectangle!");
	}
}

class Circle extends Shape {
	
	@Override
	void Draw() {
		System.out.println("Drawing a Circle!");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		Shape shape;
		
		shape = new Rectangle();
		shape.Draw();
		
		shape = new Circle();
		shape.Draw();
	}
}
