package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Practiceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Banana");
		list1.add("Apple");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Banana");
		list2.add("Cucumber");
		
		System.out.println(list1.retainAll(list2));
		
		list1.forEach(a1 ->{
			System.out.println(a1);   //Lambda Expression
		});
		
		Iterator<String> itr=list1.iterator();
		
		//while(itr.hasNext()){
			//System.out.println(itr.next());
		//}
	}
}
/*FOr Print list 
use normal for loop
use for Each 
use lambda Expression
use iterator

for size-object.size
for add
object.add(index number,object)
objetc.add(object)
for get object of index
object.get(index)
for set-object.set()
collections.sort(object);
clloection.reverse;


*/