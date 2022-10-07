package collection;
import java.util.*;
public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(10, "Sagar");
		tm.put(20, "Rahul");
		tm.put(14,"Namdev");
		tm.put(16, "Akshay");
		tm.put(18, "Samarth");
		System.out.println(tm);
		System.out.println(tm.ceilingEntry(18));
		System.out.println(tm.keySet());
		System.out.println(tm.get(3));
		for(Object k : tm.keySet()) {
			System.out.println(tm.get(k));
		}
		System.out.println(tm.ceilingKey(17));
		TreeMap tm1=(TreeMap)tm.clone();
		System.out.println(tm.containsKey(14));
		System.out.println(tm.equals(tm1));
		System.out.println(tm.firstKey());
		System.out.println(tm.floorEntry(15));
		System.out.println(tm.get(16));
		System.out.println(tm.higherKey(16));
		System.out.println(tm.lowerKey(14));
		System.out.println(tm.remove(10));
		
		
		/*
		System.out.println(tm.size());
		//tm.clear();
		System.out.println(tm.isEmpty());
		System.out.println(tm.containsKey(4));
		System.out.println(tm.containsValue("Namdev"));
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.floorEntry(19));//If we Enter 18 no then it will check 
		// that the 18 is present or not if yes then it return 18 nos key and value if not then 
		//Checks that the is there any lower key is availble or not if yes then return this key and value pair 
		//if no it returns null
		System.out.println(tm);
		System.out.println(tm.headMap(16));
		System.out.println(tm.headMap(16, true));
		System.out.println(tm.descendingMap());
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.higherEntry(20));
		System.out.println(tm.subMap(15, 20));
		System.out.println(tm.subMap(14, true, 20, true));
		System.out.println(tm.tailMap(15));
		System.out.println(tm.tailMap(15, false));
		//tm.replaceAll(null);
*/
	}

}
