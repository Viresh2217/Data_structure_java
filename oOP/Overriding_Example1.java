package oOP;

class FatherBussiness{
	void makePayment(String mode,int amount)
	{
		if((mode=="cash") || (mode=="cheque"))
		{
			System.out.println(String.format("The %d amount is paying through %s In father Bussiness", amount,mode));
		}
		else
			System.out.println("Invalid mode of amount");
		
	}
	
}
class SonBussiness extends FatherBussiness
{
	void makePayment(String mode,int amount)
	{
	if((mode=="cash") || (mode=="card"))
	{
		System.out.println(String.format("The %d amount is paying through %s In son bussiness", amount,mode));
	}
	else
		System.out.println("Invalid mode of amount");
	}	
	
	
	
}
public class Overriding_Example1 {

	public static void main(String[] args) {
		
		FatherBussiness customer= new FatherBussiness();
		customer.makePayment("cash",30000);
		customer=new SonBussiness();
		customer.makePayment("card",45000);

	}

}
