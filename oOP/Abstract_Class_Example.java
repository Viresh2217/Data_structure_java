package oOP;
abstract class Animal{
	
	abstract void animalSound();
	public void eat() {
		System.out.println("All Animala are Eating");}
		public void Sleep() {System.out.println("All Animal Sleep at 10am");
	
	}
		
	
}


class Dog extends Animal{
	void animalSound() {
		System.out.println("Dog is Barking");
		
		
	}
	
	
}
public class Abstract_Class_Example {

	public static void main(String[] args) {
	Dog D=new Dog();
	D.animalSound();
	D.eat();
	D.Sleep();
	}

}
