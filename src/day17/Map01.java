package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1500);
		map.put("수박", 10000);
		map.put("배", 2500);
		map.put("귤", 500);
		
		System.out.println(map);
		map.put("귤", 3500);
		System.out.println(map);
		
		System.out.println(map.get("사과"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		System.out.println(map.containsKey("배"));
		System.out.println(map.size());
		
		for(String key :map.keySet()) {
			System.out.print(key+" : "+map.get(key)+" ");
		}
		System.out.println();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key+" : "+map.get(key)+" ");
		}
		System.out.println();
		
		System.out.println(map.remove("사과", 1500));
		System.out.println(map);
		System.out.println(map.remove("귤"));
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
	}

}
