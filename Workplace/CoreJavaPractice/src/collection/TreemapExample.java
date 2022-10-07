package collection;
import java.util.*;
public class TreemapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap x=new TreeMap();
		//x.put(null, "Sagar");---> Null point Exception
		x.put(1, "Rajaram");
		x.put(2, "Pooja");
		x.put(3, "Rahul");
		//x.put("A", "Ramu");----> Class Cast Exception
		System.out.println(x);
		System.out.println(x.descendingMap());
		System.out.println(x.descendingKeySet());
		System.out.println(x.firstKey());
		System.out.println(x.firstEntry());
		System.out.println(x.floorEntry(2));
		System.out.println(x.higherKey(1));
		System.out.println(x.lowerKey(2));
	
	}

}
