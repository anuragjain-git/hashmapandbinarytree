package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();		
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(20);
		set.add(15);
		System.out.println("Size : "+set.size());
		System.out.println(set);
		set.remove(1);
		System.out.println(set);
		if(set.contains(2)) {
			System.out.println("contains 2");
		}
		else {
			System.out.println("Does n ot contains 2");
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
