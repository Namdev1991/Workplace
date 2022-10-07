package string;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Rahul");
		StringBuffer str1=new StringBuffer("Sagar");
		System.out.println(str.capacity());
		System.out.println(str1.capacity());
		System.out.println(str.length());
		System.out.println(str1.append(str));
		System.out.println(str.charAt(4));
		System.out.println(str1.charAt(4));
		System.out.println(str.length());
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(0, 5));
		System.out.println(str1.indexOf("R"));
		System.out.println(str1.indexOf("a", 3));
		System.out.println(str1.lastIndexOf("u"));
		System.out.println(str1.equals(str));
		System.out.println(str1==str);
		System.out.println(str1.insert(5, " Gughe "));
		System.out.println(str1.replace(0, 5, "Builder"));
		System.out.println(str1.delete(8, 13));
		System.out.println(str1.deleteCharAt(7));
		System.out.println(str1.reverse());
		StringBuilder sb=new StringBuilder("");	
	}

}
