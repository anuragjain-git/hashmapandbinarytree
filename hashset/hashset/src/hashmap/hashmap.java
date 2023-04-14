package hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(19, "A");
		map.put(15, "B");
		map.put(16, "D");
		map.put(17, "E");
		map.put(14, "F");
		map.put(17, "C");
		
		System.out.println(map);
		map.put(90, "Z");
		System.out.println(map);
		System.out.println(map.containsKey(2));
		System.out.println(map.get(90));
		System.out.println(map.get(100));
		
		Iterator <Integer> it = map.keySet().iterator();
		System.out.println("Using Iterator");
		while(it.hasNext())  
		{  
			int key = it.next();  
			System.out.println("Roll no.: "+key+", name: "+map.get(key));  
		} 
		System.out.println("Using Map.Entry");
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println("Roll no.: "+e.getKey()+", name: "+e.getValue());
		}
		//to get only key
		Set<Integer>keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+map.get(key     ));
		}
	}

}
