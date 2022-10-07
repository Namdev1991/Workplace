package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Cricket");
		al.add(1245);
		al.add("School");
		al.add("KBPatil");
		al.add(10);
		al.add(2,"Namdev");
		System.out.println(al);  //It will print all elements of List
		System.out.println(al.size());// It will Print the no of element 
		System.out.println(new ArayList());//it will Print the fully qualified class @ hexadecimal address
		System.out.println(al.get(0));//it will print only element of zero index

		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----------*-----------*----------");
		for(Object x1:al) {
			System.out.println(x1);
		}
		System.out.println("--------*---------------*-----------*------");
		al.forEach(x1->{
			System.out.println(x1); // By using lambda expression
		});
		System.out.println("---------*-------------*-----------*---------");
		
		Iterator itr=al.iterator();
		System.out.println(itr.hasNext());
		while(itr.hasNext()) {                 //hasnext check the next element is present or Not and return boolean result
			System.out.println(itr.next());//       By using Iterator printing element of  
		}
		System.out.println(itr.hasNext());
		//while(itr.hasNext()) {				//no Value will be printed bacause once iteration is complete it will not print value 
			//System.out.println(itr.next());   //so create  new iterator for print the values 
		//}
		System.out.println(al);
		try{
			Collections.sort(al);//---> handling Exception by using try and catch
		}catch(Throwable b1) {
			System.out.println("please remove numbers from the arraylist");
		}
		al.set(1, "Hello");		//setting Value 
		al.set(5,"Hii");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		//al.clear();
		System.out.println(al.isEmpty());
		
	}

}
