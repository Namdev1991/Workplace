package collection;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList List=new ArrayList();
		List.add("ram");
		List.add("Hanuman");
		List.add(2, 20);
		List.add("Shekhar");
		System.out.println(List);
		for(int i=0;i<List.size();i++) {
			System.out.print(List.get(i)+" ");
		}
		System.out.println();
		System.out.println("---*---*----*--------");
		for(Object a:List) {
			System.out.print(a+" ");
		}System.out.println();
		List.forEach(b->{
			System.out.print(b+" ");
		});System.out.println("----------*-****--------****----");
		Iterator itr=List.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println(List.size());
		System.out.println(List.get(1));
		System.out.println(List.set(2, "Shyam"));
		System.out.println(List);
		Collections.sort(List);//Sorting in Ascending Order
		System.out.println(List);
		System.out.println(List.remove("Shekhar"));
		System.out.println(List);
		ArrayList newlist=new ArrayList();
		newlist.add("Sumit");
		newlist.add("Sagar");
		newlist.add("Sachin");
		System.out.println(List.addAll(newlist));
		System.out.println(List);
		List.addAll(4,newlist);
		System.out.println(List);
		
	}

}
