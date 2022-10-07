package collection;
import java.util.*;
public class ArrayList1808 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("banana");
		list.add(1, "apple");
		list.add("grapes");

		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}System.out.println();
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}System.out.println("----***---***---***------***---");
		
		for(Object a:list) {
			System.out.print(a+" ");
		}
		list.forEach(a->{
			System.out.println(a);
		});

		System.out.println(list.size());
		list.set(1, "Pomograned");
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list.remove("mango"));
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
	}

}
