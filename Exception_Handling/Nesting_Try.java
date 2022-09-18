package Exception_Handling;

import oOP.Myconsole;

public class Nesting_Try {

	public static void main(String[] args) {
		
		try {
			int a=Myconsole.getNumber("Enter a number");
			int b=Myconsole.getNumber("Enter a number");
			System.out.println("Result :"+a/b);
			
			try {
				
				int[] arr=new int[5];
				
				int k=Myconsole.getNumber("Enter a index number");
				System.out.println(arr[k]);
				
			}
			catch(NullPointerException N) {
				System.out.println(N.toString());
			}finally{
				System.out.println("Inner Finally is Exceuting.......");
				
			}
		}catch(ArithmeticException A) {
			System.out.println(A.getMessage());
			
		}finally {
			System.out.println("Outer finally is Exceuting......");
		}


	}

}
