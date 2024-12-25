package polymorphism;


 class Animal{
	 
	 public void animalSound() {
		 
		 System.out.println("Animal makes loud sound");
	 }
 }
 
  class Pig extends Animal{
	  
	  public void animalSound() {
		  
		  System.out.println("The Pig Says : weee Weee");
	  }
  }

  class Dog extends Animal{
	  
	  public void animalSound() {
		  
		  System.out.println("The Dog Says : Bhuuu Bhuu");
	  }
  }



public class Demo1 {

	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Pig myPig = new Pig();
		Dog myDog = new Dog();
		
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		
		}
}
