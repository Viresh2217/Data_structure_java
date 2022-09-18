package Recursion;
/*
 * According to youclid theorem 
 * GCD(105,91)
 * GCD(105%91,91)...(14,91)
 * GCD(14,91%14).....(14,7)
 * GCD(14%7,7).......(0,7)....Now answer is 7
 * 
 */



public class GCD {

	static int GCDNumber(int a,int b) {
		if(a==b)            //if(7,7)...ans is 7
			return(a);
		if(a==0 )
			return b;
		if(b==0)
			return a;
		if(a%b==0)          //(14%7==0).if b is small than a then ans is small no ie 7
			return b;
		if(b%a==0)          //(14%7==0)..if a is small than b ans is a
			return a;
		if(a>b)
			return(GCDNumber(a%b,b));
		else
			return(GCDNumber(a, b%a));
		
	}
	
	
	public static void main(String[] args) {
     
		int a=Myconsole.getNumber("Enter a number :");
		int b=Myconsole.getNumber("Enter a number :");
		
		int c=GCDNumber(a,b);
		System.out.println("Greatest Commone Divisior is:"+c);
		
  

	}

}
