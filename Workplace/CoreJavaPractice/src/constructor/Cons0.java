package constructor;

public class Cons0 {
	int num1;

	Cons0(int num1,int num2){
		int res=num1+num2;
		System.out.println("The Result of Cons0 1 "+res);
	}
		void display() {
			System.out.println("Non Static"+this.num1);
		}
			
	Cons0(double num3,int num4){
		double res=num3*num4;
		System.out.println("The Result of "+res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Cons0 x=new Cons0(10,15);// Used of Constructor is to initialize NON STATIC MEMBER of Class 
   System.out.println("Value of num1 "+x.num1);
   x.display() ;
   Cons0 y=new Cons0(12.10,10);
   y.num1=25;
   System.out.println("The Updated Value of NUM1 = "+y.num1);
	}

}//Use Of Constructor Overloading is For Performing similar type of operations with changing Parameters
//we can initialize Every Instance(Object)with different parameters



