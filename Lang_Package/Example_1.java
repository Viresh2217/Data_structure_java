package Lang_Package;

/*
 * In String class, StringBuffer, StringBuilder, wrapper classes and in all collection
classes toString() method is overridden for meaningful string representation.
Hence in our classes also highly recommended to override toString() method.
 */
class Test{
	String name="Viresh";
	
	
	
	public String toString() {
		return (this.name);
		
	}
}


public class Example_1 {

	public static void main(String[] args) {
	
		Integer I=new Integer(12); 
		String g=new String("New Value");
		Test T=new Test();
		System.out.println(I);
		System.out.println(g);// g.toString()
		System.out.println(T);  //T.toString() is calling here internally
		

	}

}
