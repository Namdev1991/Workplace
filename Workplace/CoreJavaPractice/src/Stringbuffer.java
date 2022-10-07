
public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=new StringBuffer("Hiii");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.print(sb.append(sb1)); //Append add in first object and save the String
		System.out.println();
		System.out.println(sb.length());
		System.out.println(sb1.length());
		System.out.println(sb.insert(5, "How are you"));
		System.out.println(sb.length());
		System.out.println(sb.delete(5,8));
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(sb.replace(6, 9, "not"));
		
	}

}
