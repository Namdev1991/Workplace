package string;

public class StringBuffer0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hanuman");
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer(10);
		System.out.println(sb1.length());
		System.out.println(sb.capacity());
		StringBuffer sb2=new StringBuffer("Bajrang");
		sb.ensureCapacity(10);//Doubt
		System.out.println(sb2.capacity());
		System.out.println(sb.append(sb2));
		System.out.println(sb.capacity());
		System.out.println(sb.insert(7,"Bali"));
		System.out.println(sb.replace(7, 11, "Rama"));
		System.out.println(sb.delete(7, 11));
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(0));
		System.out.println(sb.substring(4));
		System.out.println(sb.reverse());
		
		StringBuilder sbb=new StringBuilder("Rajaram");
		StringBuilder sbb1=new StringBuilder("Rajaram");
		System.out.println(sbb.equals(sbb1));
		System.out.println(sbb==sbb1);
		System.out.println(sbb.toString().equals(sbb1.toString()));

}

}
