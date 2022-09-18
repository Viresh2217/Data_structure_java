package Inner_Classes;

public class Outer_Class {
	int a;
	String name;
	
	
	class Inner_Class{
		
		public void Box() {
			System.out.println("Inner Class Method");
		}
		
		
		
		
	}
	public void Method() {
		Inner_Class I=new Inner_Class();
		I.Box();
		
	}
	

	public static void main(String[] args) {

        System.out.println("Outer Class Main Function");
        Outer_Class O=new Outer_Class();
        
       O.Method();

}

}
