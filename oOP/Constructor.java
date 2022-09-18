package oOP;


class Student {
	
	private int Rollno;
	private String name;
	
	public Student(int Rollno){
		this.Rollno=Rollno;
		
	}
	public Student(String name) {
	this.name=name;
	}
	
	public Student(int Rollno,String name){
		
		this.Rollno=Rollno;
		this.name=name;
	}
	void Display(){
		
		System.err.println("Name :"+this.name+"\n"+"Roll NUmber: "+this.Rollno+"\n");
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		Student S=new Student(145,"Viresh Gavarkar");
		Student S1=new Student(789);
		Student S2=new Student("Rahul Saksena");
		S.Display();
		S1.Display();
		S2.Display();
	

	}

}
