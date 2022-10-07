package collection;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet x=new TreeSet();
		x.add("Akash");
		x.add("Samarth");
		x.add("Anuj");
		//x.add(10);
		System.out.println(x);
		try {
		x.add(20);
		}catch(Throwable exp) {
			System.out.println(exp);
		}
		System.out.println(x);
		System.out.println(x.hashCode());
		Iterator itr=x.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}System.out.println();
		System.out.println("---------*-----------*--------");
		Iterator itr1=x.descendingIterator();  //Printing set i descending order
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		x.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
		TreeSet y=new TreeSet();
		y.add("Akash");
		y.add("Avinash");
		y.add("Akshada");
		System.out.println(y+" ");
		System.out.println(x.addAll(y));
		System.out.println(x);
		System.out.println(x.first());//it will print only first Element of the Set
		System.out.println(x);
		System.out.println(x.pollFirst());//It will remove first Element of the set and print 
		System.out.println(x);//then remaining will print
		System.out.println(x.last());//It will return last element
		System.out.println(x);
		System.out.println(x.pollLast());//It will Remove last Element and print
		System.out.println(x);
		System.out.println(x.headSet("Avinash"));
		System.out.println(x.headSet("Avinash", true));
		System.out.println(x.subSet("Akshada", "Anuj"));
		System.out.println(x.subSet("Akshada", false, "Avinash", true));
		System.out.println(x.tailSet("Anuj"));
		System.out.println(x.tailSet("Akshada", false));
		
	}

}
