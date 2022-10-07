
public class String2707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rahul jain songs";
		System.out.println(str.toString());//Override in String so it will print String
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 8));
		System.out.println(str.subSequence(6, 10));
		String str1=new String("     Arijit sing songs");
		System.out.println(str1);
		System.out.println(str.concat(str1));
		System.out.println("--------*--------*---");
		System.out.println(str.length());
		System.out.println(str.indexOf("h"));//It will Return First Index
		System.out.println(str.indexOf("a", 3));//It will return index of a after 3rd index
		System.out.println(str.lastIndexOf("g"));
		System.out.println(str.lastIndexOf("n", 14));
		System.out.println(str.equals(str1));//Based on value
		System.out.println(str==str1);//Based on the address
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str1.trim());
		System.out.println(str.replace("a","X"));//Replacing All
		System.out.println(str.replaceAll("a", "X"));//Same Replacing all
		System.out.println(str.replaceFirst("a", "Y"));//Only replace first occurrence
		System.out.println(str.contains("a"));
		System.out.println(str.endsWith("g"));
		String[] str2=str.split("a");//Split on the Basis of Charactor no matter how many times it 
		for(String x:str2) {
			System.out.print(x+" ");
		}
		System.out.println();
		String[] str3=str.split("a", 2);//Split on the basis of Charactor in Specified nos 
										// If 1 then print as it is if 2 then Remove one charactor				
		for(int i=0;i<str3.length;i++) {
			System.out.print(str3[i]+" ");
		}
	}


}
