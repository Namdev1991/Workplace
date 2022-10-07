package collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(1, "Namdev");
		tm.put(2, "Sagar");
		tm.put(6, "Rahul");
		tm.put(4, "Prashant");
		
		System.out.println(tm);
		System.out.println(tm.ceilingEntry(5));
		System.out.println(tm.ceilingKey(5));
		System.out.println(tm.containsKey(5));
		System.out.println(tm.containsValue("Kshitij"));
		
		for(Entry<Integer, String> x:tm.entrySet()) {
		System.out.println(x.getKey()+" "+x.getValue());	
		}
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.descendingMap());
		System.out.println(tm.firstEntry());
		//System.out.println(tm.pollFirstEntry());
		System.out.println(tm.floorEntry(3));
		System.out.println(tm.get(3));
		System.out.println(tm.higherEntry(3));
		System.out.println(tm.lowerEntry(3));
		System.out.println(tm.headMap(3));
		System.out.println(tm.tailMap(3));
		tm.put(3, "Ramesh");
		System.out.println(tm);
		
	}

}
