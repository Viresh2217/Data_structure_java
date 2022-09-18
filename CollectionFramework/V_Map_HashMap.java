package CollectionFramework;
import java.util.*; 
public class V_Map_HashMap {

	public static void main(String[] args) {
		HashMap HM=new HashMap();
		HM.put(12, 34);
		HM.put(null, "Viresh");
		HM.put(67,"we");
		HM.put("Nag", "Kaka");
		Set S=HM.keySet();
		Set s = HM.keySet();
		System.out.println(s);
		Collection c = HM.values();
		System.out.println(c);
		Set s1 = HM.entrySet();
		System.out.println(s1);
		
		
		
		
		
		System.out.println(HM);
		}
	
	

}
