package JavaConcepts;
import java.util.*;
public class Iterations1 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(2615, "Jaggu");
		map.put(2635, "Auro");
		map.put(2606, "Charan");
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(key+" "+map.get(key));
		}
		for(int i : set) {
			System.out.println(i+map.get(i));
		}
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
