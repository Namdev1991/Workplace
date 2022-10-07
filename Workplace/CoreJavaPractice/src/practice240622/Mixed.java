package practice240622;

public class Mixed {
int num1=12;//Non Static Global Variable
static int num2=10; //Static Global Variable
static double add(int num3,double num4) {	// Static Method with Return Type & Local Variable 
	System.out.println("The Num3 Value = "+num3);
	System.out.println("The Num4 VAlue = "+num4);
	double res=num3+num4;
	Mixed a=new Mixed();//object Creation for access Non Static Variable in Static Method
	double res1=res*a.num1;
	double res2=res1+num2;
	return res2;
}
void mul() {//Non Static Method Without Return type and Parameters
	 int num1=120;
	int res3=num1/this.num1;// for Differentiate between Local & Non Static Global Variable this keyword is Used
	System.out.println("The Result of Mul Method "+res3);
}
static double add(double num5) { //add Method Overloading with different No of Parameters
	double add=num5*num2;
	return add;
}

	public static void main(String[] args) {
		//Static Method Calling 
		Mixed.add(20,25.10);//Direct Calling but it does not return any value 
		System.out.println("---------*------------*------------*----------");
		
        System.out.println("Static Method Calling in Main method "+Mixed.add(20,25.10));
        //above line is used for Method Calling for getting return Value 
        System.out.println("---------*------------*------------*----------");
        double x=add(20,25.10);
        double res4=x*num2;
        System.out.println("The Result after using return Value of Method = "+res4);
        
        System.out.println("----------*----  Non Static And Void Method Calling");
        Mixed b=new Mixed();//created object for Calling Non Static Method in Static Method
        b.mul();//Calling of Non Static Method with No return Type 
        double y=add(100.5);//Calling Overload Method in Static and Using its value in next operations
        System.out.println("The result is Calling "+add(100.5));
        if (x==y) {
        	System.out.println("The Result of Both Method are same ");
        }else {
        	System.out.println("The Result Of Methods Are Not Same");
        }
                
        }

}
