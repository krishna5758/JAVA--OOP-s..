package polymorphism;

/* Method Overriding: Implement a Bank class with a getInterestRate() method. Create 
 * subclasses SBI, HDFC, and ICICI that override this method with their respective 
 * interest rates.*/

class Bank {
	
	double getInterestRate() {
		
		return 0.0;  // Default Interest Rate
 	}
}

class SBI extends Bank {
	
	@Override
	double getInterestRate() {
		
		return 7.8; // SBI interest rate
	}
}

class HDFC extends Bank {
	
	@Override
	double getInterestRate() {
		
		return 8.9;
	}
}

class ICICI extends Bank {
	
	@Override
	double getInterestRate() {
		
		return 11.2;
	}
}



public class Demo4 {

	public static void main(String[] args) {
		
		Bank bank;
		
		bank = new SBI();
		System.out.println("Interest Rate of SBI is "+bank.getInterestRate()+ " per year");
		
		bank = new HDFC();
		System.out.println("Interesr rate if HDFC is "+bank.getInterestRate()+ " per year");
		
		bank = new ICICI();
		System.out.println("Interest rate id ICICI is "+bank.getInterestRate()+ " per year");
	}
}
