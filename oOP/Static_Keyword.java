package oOP;

class Student1{
	private int rollno;
	private String name;
	private static String Schoolname="Shri Shiddhwar Vidhyla Majalgaon";
	
	public  void SetDetails() {
		
		this.name=Myconsole.getString("Enter Your name");
		this.rollno=Myconsole.getNumber("Enter Your Roll Number");

	}
	public void getDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll NO: "+this.rollno);
		System.out.println("School name: "+Schoolname);
	}
	
	
	
	
}



public class Static_Keyword {

	public static void main(String[] args) {
		Student1 S=new Student1();
		S.SetDetails();
		S.getDetails();
		

	}

}
