package polymorphism;

// Method Overloading: Create a MathOperations class with overloaded methods for 
// multiplication with:
                   //Two integers.
                  //Three doubles.
                 //One integer and one double.

class MathOperation {
	
	int multiply(int a, int b) {
		
		return a * b;
	}
	
	double multiply (double a, double b, double c) {
		
		return a * b * c;
	}
	
	double multiply (int a, double b) {
		
		return a * b;
	}
}
public class Demo3 {

	
	public static void main(String[] args) {
		
		MathOperation mathop = new MathOperation();
		
		int result1 = mathop.multiply(32, 2);
		System.out.println("Multiplication of two integers (32 * 2) is "+result1);
		
		double result2 = mathop.multiply(15, 2, 24);
		System.out.println("multiplication of three doubles (15 * 2 * 24) is "+result2);
		
		double result3 = mathop.multiply(15, 3.5);
		System.out.println("Multiplication of one integer and one double is "+ result3);
		
			
	}
}
