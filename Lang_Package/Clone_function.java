package Lang_Package;





public class Clone_function implements Cloneable  {
	String nameString;
	private int roll;
	
	public Clone_function() {}
	public Clone_function(String nameString, int roll) {
		
		this.nameString = nameString;
		this.roll = roll;
	}
	public void Display() {
		System.out.println("Name : " +nameString+" \t RollNO : "+roll);
		
	}
	
	public static void main(String[] args)throws CloneNotSupportedException {
		
		Clone_function V=new Clone_function("Viresh",124);
		Clone_function B=(Clone_function)V.clone();
		B.Display();
		

	}

}
