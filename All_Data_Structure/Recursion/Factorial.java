package Recursion;

import java.util.*;

//5*4*3*2*1=120

public class Factorial {
public static long Factorial(long a) {
	if(a>0)
		return (a*Factorial(a-1));
	else 
		return 1;
		
	
}

	public static void main(String[] args) {
 
         Scanner Sc=new Scanner(System.in);
         System.out.println("Enter a Number:");
         long Fac=Sc.nextInt();
          System.out.println(Factorial(Fac));

	}

}
