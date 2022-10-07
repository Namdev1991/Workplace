package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Family=new ArrayList<String>();
		Family.add("AAI");
		Family.add("BABA");
		Family.add("Bhau");
		Family.add("Sister");
		System.out.println(Family);
		System.out.println(Family.size());
		Family.add(3, "Sister in Law");
		System.out.println(Family);
		Family.set(2, "Brother");
		System.out.println(Family);
		System.out.println(Family.get(4));
		Collections.sort(Family);
		System.out.println(Family);
		Family.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
		Iterator itr=Family.iterator();
		System.out.println(itr.hasNext());
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println(itr.hasNext());
		System.out.println(Family.isEmpty());
		Collections.reverse(Family);
		System.out.println(Family);
		System.out.println(Family.remove(3));
		System.out.println(Family.remove("Sister"));
		
	}

}
