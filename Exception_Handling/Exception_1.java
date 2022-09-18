package Exception_Handling;

class Trial{
	public void fun() {
		try {
			System.out.println("Entered in Trial block");
			String S=null;
			
			System.out.println(S.charAt(0));
			//System.exit(0);
		  	                             //after useing return  keyword here finally block is Executing finally block dominates return statement. 
			return ; 
		}catch(NullPointerException N) {
			N.printStackTrace();            //it is default method of throwable class 
			
		}
		finally {
			System.out.println("Finally is Executing............");
		}
		
	}
	/*There is only one situation where the finally block won't be executed is whenever we are
	using System.exit(0) method.
	When ever we are using System.exit(0) then JVM itself will be shutdown , in this case
	finally block won't be executed.
	*/
	
}

public class Exception_1 {

	public static void main(String[] args) {
	
        Trial T=new Trial();
        T.fun();
	}

}
