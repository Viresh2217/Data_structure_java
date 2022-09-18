package CollectionFramework;


import java.util.*;




public class Frames_ArrayList_LinkedList_Vector {

	public static void main(String[] args) {
		Stack mo= new Stack<>();
		
		mo.push(23);
		mo.push(56);
		mo.push(12);
		System.out.println(mo	);
		for(int i=0;i<mo.size();i++)
		{
			System.out.println(mo.get(i));
			
		}
		mo.pop();
		System.out.println("***************************************");
		for(int i=0;i<mo.size();i++)
		{
			System.out.println(mo.get(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		/*inkedList<String> t=new LinkedList<String>();
		
		t.add(null);
		t.add("Viresh");
		t.add("Viresh");
		t.add("Gavarkar");
		t.add("viresh");
		
		
		for( String e:t)
		{
			System.out.println(e);
		}
		
		
		/*List<Float> va=new ArrayList<Float>();
		va.add(2.3f);
		va.add(5.6f);
		va.add(2f);
		
		va.isEmpty();
		va.add(3, 8.9f);
		va.set(1, 6.7f);
		System.out.println(va.subList(1, 3)
		);
		va.get(2);
		
		for(int i=0;i<va.size();i++)
		{
			System.out.println(va.get(i));
		}
		*/
		
        
	}

}
