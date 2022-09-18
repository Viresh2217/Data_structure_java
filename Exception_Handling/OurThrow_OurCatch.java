package Exception_Handling;
/*Folowing are Unchecked Exception   
 * ArrayIndexOutOfBoundsException:
 * NullPointerException:
 * StackOverFlowError:
 * NoClassDefFoundError:
 * ClassCastException:
 * ExceptionInInitializerError:
 * IllegalArgumentException: 
 * NumberFormatException:
 * IllegalStateException:
 */
public class OurThrow_OurCatch {

public static void main(String...args) {
	int balance=500;
	int withdraw=600;    //change value
	
	
	try {
		System.out.println("Entered in try Block");
		if(balance<withdraw) {
			throw new ArithmeticException("Insufficient Balance");
			}
			else {
				balance=balance-withdraw;
			}
			
			System.out.println("Transcation Sucesfully......");
	}catch(ArithmeticException A) {
		A.printStackTrace();
		
	}
	finally {
		System.out.println("Entered in finally......");
		
	}
	
}
}
