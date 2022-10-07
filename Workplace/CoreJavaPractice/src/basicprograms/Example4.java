package basicprograms;
class Example4  
//Assignment First
//Area of Circle
{
	public static void main(String[] args) 
	{
		System.out.println("Progarm Starts..........*..........*..........*");
		double Pie=(22.0/7);
		double R=300.1025;
		double area=Pie*R*R;

		System.out.println("Pie =" +Pie);
		System.out.println("Radius = " +R);
		System.out.println("Area of Circle = "+area);

		System.out.println("Program End ---*------------*-----------------*----------");


		//Area of Rectangle
		double Length=10.0675,Width=14.067;
		double areaofrectangle=Length*Width;

		System.out.println("Length of Rectangle= "+ Length);
		System.out.println("Width of Rectangle=  "+ Width);
		System.out.println("Area of Rectangle=  " + areaofrectangle);
        System.out.println("Program End ---*------------*-----------------*----------");

		//Simple Interest
		double Principle=500000,Rate=0.12,Years=5.3;
		double FinalAmount=Principle*Rate*Years;
		System.out.println("Principle= "+ Principle);
		System.out.println("Rate= "+ Rate);
		System.out.println("Final Amount of Interst= "+ FinalAmount);

		System.out.println("Program End ---*------------*-----------------*----------");
		

		//Convert Farenheight to Celsius
        double F=80;
		double C=((F-32)*(5.0/9));

		System.out.println("Farenheite = "+F);
		System.out.println("Degree Celsius when Farenheight = "+F+"   Ans is = "+C);
		System.out.println("Program End ---*------------*-----------------*----------");
		


	}
}
