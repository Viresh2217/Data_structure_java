package practies;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class BOX {

	
		
			public static void main(String[] args) {	
				try {
					Scanner sc = new Scanner(System.in); 
					System.out.print("Num1	:	");
					int num1 = sc.nextInt();
					System.out.print("Num2	:	");
					int num2 = sc.nextInt();
					if( num2 == 0 ) 
						throw new ArithmeticException("Divide by zero exception");
					int result = num1 / num2;
					System.out.println("Result	:	"+result);
				}catch( Exception e) {
					System.out.println("nkjs");
				}
			}
		}
      


