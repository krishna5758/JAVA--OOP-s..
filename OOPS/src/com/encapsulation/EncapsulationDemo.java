package com.encapsulation;



 class Human{
	 
	private int age = 26;
	 private String name = "Krishna";
	 
	 public int getAge()
	 {
		 return age;
	 }
	 
	 public void setAge(int a)
	 {
		 age = a;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public void setName(String n)
	 {
		 name = n;
	 }
 }


public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Human obj = new Human();
		//System.out.println(obj.age);
		//System.out.println(obj.name);
		//System.out.println(obj.getAge());
		//System.out.println(obj.getName());
		obj.setAge(55);
		obj.setName("nandkumar");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
	}
}
