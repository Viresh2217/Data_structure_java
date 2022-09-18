package Exception_Handling;
/*In our program if there is any chance of raising checked exception then compulsory we 
should handle either by try catch or by throws keyword otherwise the code won't
compile.

Following are checked exception 
1_IOException
2_inturpetioException
3_filenotfoundException
4_EOFException
5_SQLException
6_ServeltException                          
        */


/*unchecked exception there is no use."throws" keyword required only to convince complier. Usage of throws keyword
doesn't prevent abnormal termination of the program.
Hence recommended to use try-catch over throws keyword*/
public class Using_Throws_Keyword {

	public static void main(String[] args)throws ArithmeticException { 

		   System.out.println("Entered in manin");
           System.out.println(10/0);
	       System.out.println("hello");
	       
	       
		}
	}


