package CollectionFramework;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Vector;



class MyComparator1 implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		return +1;
		
	}
	
}

public class V_Tree_Sorting_DecendingOrder {
	
	public static void main(String[] args) {
		
		TreeSet T= new TreeSet(new MyComparator1());
		T.add(15);
		T.add(15);
		
		
		
		
		System.out.println(T);
		
		
		for(int i=0;i<10;i++)
		{
			T.add(i+1);
			
		}
		T.add(12);
		
		System.out.println(T);
	
		
		
		

	}

}
