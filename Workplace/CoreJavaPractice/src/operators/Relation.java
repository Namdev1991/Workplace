package operators;

public class Relation {

	int a=25;
	static int b=10;
	static void relation(int c,int d) {
		if(c==d) {
			System.out.println("The C is equal to D");
		}else if(c>d){
			System.out.println("The C is Greater than D");
		}else if(c<d) {
			System.out.println("The C is Less than D");
		}
		else {System.out.println("The C is not equal to D");
		}	
	}
	static double add(int num1,double num2) {
		double sum=num1+num2;
		System.out.println("The Value of Num1 ="+num1);
		System.out.println("The Value of Num2 ="+num2);
		return sum;
	}
		int unary(int a)//10 /5
		{
			int b=++a + --a + a++ + a-- +a+ ++a -a++;
			//b=11+10+10+11+10+11-11
			//a	=11	+10+11+10+10+11+12
			int c=++a +a-- + ++a - ++a;// 5+3=8  8-1=7  
			//c=6+6+6-7
			//a=6+5+6 7
			System.out.println("The Value of B is ="+b);
			return b;
		}
	
	
	public static void main(String[] args) {
		Relation.relation(25,30); 
		relation(30,30);
		relation(25,55);
		double x=add(25,32.6);
		System.out.println("Tha Value of X is ="+x);
		Relation y=new Relation();
		int z=y.unary(10);
		if(x==z) {
			System.out.println("The Value of X and Z  is Same");
		
		}else if(x>z) {
			System.out.println("The Value of X is Greater than Z");
		}
		else {
			System.out.println("The Value of X and Z is not Same");
		}
		
		
	}

}
