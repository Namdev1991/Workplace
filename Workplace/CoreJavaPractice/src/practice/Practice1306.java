package practice;

public class Practice1306 {
	float a=12.5f;  //NON Static Global variable
	 static double b=10000; //Static Global Variable
	 static double roi(int year,double principle) 
	 {
		 Practice1306 ref=new Practice1306();
		 double amount=b*ref.a/100*year;
		 double finalamount=amount+principle;
		 return finalamount;	 
	 }
	 void add(double principle,float roi,int year)
	 {
		double  add=principle*roi/100*year;
		System.out.println("Principle  = "+principle);
		System.out.println("Rate of Interest  = "+roi);
		System.out.println("Time  = "+year);
		System.out.println("The First Amount "+add);
		
	 }
	 
	public static void main(String[] args) 
	{
		Practice1306 ref2=new Practice1306();
	ref2.add(25000,6.8f/100,5);
	double ref3=roi(10,15000);
	System.out.println("Static Method Principle = "+ref3);
	double finalanswer=ref3*b*ref2.a;
	System.out.println("Final Answer of  ="+finalanswer);
		
	}

}
