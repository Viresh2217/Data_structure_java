package Exception_Handling;

import oOP.Myconsole;

public class DefaultThrow_OurCatch {

	public static void main(String[] args) {
		
		System.out.println("Sentence...1");
		System.out.println("Sentence ...2");
		int a=Myconsole.getNumber("Enter a Number");
		int b=Myconsole.getNumber("Enter a number");
		try {
			System.out.println("Inside Try Bolck");
			int c=a/b;
			System.out.println("Inside Try After Exception");
			String S=null;
			System.out.println(S.charAt(0));
			
			
		}catch(ArithmeticException E) {
			System.out.println(E.getMessage()); //Description.
			
		}catch(NullPointerException E)
		{
			System.out.println(E.toString()); //Name of the exception: description of exception
		}
		catch(Exception e) {
			e.printStackTrace();//print Name of the exception: description of exception
			
			
		}
		finally {
			System.out.println("Finally is Excecuting......");
		}
		
		System.out.println("Heloo Mona");
	}

/* if Exception occure but any catch is not match then System.out.println("Heloo Mona"); will not execute but finally block will execute
		*/
		
		

	

}
