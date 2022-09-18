package CollectionFramework;

import java.util.*;
import java.util.Iterator;

public class V_Stack_Iterator {

	public static void main(String[] args) {
		
		Stack S=new Stack<>();
		
		S.add(0,"Virtika");
		S.add(1,34);
		S.add(2,12);
		System.out.println(S);
		
		Iterator I = S.iterator();
		while(I.hasNext())
		{
			Object O=I.next();
			System.out.println(O);
		}
		
		

	}

}
