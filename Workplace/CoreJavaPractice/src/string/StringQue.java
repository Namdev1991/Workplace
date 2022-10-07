package string;

public class StringQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="Pune";
//		String str1="PuneBang lore";
//		System.out.println(str1.charAt(5));
//		System.out.println(str1.length());
//		System.out.println(str1.substring(4));
//		System.out.println(str1.substring(4, 8));
//		System.out.println(str1.subSequence(4, 8));
//		System.out.println(str.length());
//		System.out.println(str.concat(str1));
//		System.out.println(str.length());
//		System.out.println(str1.indexOf('n'));
//		System.out.println(str1.indexOf('n',3));
//		System.out.println(str1.lastIndexOf('l'));
//		System.out.println(str1.replace('n', 'm'));
//		System.out.println(str1.replaceFirst("n", "m"));
//		System.out.println(str1.replaceAll(" ", "   "));
//		String[] str2=str1.split(" ");
//		for(String a:str2) {
//			System.out.println(a);
//		}
		StringQue x=new StringQue(); //Earlier Function of This as in object class
		System.out.println(x.toString());
		System.out.println(x.hashCode());//Memory Location in integer Value
		
		StringBuffer sb=new StringBuffer("Nagpur");
		System.out.println(sb.capacity());//Capacity = Default +String Length
		System.out.println(sb.length());
		sb.trimToSize();// This method is used Remove Default Capacity
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Goa");
		System.out.println(sb.append(sb1)); //This Method is used to append two Strings
		System.out.println(sb);//This Proves that StringBuffer is Mutable.
		System.out.println(sb.insert(3, "Pune"));
		System.out.println(sb.delete(3, 7));
		System.out.println(sb.insert(6, " "));
		System.out.println(sb.reverse());
		System.out.println("--------******---****------------");
		StringBuilder sbb=new StringBuilder("Amravati");
		StringBuilder sbb1=new StringBuilder("Amravati");
		System.out.println(sbb.toString());
		System.out.println(sbb.hashCode());
		System.out.println(sbb1.hashCode());
		
		System.out.println(sbb==sbb1);//Compare on Address
		System.out.println(sbb.equals(sbb1));//Compare on Address
		System.out.println(sbb.toString().equals(sbb1.toString()));
		
	}
}

