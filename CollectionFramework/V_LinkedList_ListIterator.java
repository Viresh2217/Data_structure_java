package CollectionFramework;

import java.util.*;

public class V_LinkedList_ListIterator {

	public static void main(String[] args) {
		
		LinkedList L=new LinkedList<>();
		
		
		L.add("Viresh");
		L.add("Rahul");
		L.add("Kadar");
		L.add("Rinku");
		L.add("ben");
		L.add("Viresh");
		System.out.println(L);
ListIterator LI= L.listIterator();

while(LI.hasNext())
{
	String O=(String)LI.next();
	if(O.equals("Kadar"))
		LI.remove();
	if(O.equals("Rinku"))
		LI.add("Rahul");
	
	
}
System.out.println(L);	

	}

}
