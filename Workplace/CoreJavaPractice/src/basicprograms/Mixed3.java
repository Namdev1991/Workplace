package basicprograms;

public class Mixed3 {
	static float num3=25.6f;
    double num4=25.0;
    double num5=25;
   
	public static void main(String[] args) {
		System.out.println("Program Starts .....");
	int num1=25;
	double num2=35.6;
	
	double result1=num1*num2;
	System.out.println("Result 1 = "+result1);
	num1=36;
	num2=10.06;
    result1=num1/num2;
	System.out.println("Updated Result 1  ="+result1);
	
	// use of Static & Local Variable 
	float result2=(num3*num1);
	System.out.println("Result 2  ="+result2);
	num3=26.0f;
	num1=10;
	result2=(num1/Mixed3.num3);
	System.out.println("Updated With Another Method using for initialization   ="+result2);
	
	//use of non static and Static Variable 
	Mixed3 ref=new Mixed3();
	double result3=(ref.num4*Mixed3.num3);
	System.out.println("Result 3   =  "+result3);
	num3=26.8f;
	result3=(ref.num5*num3);
	System.out.println("Updated and another Method Using"+result3);
	System.out.println("Program End ..........");
	}

}
