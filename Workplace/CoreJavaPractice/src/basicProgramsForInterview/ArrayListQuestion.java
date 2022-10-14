package basicProgramsForInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 List list=new ArrayList();
	 list.add("Sagar");
	 list.add("Namdev");
	 list.add("Prashant");
	 
	 List list1=new ArrayList(list);
	 list1.add("Muktanand");
	 list1.add("Rahul");
	 System.out.println(list1);
	 //How TO Compare Two Array List
	 //------> By Using Sort and Equals
	 
	 Collections.sort(list);
	 Collections.sort(list1);
	 System.out.println(list.equals(list1));

	 
	 // How to find Additional Element in List 2
//	 list1.removeAll(list);
//	 System.out.println(list1);
	 
	 
	 //How to find common Element in Array List
	 list1.retainAll(list);
	 System.out.println(list1);
	 
	}

}
