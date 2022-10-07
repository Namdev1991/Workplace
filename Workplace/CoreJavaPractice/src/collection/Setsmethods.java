package collection;
import java.util.*;
public class Setsmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set x=new HashSet(); 
		x.add("Mango");
		x.add(123);
		x.add("Banana");
		x.add("");
		
		System.out.println(x);
		System.out.println(x.toString());
		System.out.println(x.size());
		Iterator itr=x.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		x.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
		Set y=new HashSet();
		y.add("Mango");
		y.add(123);
		y.add("Apple");
		System.out.println(y);
		System.out.println("----------*-------------*-----");
		x.addAll(y);
		System.out.println(x);
		/*
		System.out.println(x.remove("Mango"));
		System.out.println(x);
		System.out.println(x.remove(146));
		System.out.println(x);
		System.out.println(x.removeAll(y));
		System.out.println(x);
		System.out.println(x.contains("Banana"));
		System.out.println(x.isEmpty());
		System.out.println(x);
		*/
		System.out.println(x.retainAll(y));
		System.out.println(x);
		
	}
}
