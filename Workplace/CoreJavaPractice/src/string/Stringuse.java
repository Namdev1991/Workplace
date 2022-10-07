package string;

public class Stringuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shree Ganesh";
		System.out.println(str.length());
		System.out.println(str.substring(2, 5));
		String[] str1=str.split("e", 3);
		for(String s:str1) {
			System.out.print(s);
		}
		String str2="    Shree Shivshankar";
		System.out.println(str.length());
		System.out.println("---------***------------*---------");
		System.out.println(str.concat(str2));
		System.out.println(str);
		System.out.println();
		String[] strr=str.split("a");
		
		System.out.println(str2.trim());
		System.out.println(str.substring(4));
		System.out.println(str.charAt(8));
		System.out.println(str.equals(str2));
		System.out.println(str==str2);
		System.out.println(str.concat(str2));
		System.out.println(str2.length());
		System.out.println(str.compareTo(str2));
		
		StringBuffer sb=new StringBuffer("Samarth");
		//StringBuffer sb1="ddgdgud";
		System.out.println(sb);
		//== && equals ----> Adress
		
		System.out.println(sb.capacity());
		System.out.println("----------**------****----");
		sb.trimToSize();
		System.out.println(sb.capacity());
		
//		System.out.println();
//		System.out.println("------------*------------*--------");
//		System.out.println(sb.capacity());
//		System.out.println();
//		System.out.println(sb.capacity());
//		System.out.println(sb.length());
//		System.out.println("-----------*-------------*-------");
//		System.out.println(sb.append(str2));
//		System.out.println(sb);
//		System.out.println(sb.length());
//		System.out.println(sb.insert(4, "Bhagvan"));
//		System.out.println(sb.replace(4,8, "Bhole"));
//		System.out.println(sb.delete(15, 20));
//		System.out.println(sb.deleteCharAt(10));//Only Single Charactor
//		StringBuffer str3=sb.reverse();
//		System.out.println(str3);
//		System.out.println(str3.capacity());
//		System.out.println(sb.hashCode());
//		System.out.println(sb.toString());
//		StringBuffer str4=new StringBuffer("   Hi How are You");
//		System.out.println(str2.indexOf('r'));
//		System.out.println(str2.indexOf('e', 6));
//
//		StringBuilder sbb=new StringBuilder("Hii ");
//		/*System.out.println(sbb.capacity());
//		System.out.println(sbb.append("how are you"));
//		System.out.println(sbb.replace(0, 3, "Hello"));
//		System.out.println(sbb.delete(6, 9));
//		System.out.println(sbb.replace(6, 9, "Who"));
//		 */
//		StringBuilder sbb1=new StringBuilder("Hii ");
//		System.out.println(sbb.equals(sbb1));
//		System.out.println(sbb.toString().equals(sbb1.toString()));
	}

}
