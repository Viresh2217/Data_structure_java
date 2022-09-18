package Inner_Classes;

class Bomb{
	private int a=100;	
	static String S="Viresh Gavarkar";
	
	
	
	public  void Method() 
	{
		final int x=900+1;
	      class inner_class
	      {
	    	  public void Method_Inner()
	    	  {
	    		  
	    		  System.out.println(x);
	    		  System.out.println(S);
	    		  
	    		  System.out.println(a);
	    		  
	    	  }
	     }
	      inner_class I=new inner_class();
    	  I.Method_Inner();
   }
	
	
	
}



public class Example_4 {

	public static void main(String[] args) {
		
    new Bomb().Method();
	}

}
