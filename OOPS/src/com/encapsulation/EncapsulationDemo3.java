
//How would you implement a read-only property in a Java class using encapsulation?



package com.encapsulation;

class BankAccount{
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		if(amount > 0) {
			balance += amount;
		}
	}
	
}


public class EncapsulationDemo3 {

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount("761450401649", 35000);
		System.out.println("Account Number : "+ obj.getAccountNumber());
		System.out.println("Initial Balance : "+ obj.getBalance());
		
		obj.deposit(5000);
		System.out.println("New Balance : "+obj.getBalance());
	}
}
