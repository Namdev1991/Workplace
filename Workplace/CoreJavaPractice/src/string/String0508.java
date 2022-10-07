package string;

public class String0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automation";
		String str1="Manual";
		String str2="Manual";
		String str3="Manual"; //Up to this statement all reference points to the Manual
		System.out.println(str3);
		str3="Automation";// in this statement we are changing reference to automation 	
		System.out.println(str3);
		System.out.println(str.charAt(5));
		System.out.println(str.toCharArray());
		System.out.println(str.length());
		System.out.println(str.substring(4));
		System.out.println(str.substring(5, 10));
		System.out.println(str.subSequence(6, 10));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("o", 4));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.lastIndexOf("o", 7));
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println(str.concat(str1));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a", "x"));
		System.out.println(str.replace("to", "bo"));
		System.out.println(str.replaceFirst("u", "o"));
		System.out.println(str.contains("A"));
		System.out.println(str.endsWith("n"));
		String[] str4=str1.split("a");
		for(String x:str4) {
			System.out.print(x+" ");
		}
	}
}

