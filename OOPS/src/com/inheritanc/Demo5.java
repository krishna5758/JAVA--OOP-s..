package com.inheritanc;


class Employee{
	float salary = 40000; 
}


class Programmer extends Employee{
	float bonus = 50000;
}




public class Demo5 {

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		System.out.println("Salary of Programmer is : "+p.salary);
		System.out.println("bonus of programmer is :  "+p.bonus);
			
	}
}
