package Recursion;
import java.util.*;

// addition program

public class Sum {
 static public int Run(int a) {
	     if(a==0) {
	     	return 0;
	               }
	
	else {
		return a+Run(a-1);
	}
	
}
	public static void main(String[] args) {
		      Scanner Sc=new Scanner(System.in);
		      System.out.println("Enter a Number");
              int a=Sc.nextInt();
              System.out.println("Sum of "+a+" number is: "+Run(a));
        
	}

}
