package Map_Framework;

import java.util.*;
import java.util.Iterator;
import java.util.Map.Entry;



/* Map
 * both Key and values are object,Duplicate Key not allowed but value are allowed.each key-value pair is called entry
 * inside map there is interface Entry it has three method getKey,getValue,setvalue.
 * heterogenious data are allowed both key and value will be heterogenious.
 * Insertion Order is not preserved and it is based on hash code of the keys.
 * null Insertion is allowed for Key (Only Once) and allowed for Values (Any Number of
     Times)
 * initial capacity 16 and default fill ratio is 0.75,
 * 
 */



public class HashMap_Example_1 {

	public static void main(String[] args) {
	
		HashMap M=new HashMap<>();
		M.put(1,"Name1");    // it take duplicate key but print only once.
		M.put(2,"abc");
		M.put(1,"Name1");
		M.put(3,23);        //duplicate value but unique Key.
		M.put(8, 23);
		M.put(4,56);
		M.put("ha", "karan");
		
		Set S=M.keySet();
		System.out.println(S);
		
		Collection C=M.values();
		System.out.println(C);
		
		Set V=M.entrySet();
		System.out.println(V);
		try {
		Iterator E=V.iterator();
				while(E.hasNext()) {
					Map.Entry b1=(Map.Entry)E.next();
					System.out.println(b1.getKey()+"  "+b1.getValue());
				}
		}catch(NullPointerException N) {
			N.getMessage();
			System.out.println("Null pointer occure");
		}
		
	}
}
	

	
	


