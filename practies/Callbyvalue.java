package practies;



class Customer{
	
	int custid;
	String cstName;
	
	public Customer()
	{
		
	}
	
	public Customer(int k,String name)
	{
		custid=k;
		cstName=name;
		
	}
	
}

public class Callbyvalue
{
	static void callvalue(int somedata)
	{
		System.out.println("The value passed to To the function "+somedata);
		somedata+=45;
		System.out.println("The value modified in the function "+somedata);
	}
	
	static void passReferenceObject(Customer cst) {
		cst.cstName = "Changed Name";
	}


	public static void main(String...args)
	{
		int somedata=23;
		callvalue(somedata);
System.out.println("After coming back from the function: " + somedata);
		
		System.out.println("///////////////////////////////////////////////////////");
		
		Customer cst=new Customer(123,"viresh");
		passReferenceObject(cst);
		System.out.println("The customer name after the function call: " + cst.cstName);
		
		
	}
	
}