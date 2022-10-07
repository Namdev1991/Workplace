package basicprograms;

class  Mixed1
{
	static int a=15;//Static Global variable
	double b=25.6;//Non Static Variable
	float e=10.1f;
	public static void main(String[] args) 
	{
		float c=62.1f;//Local Variable
		double d=12545.2;//Local Variable

	//use of Local variables in main method
	double result=c*d;
System.out.println("Answer of Local Variable=       "+result);
System.out.println("------------*---------------*--------------------*---------------------------------");

//use of one Local & One Static Global in Main Method
	//float result1=c/a;
	float result1=(c/Mixed1.a);                        // Alternate Method for Initialising the Static Global Variable
	System.out.println("Answer of Global Variable=       "+result1);

	System.out.println("------------*---------------*--------------------*---------------------------------");
//use of one Local and one Non Static Variable
Mixed1 ref1= new Mixed1();//Syntax FOR CREATE A OBJECT of Non static Global variable
double result2=(d+ref1.b);
System.out.println("Result of one Local and one ="+result2);
double result3=(d+ref1.e);
System.out.println("Result of one Local and one ="+result3);

	}
}
