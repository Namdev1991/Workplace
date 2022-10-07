package basicprograms;

public class Revision250622 {
int num1=10; //InStance Variable
static int num2 =20; //Static Global Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num3; //Local Variable Declaration
		num3=15;//Local Variable Initialization
		double add=num3+Revision250622.num2; // Standard Method FOr Calling Static Global Variable
		//double add=num3+num2    .........  We Can Static Global Variable Directly When Variable is Declared in Same Class
      Revision250622 a=new Revision250622();
      double res=add*a.num1;// We are Calling Instance Variable Calling using Object
      //Object- Object is Used To store the Non static Member of Class.
      System.out.println("The Addition "+add);
      System.out.println("Final Result "+res);
	}

}
