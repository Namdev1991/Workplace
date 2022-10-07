package collection;
import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap ref=new HashMap();
		ref.put(1, "Namdev");
		ref.put(2, "Sagar");
		ref.put(4, "Prashant");
		ref.put(3, "Prashant");
		ref.put(6, "Rahul"); //It will Update the value of null
		
		System.out.println(ref);
		System.out.println(ref.entrySet());
		//for Iteration
				for (Object i : ref.keySet()) {
					System.out.println(i);
				}
				System.out.println("----*-------*------");
//				for(Map.Entry x:ref.entrySet()) {
//					System.out.println(x.getKey()+"  "+x.getValue());
//				}
				System.out.println();
		System.out.println(ref.keySet());
		System.out.println(ref.values());
		System.out.println(ref.get(1));
		System.out.println(ref.remove(1));
		System.out.println(ref);
		System.out.println(ref.remove(1, "Namdev"));//Same as above
		System.out.println(ref.containsKey(2));
		System.out.println(ref.containsValue("Sagar"));
		System.out.println(ref.size());
		System.out.println(ref.isEmpty());
		System.out.println(ref.replace(2, "Tushar"));
		System.out.println(ref);
		System.out.println(ref.replace(2, "Tushar", "Avinash"));
		System.out.println(ref);
		
		
		
		
		
	}

	
}
