package collection;
import java.util.*;
public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1=new ArrayList();
		l1.add("Virat");
		l1.add(71);
		l1.add("Rohit");
		l1.add(50);
		l1.add("Virat");
		System.out.println(l1);
		//PriorityQueue x1=new PriorityQueue(l1);//It will allow only homogeneous data 
		// and it will alow duplicate data also but not null value
		//System.out.println(x1);
		HashSet x2=new HashSet(l1);
		System.out.println(x2);
		
		
		

	}

}
