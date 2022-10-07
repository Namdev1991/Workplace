package collection;
import java.util.*;
public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("Yogya");
		list.add("Sagar");
		list.add("Sumit");
		list.add("Prathmesh");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.set(0, "Rahul"));
		System.out.println(list);

		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.sort(list);
		System.out.println(list);
		for(Object sort:list) {
			System.out.println(sort);
		}
		System.out.println("--**-----**---**------");
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println(list.remove("Sumit"));
		
		ArrayList list1=new ArrayList();
		list1.add("Rohan");
		list1.add("Prashant");
		list1.add("Amol");
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		Iterator itr1=list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		list.retainAll(list1);
		System.out.println(list);
		//list.clear();
		System.out.println(list.isEmpty());
		Collections.reverse(list);
		for(Object rev:list) {
			System.out.println(rev);
		}
		
	}

}
