package CollectionFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;



public class Use_HashSet_LinkedHashSet {

	public static void main(String[] args) {
		
		Set obj=new LinkedHashSet();
		obj.add("Viresh");
		obj.add("Karan");
		obj.add("Viresh");
		obj.add(45);
		obj.add(23);
		System.out.println(obj);
		System.out.println(obj.contains("Karan"));
		System.out.println(obj.hashCode());
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println("``````````````````");
// we can not print HashSet and LinkedSet data through for loop                beacause in it there is no any get function.
		
		Iterator it= obj.iterator();
		while(it.hasNext())
		{
			Object ob =it.next();
			System.out.println(ob);
		}
		
		
		Set you=new HashSet<>();

		you.add(12);
		you.add(12);
		you.add(12);
		you.add("four");
		you.add("kaka");
		
		System.out.println(you);
		
		for(Object o:you) 
			System.out.println(o);
		
			System.out.println("222222222222222222222");
		Iterator ite= you.iterator();
			while(ite.hasNext())
			{
				Object obj1 =ite.next();
				System.out.println(obj1);
			}
			
			
			
			
			
		}
		
		

	}


