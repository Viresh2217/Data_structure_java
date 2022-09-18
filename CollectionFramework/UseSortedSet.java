package CollectionFramework;
import java.util.*;
public class UseSortedSet {

	public static void main(String[] args) {
	
		NavigableSet obj=new TreeSet<>();
		obj.add(12);
		obj.add(19);
		
		obj.add(45);
		obj.add(25);

System.out.println(obj.ceiling(20));
System.out.println(obj.floor(13));
		System.out.println(obj);
		
		
		
		

	}

}
