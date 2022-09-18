package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;


 class Employee{
	
	String name;
	int age;
	String desig;
	double balance;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setDesig(String desig)
	{
		this.desig=desig;
	}
	
	public String getName()
	{ return(this.name);}
	
	public int getAge()
	{ return(this.age);}
	
	public String getDesig()
	{ return(this.desig);}
	
	public Employee(String o_name,int o_age,String o_desig)
	{
		
		setAge(o_age);
		setDesig(o_desig);
		setName(o_name);
	}
	
	public Employee() {}

	
}

class officer extends Employee{
	
	//String desc 
		public officer(String o_name,int o_age,String o_desig)
		{
			 super(o_name,o_age,o_desig);
		}
		
	
}
 class Manager extends Employee{
	
		public Manager(String M_name,int M_age,String M_desig)
		{
			Employee E=new Employee();
			E.setAge(M_age);
			E.setDesig(M_desig);
			E.setName(M_name);
		}
		
	
}
 class Clerk extends Employee{
	
	 public Clerk(String C_name,int C_age,String C_desig)
		{
		 super(C_name,C_age,C_desig);
		 
		 /*
			Employee E=new Employee();
			E.setAge(C_age);
			E.setDesig(C_desig);
			E.setName(C_name);
			*/
		}
		
	 
	
}

public class Exam {

	public static void main(String[] args) {
         ArrayList<Employee> A= new ArrayList<Employee>();
		
		
		
		A.add(new Clerk("Rahul",34,"Officer"));
		A.add(new officer("Shubham",24,"Manger"));
		A.add(new Employee("Karan",25,"Clerk"));
	
		
		
		
		 Iterator<Employee> itr= A.iterator();

	        while(itr.hasNext())
	        {
	        	Employee bo=itr.next();
	            System.out.println(bo.getAge());
	            System.out.println(bo.getDesig());
	            System.out.println(bo.getName());
	            
	        }
		
}
}