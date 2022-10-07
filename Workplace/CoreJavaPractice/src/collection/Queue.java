package collection;
import java.util.*;
public class Queue {

	public Queue(ArrayList l1) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue q=new PriorityQueue();
		System.out.println(q.add(10));
		 System.out.println(q.offer(20));
		 System.out.println(q.add("Samarth"));
		 System.out.println(q);
		 System.out.println(q.size());
		 
		//  q.add("10");
		 //q.add(5);
//		 System.out.println(q.contains(10));
//		
//		 LinkedList lq=new LinkedList();
//		 lq.add(10);
//		 lq.addFirst(20);
//		 System.out.println("-----****----------****-------");
//		 System.out.println(lq);
//		 
//		 System.out.println(q);//if there is no Value it will print Blank
//		 Iterator itr=q.iterator();
//		 System.out.println("-------*---------*--------*---------*-----");
//		 while(itr.hasNext()) {
//			 System.out.print(itr.next()+" ");
//		 }
//		 System.out.println();
//		 q.forEach(a->{
//			 System.out.print(a+" ");// Lambda Expression
//		 });
//		 System.out.println();
//		 System.out.println(q.element());//if there is No it will return exception
//		 System.out.println(q.peek());//if there is no value it will return null 
//		 System.out.println(q.remove());
//		 System.out.println(q);
//		 System.out.println(q.poll());
//		 System.out.println(q);
//		 try{
//			 System.out.println(q.remove());// if Queue is empty this will return Exception
//		 }catch(Throwable th) {
//			 System.out.println(th);
//		 }
//		 System.out.println(q.poll());// If Queue is Empty it will return Null
//		 System.out.println(q.peek());
//		 
}

}
