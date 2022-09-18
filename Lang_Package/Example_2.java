package Lang_Package;

/*
 * In String class , Wrapper classes and all collection classes .equals( ) method is
   overriden for content comparision
 */



class Box{
	String name;

      public Box(String name) {
    	  this.name=name;
    	  
      }
}

public class Example_2 {

	public static void main(String[] args) {

          Box B1 =new Box("Viresh");   //in custmize object 
          Box B2 =new Box("Viresh");
          /*
          String S1="liresh";
          String S3="Viresh";
          String SP =new String("Viresh");
          String S2=new String("Viresh");
          
          System.out.println(S1.equals(S2));
          System.out.println(B1.equals(B2));  //here it check reference
          System.out.println(S1.equals(SP));
		  System.out.println(SP.equals(S1));
		  System.out.println(S2==SP);
		  System.out.println(S1==S3);
		*/
          Integer I1=128;
          Integer I2=128;
          System.out.println(I1==I2);
		 /* Object r=12123;
		  Object b=12123;
				  System.out.println(r.equals(b));
		  
*/
	}

}
