package collection;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a1=new LinkedList();
		a1.add("Aksh");
		a1.add(20);
		System.out.println(a1.peek());
		a1.add("Avinash");
		a1.add("Kuku");
		
		System.out.println(a1);
		ListIterator itr=a1.listIterator();
		System.out.println(itr.hasPrevious());
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasPrevious());
		System.out.println(itr.previous());
	}

}
