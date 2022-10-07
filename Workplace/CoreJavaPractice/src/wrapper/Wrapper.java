package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;							//---> Declaration of data
		Integer x1=new Integer(num);		//---> Explicit Boxing
		Integer x2=num;						//----> Implicit Boxing
		System.out.println(num);
		System.out.println(x1);
		System.out.println(x2);
		int num2=x1.intValue();			//-------> Unboxing
		int num3=x2.intValue();			//------->Unboxing
		System.out.println(x1);
		System.out.println(x2);
		char xyz='X';
		Character ch=new Character(xyz);
		Character ch1=xyz;
		System.out.println(xyz);
		System.out.println(ch);
		System.out.println(ch1);
		boolean res=true;
		Boolean res1=new Boolean(res);
		Boolean res2=res;
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		double number=25.1246;
		Double number2=new Double(number);
		System.out.println(number);
		System.out.println(number2);
		double numb1=number2.doubleValue();
		System.out.println(numb1);
		
	}

}
