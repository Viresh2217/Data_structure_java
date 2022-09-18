package MINI_PROJECT;

public class Sinnger {
	
	private String name;
	private String gender;
	private int age;
	private String Email_Id;
	private String contact;
	private double rating;
	
	
	public Sinnger() {}	     // Default Constructor
	
	public Sinnger(String name,String gender,int age,String Email_Id,String contact,double rating)  // paramerized constructure
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.Email_Id=Email_Id;
		this.contact=contact;
		this.rating=rating;
	}
	
	
	public String getName() {return this.name;}
	public String getGender() {return this.gender;}
	public int getAge() {return this.age;}
	public String getEmail_Id() {return this.Email_Id;}
	public String getContact() {return this.contact;}
	public double getRating() {return this.rating;}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setEmail_Id(String Email_Id) {
		this.Email_Id=Email_Id;
	}
	
	public void setContact(String contact) {	
		this.contact=contact;
	}
	
	
	
	
	public String toString() {
		return "Singer [Name= " +name+" Gender= "+gender+" Age= "+age+" Email_ID= "+Email_Id+" Contact= "+contact+" Rating= "+rating+" ]";
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
