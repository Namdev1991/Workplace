 package collection;
import java.util.*;
public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec=new Vector();
		vec.add(10);
		vec.add(1, 30);
		vec.addElement(20);
		vec.add(50);
		System.out.println(vec);
		System.out.println(vec.get(2));
		System.out.println(vec.firstElement());
		System.out.println(vec.capacity());
		System.out.println(vec.contains(20));
		System.out.println(vec.indexOf(30, 2));
		System.out.println(vec.size());
		vec.setSize(6);
		System.out.println(vec.size());
		vec.trimToSize();
		System.out.println(vec.capacity());
		System.out.println(vec);
		System.out.println(vec.isEmpty());
		System.out.println(vec.lastIndexOf(20));
		//vec.setElementAt(3, 45);
		System.out.println(vec);
		System.out.println(vec.set(4, 45));
		System.out.println(vec);
		//vec.setElementAt(20, 60);
		System.out.println(vec.removeElement(30));
		System.out.println(vec);
		vec.removeElementAt(2);
		System.out.println(vec);
		Iterator itr=vec.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
	}

}
