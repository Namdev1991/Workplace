package wrapper;

public class Wrapper0608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20; // Declaration and Initialization
		Integer x = 20; // ---> Implicit Boxing here Integer-Wrapper class x=object and 20-Datatype into
						// Object type
		Integer x1=new Integer(num1); //Explicit boxing
		int num=x1.intValue();//Unboxing form object to data type
		Double x2=new Double(20.551);
		double num2=x2.doubleValue();
		System.out.println(num2);
		Integer x4=new Integer(35);
		int num4=x4.intValue();
		
		
		Integer x5=new Integer(36548);
		int num6=x5.intValue();
		
		String x3="21261";
		int num3=Integer.parseInt(x3);
		System.out.println(num3);	
	}
}
