package CollectionFramework;
import practies.MyConsole;

import java.util.ArrayList;
import java.util.Iterator;



class Bank{
	int id;
	String name;
	double balance;
	
	 Bank(int i,String na,double t) {
		id=i;
		name=na;
		balance=t;
	}
	
}



public class Iterator_Use {

	public static void main(String[] args) {
		ArrayList<Bank> li= new ArrayList<Bank>();		
		
		li.add(new Bank(120,"Viresh",7423.8f));
		li.add(new Bank(121,"saresh",39423.8f));
		li.add(new Bank(122,"paresh",343.8f));
		li.add(new Bank(123,"naresh",423.8f));
		
		
		
		 Iterator<Bank> itr=li.iterator();

	        while(itr.hasNext())
	        {
	        	Bank bo=itr.next();
	            System.out.println(bo.id);
	            System.out.println(bo.balance);
	            System.out.println(bo.name);
	            
	        }
		
		
		
		
		
		
		
	}
}
