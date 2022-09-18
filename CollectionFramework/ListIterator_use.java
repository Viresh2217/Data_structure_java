package CollectionFramework;

import  practies.MyConsole;
import java.util.*;


class Student{
	 String  name;
	 int rollno;
	 int mark;
	 //Scanner scanner=new Scanner(System.in);
	public Student(String name,int rollno,int mark) {
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;	
	}
	public void getvalue()
	{
		
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.mark);
	}
	public Student(){
		this.name=MyConsole.getString("Enter your name");
		
		this.rollno=MyConsole.getNumber("Enter a rollno");
		
		this.mark=MyConsole.getNumber("Enter your mark");
		MyConsole.getCharter();
			
	}
	
	}
public class ListIterator_use {

	public static void main(String[] args) {
		
		LinkedList<Student> ho=new LinkedList<Student>();
		
		for(int i=0;i<3;i++)
		{
			ho.add(new Student());
			
		}
			//ho.add(new Student("Viresh", 45, 567));
			//ho.add(new Student("rohit", 32, 524));
			//ho.add(new Student("Saket", 78, 667));
			
			ListIterator<Student>it= ho.listIterator();
			while(it.hasNext()) {
				Student na= it.next();
				na.getvalue();
				System.out.println();
			}

	}

}
