

//Create a Java class Student that encapsulates the student's name and age. Provide 
//methods to set and get these values, ensuring that the age cannot be set to a
//negative number.


package com.encapsulation;


class Students{
	 
	private int  age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if (age >= 0) {
			this.age = age;
		}else {
			System.out.println("invalid age! age can not be negative");
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}


public class EncapsulationDemo2 {

	public static void main(String[] args) {
		
		Students obj = new Students();
		obj.setAge(23);
		obj.setName("krishna");
		
		obj.setAge(22);
		obj.setName("nikku");
		
		System.out.println(obj.getAge()+ " : "+ obj.getName());
		System.out.println(obj.getAge()+ " : "+ obj.getName());
	}
}
