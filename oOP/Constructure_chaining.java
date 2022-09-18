package oOP;

class Demo{
	public Demo(){System.out.println("Base class default Constructure");
		
	}
    public Demo(String name){
		System.out.println("Base class Paramarized  Constructure");
	 }
	
	
}

class Temp extends Demo{
	
	public Temp() {
		
		System.out.println("Derived class default Constructure");
		
	}
	public Temp(String name){
		//super(name);
		
		System.out.println("Derived class Paramarized  Constructure");
		
	}
	
}
public class Constructure_chaining {

	public static void main(String[] args) {
	Temp T=new Temp();	
	

	}

}
