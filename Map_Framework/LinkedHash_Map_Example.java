package Map_Framework;


import java.util.*;



/*inseration order is preserved.
 * Duplicates not allowed.
 * 
 * 
 */


public class LinkedHash_Map_Example {

	public static void main(String[] args) {
		
		LinkedHashMap m=new LinkedHashMap<>();
		m.put(12, "b");
		m.put(34, "k");
		m.put(67, 89);
		m.put("ff", "BB");
		m.put("laja","vadapav");
		
		System.out.println(m);
		Set N = m.entrySet();
	       Iterator I=N.iterator();
	       while (I.hasNext()) {
			Map.Entry  B=(Map.Entry)I.next();
			System.out.println(B);
			
		}
		
		
		

	}

}
