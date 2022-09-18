package oOP;
class Demo1{
	private int a;
	private String name;
	static String name1;
	
	
	{
		this.a=1;
		this.name="carry";
		
		
	}
	static {//we can not write this and super keyword here 
		name1="Viresh";
		
	}
	public void getDetails(){
		System.out.println("a= "+a+" name: "+name+"Static Name :"+name1);
	}
	
	
}






public class Initalizer_and_Static_Initalizerblock {

	public static void main(String[] args) {
		Demo1 D=new Demo1();
		D.getDetails();

	}

}
