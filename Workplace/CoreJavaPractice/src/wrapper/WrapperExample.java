package wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Wrapper Class- TO convert Datatype into object and vicevesra we using Wrapper Class
		//Boxing= Convert datatype into object is known as Boxing
		//Unboxing= convert Object into Data is known as Unboxing
		int num=10;
		Integer x1=new Integer(num);//Explicit boxing  
		System.out.println(x1);
		Integer x2=num;//Implicit Boxing
		byte num2=20;
		Byte x3=num2;
		System.out.println(x3);
		boolean x=true;
		Boolean x4=x;
		System.out.println(x4);
		int num4=x1.intValue();  //Unboxing
		double num6=20.12455;
		Double x5=new Double(num6);
		double num7=x5.doubleValue();//Unboxing
		System.out.println(num7);
	}
}
