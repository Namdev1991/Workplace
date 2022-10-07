package consthisfinal;

public class Twoclass {
	int num1=10;
	static int num2;
	final int num3;
	{
		num2=15;
		System.out.println("Non Static Variable num1 ="+num1);
	}
	static {
 System.out.println("Static Gloabal Variable="+num2);	
	}
	Twoclass(int num1){
		num3=10;
		this.num1=num1;
		int sum=this.num1+num3;
		System.out.println("Addition of one parameter  constructor "+sum);
	}
	Twoclass(int num1,int num2){
		this(20);
		Twoclass.num2=num2;
		int sum=Twoclass.num2+num3;
		System.out.println("Addition of Two parameter  constructor "+sum);
	}
		void display() {
			System.out.println("Class Two Class Program End");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method
	//	Twoclass a=new Twoclass(15,25);
		num2=20;
		System.out.println("Reinitialization of num2 "+num2 );
		System.out.println("Calling Method of Class Two "+Two.add()); //Doubt
		Two b=new Two();
		System.out.println("Calling Non Static Method of Class Two "+b.mul(10,20));
		System.out.println("Calling Method of Non Staic Overloaded Method "+b.mul(10,20,30));
	//	a.display();
		}

}
class Two{
	static {
		System.out.println("This is static block of Class Two ");
	}
	{
		System.out.println("This is Non static Block of Class Two ");
	}
	int num1=25;
	static int num2=20;
	
	static int add() {
		Two a2=new Two();
		int sum2=a2.num1+num2;
		return sum2;
	}
	int mul(int num3,int num4) {
		int mul=num3*num4;
		return mul;
	}
	int mul(int num5,int num6,int num7) {
		int mul=num5*num6*num7;
		return mul;
	}
	Two(){
		Two.num2=20;
		int num1;
		num1=this.num1;
		int sum=num2+num1;
		System.out.println("Constructor Two Result = " +sum);
	}
	public static void main(String[]args) {
		System.out.println("Static Member of TwoClass "+Twoclass.num2); 
		Twoclass x=new Twoclass(15,25);
		System.out.println(x.num1);
		
	}
}
