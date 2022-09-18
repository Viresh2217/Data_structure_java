package Inner_Classes;

class A{
	
	class B{
		
		
		
		
		class C{
			
			
			public void Method() {
				System.out.println("Method of 'C' class");
				
				
			}
			
		}
		
		
	}
	
	
	
}


public class Example_2 {

	public static void main(String[] args) {
                A a=new A();
                A.B b=a.new B();
                A.B.C c=b. new C();
                c.Method();
   

	}

}
