package methodprograms;

public class Staticmethod2 
{
	
	public static void main(String[] args)
	{
	 //1) First METHOD AS BOTH METHODS ARE STATIC
		addnumber(25,35);
		
	 //2) SECOND METHOD 
		int x=25,y=15;
		addnumber(x,y);
		
   	//3)THIRD METHOD 
	System.out.println("The addition = "+addnumber(25,35));
	
	//4) YOU CAN STORE VALUE AS A REFERENCE 
	double ref=addnumber(35,55);
	double finalValue=ref%4;
	System.out.println("Final Value"+finalValue);
	
	}
public static double addnumber(int num1,int num2)
{
System.out.println("The value of Number1=   "+num1);
System.out.println("The value of Number2= "+num2);
double result=(num1+num2);
System.out.println("The Addition of Two number is =  "+result);
return result;
}
}
