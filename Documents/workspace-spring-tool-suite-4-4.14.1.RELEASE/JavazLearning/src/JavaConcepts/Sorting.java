package JavaConcepts;

import java.util.*;

public class Sorting{
	public static void main(String[] args) {
	Map<String,String> map = new HashMap<String,String>();
	map.put("Jaggu", "Ongole");
	map.put("Auro", "Tenali");
	map.put("Charan", "Rajole");
	//using treemap
	Map<String,String> treeMap = new TreeMap<String,String>(map);
	for(Map.Entry<String, String> m : treeMap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	}
}
