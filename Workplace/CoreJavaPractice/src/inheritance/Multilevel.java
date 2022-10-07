package inheritance;

public class Multilevel {
	static {
		System.out.println("Class Multilevel Starts");
	}
	int num1=20;
	static int num2=25;
	 Multilevel(){
		 double res=num1+num2;
		 System.out.println("Zero Parameter Constructor of Class Multilevel = "+res);
	 }
	 Multilevel(int num1){
		 this();
		 int res1=num1*this.num1;
		 System.out.println("One Parameter Constructor of Clasa Multilevel ="+res1);
	 }
	  static void second(int num3,int num4){
		  int res2=num3*num4;
		  System.out.println("Static Method of Multilevel Class  "+res2);
	 }
	  public static void main(String []args) {
	
	  }
}
class Multilevel_1 extends Multilevel{
final int x;
	int y=1;
		Multilevel_1(int num1,int num2){
		super(20);
		x=10;//Initializing the final variable In Constructor Because it is a Non Static 
		int add=num1+num2;
		System.out.println(add);
}
		Multilevel_1(double num3,int num2){
			this(10,20);
			double res=num3*num2;
			double res1=res*x;
			double res2=res1*y;
			System.out.println(res1);
			System.out.println(res2);
			if (res1==res2) {
				System.out.println("The Res1 and Res 2 are Same ");
			}else {
				System.out.println("The Res 1 and Res2 are Not Same");
			}
		}
		 public static void main(String []args) {
				System.out.println("Static Variable of Method Multilevel = "+Multilevel.num2);
				Multilevel.second(10,20);
				System.out.println("----*---------------*--******************-------------*-**-----*");
				Multilevel_1 a1=new Multilevel_1(20.10,10);
				System.out.println("Non static Variable of Class Multilevel = "+a1.num1);
				System.out.println("Non Static Variable of Multilevel_1 = "+a1.x);
				System.out.println("Non Static Variable of Multilevel_1 =  "+a1.y);
		  }
}
	
	
