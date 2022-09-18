package CollectionFramework;

import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		TreeSet to= new TreeSet<>();
		to.add(10);
		to.add(22);
		to.add(67);
		to.add(8);
		to.add(90);
		to.pollFirst();to.pollLast();
		System.out.println(to);
		System.out.println(to.higher(10));
		System.out.println(to.floor(66));

	}

}
