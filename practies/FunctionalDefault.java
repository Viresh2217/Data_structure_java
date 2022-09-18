package practies;



interface party
{
	 void Dance();
}

interface bday 
{
	public void cake();
	public void people();
}

class xyzparty implements bday
{
	public void cake()
	{
		System.out.println("Mango cake");
	}
	
	public void people()
	{
		System.out.println("xyz friends");
	}
	public void Dance()
	{
		System.out.println("dance");
	}
	
}

public class FunctionalDefault {
	
	public static void main(String args[])
	{
		bday obj =new xyzparty();
		obj.cake();
		
		
	}
}	
