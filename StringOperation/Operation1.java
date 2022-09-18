package StringOperation;

public class Operation1 {

	public static void main(String[] args) {
		String s1=new String("Viresh");
		
		String s2=new String("Viresh");
		
		if(s1==s2)
			System.out.println("true");
		else {                                  //false
			System.out.println("false");
			System.out.println(s1.equals(s2));
			
			Integer i1=new Integer(237);
			System.out.println(i1.byteValue());
			
		}
		
		String s5="Viresh";
		String s6="Viresh";
		if(s5==s6)
			System.out.println("true");
     		else {                             //true
			System.out.println("false");
		}
		
		System.out.println(s5.equals(s6));
		
		System.out.println(s1);
		
		
		StringBuffer SB=new StringBuffer("Rohit");
		SB.reverse();
		SB.append("Sharma");
		System.out.println(SB);
		System.out.println(SB.capacity());
		

	}

}
