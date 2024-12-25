package com.encapsulation;


class MyDemo{
	
	private String accountnumber;
	private double initialbalance;
	
	
	public MyDemo(String accountnumber, double initialbalance) {
		
		this.accountnumber = accountnumber;
		this.initialbalance = initialbalance;
		
	}
	
	public String getaccountnumber() 
	{
		return accountnumber;
	}
	
	public double getinitialbalance()
	{
		return initialbalance;
	}
	
	
	
	public void  deposit(double amount)
	{
		if(amount > 0) {
			initialbalance += amount;
		}
	}
}





public class EbcapsulationDemo5 {

	public static void main(String[] args) {
		
		MyDemo obj = new MyDemo("761450401649", 45000);
		
		System.out.println("Account Number :"+obj.getaccountnumber());
		System.out.println("Balance :"+obj.getinitialbalance());
		
		obj.deposit(45000);
		System.out.println("New Balance :"+obj.getinitialbalance());
	}
}
