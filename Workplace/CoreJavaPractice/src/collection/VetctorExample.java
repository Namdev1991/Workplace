package collection;
import java.util.*;
public class VetctorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec=new Vector();
		System.out.println(vec.capacity());
		System.out.println(vec.size());
		vec.add(20);
		vec.addElement("Vaibhav");
		vec.add("Dipak");
		vec.addElement("Kiran");
		
		System.out.println(vec);
		System.out.println(vec.capacity());
		System.out.println(vec.size());
		vec.setSize(3);//Return type is void
		System.out.println(vec);
		System.out.println(vec.get(1));
		System.out.println("-----** ");
		System.out.println(vec.set(2, "Kiran"));
		System.out.println(vec);
		vec.setElementAt("Kiran", 1);
		System.out.println(vec);
		System.out.println(vec.elementAt(0));
		vec.trimToSize();//Trim the extra Capacity of Vector
		System.out.println(vec.capacity());
		vec.addElement("Ashwin"); // Element added directly
		System.out.println(vec);
		System.out.println(vec.capacity());
		for(Object x:vec) {
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator itr=vec.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		vec.forEach(Element ->{
			System.out.print(Element+" ");
		});
		System.out.println();
		for(int i=0;i<vec.size();i++) {
			System.out.print(vec.get(i)+" ");
		}
	
		
	}

}
