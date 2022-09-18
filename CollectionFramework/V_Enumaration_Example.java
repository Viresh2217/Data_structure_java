package CollectionFramework;
import java.util.*;


public class V_Enumaration_Example {

	public static void main(String[] args) {
		
		 Collection v =new Vector<>();
		
		for(int i=0;i<10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration E= ((Vector<Object>) v).elements();
		
		while(E.hasMoreElements())
		{
			Integer I=(Integer)E.nextElement();
			if(I%2==0)
			System.out.println(I);
			
		}
		System.out.println(v);
		
		
		

	}

}
