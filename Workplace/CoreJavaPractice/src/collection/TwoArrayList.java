package collection;
import java.util.ArrayList;

public class TwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Ram");
		list1.add("Shyam");
		list1.add("Ravan");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Sita");
		list2.add("Geeta");
		list2.add("Hanumant");

		System.out.println(list1);
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		//list2.addAll(3, list1);
		//System.out.println(list2);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		System.out.println(list1.remove("Ravan"));
		System.out.println(list1);
		System.out.println(list1.retainAll(list2));
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("Laxman");
		list3.add("Ram");
		System.out.println("-----*-----------*-------");
		System.out.println(list1);
		System.out.println(list3);
		System.out.println(list3.retainAll(list1));
		
	}

}
