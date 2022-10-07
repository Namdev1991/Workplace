package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "Sagar");
		map.put(06, "Rahul");
		map.put(02, "Namdev");
		map.put(04, "Prashant");
		//map.put("Akshay", "Kshitij");
		
		System.out.println(map);
		map.remove(06);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		map.replace(4, "Rahul");
		System.out.println(map);
//		for(Entry<Integer, String> x:map.entrySet()) {
//			System.out.println(x.getKey()+" "+x.getValue());
//		}
		for(Entry x:map.entrySet()) {
			System.out.println(x.getKey()+" = "+x.getValue());
		}
	
	}

}
