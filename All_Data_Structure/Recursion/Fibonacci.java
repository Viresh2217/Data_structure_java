package Recursion;

//0 1 1 2 3 5 

public class Fibonacci {

	 static int Fib(int a) {


		    if(a<=1)
			return a;

			return(Fib(a-1)+Fib(a-2));
	
	}
	
	public static void main(String[] args) {
		
		int a=Myconsole.getNumber("Enter a number");
		System.out.println("Fibonnacci Series is \n");
		for(int i=0;i<=a;i++)
		System.out.print(Fib(i)+" ");

	}

}
