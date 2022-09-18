package Inner_Classes;
////if you have to acces outer class instance variable using this keyword then you
//have to call outer class nam .this.variable
public class Accessing_Data {
	
	private int a;
	private int x=1000000;
	private String name="Viresh Gavarkar";
	static  int h=100;
	
	
	class Inner_Class{
	   private int x=1000;
		
		
		public void Method() {
			
			System.out.println(Accessing_Data.this.a); 
			System.out.println(h);
			System.out.println(name);
			
		}
		public void Method2() {
			
			int x=100;
			System.out.println(x);// Local Variable
			System.out.println(this.x);// instance variable
			System.out.println(Accessing_Data.this.x);// outer class instance variable
			
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		//new Accessing_Data().new Inner_Class().Method();
		new Accessing_Data().new Inner_Class().Method2();
		
	}

}
