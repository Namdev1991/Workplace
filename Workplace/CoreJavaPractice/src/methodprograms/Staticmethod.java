package methodprograms;

public class Staticmethod {

	public static void addnumber(int num1,int num2)

	{ int result= (num1+num2);
	System.out.println("Value of Number1 =  "+num1);
	System.out.println("Value of Number2 =  "+num2);
	System.out.println("Addition of 2 numbers =  "+result);
	
	}
	public static void main(String []args)
	{
	addnumber(10,20);//***  Method one Directly Call
		//int x=15,y=25; //**** 2nd Method for calling Void method without return value 
		//addnumber(x,y);//**** 2nd Method
// if line no 9 output not print  in void method then you cannot take the output in main method
		
	}
	

}
