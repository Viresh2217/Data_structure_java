package oOP;

class Person{
	String name;
	 int Empid;
	
public  Person(int Empid,String name){
		this.Empid=Empid;
		this.name=name;
	}

	
}
	
class Employ extends Person{
	private double Salary;
	
public 	Employ(int Empid,String name,double Salary) {
	
	super(Empid,name);
	this.Salary=Salary;
}
public void getDetails() 
{System.out.println(super.Empid+" "+super.name+" "+this.Salary);} 
	
	
	
}

public class Super_Keyword {

	public static void main(String[] args) {
		Employ E=new Employ(123,"Gaurav",30000);
		E.getDetails();

	}

}
