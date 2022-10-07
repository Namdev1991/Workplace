package methodprograms;

public class Methods {
	static int a=25;
	float b=10.2f;
	
	static void add(int c,double d) {
		double res1=c+d;
		double res2=res1*Methods.a;
		Methods x=new Methods();
		double res3=res2*x.b;
		System.out.println("res 1 "+res1);
		System.out.println("res 2 "+res2);
		System.out.println("res 3 "+res3);
	}
	static double sub(int e,float f) {
	double res4=e-f;
	Methods y=new Methods();
	double res5=res4*y.b;
	System.out.println("res 4 "+res4);
	return res5;
	}
    void mul(int g,int h) {
    	int res6=g*h;
    	System.out.println("res 6 "+res6);
    }
    int div(int i,int j) {
    	int res7=i/j;
    	return res7;
    }
	public static void main(String[] args) {
		//Calling Static void Method 
	Methods.add(10, 10.3f); //Higher Data Type Can Take Lower Data Types
	
	//1) 
	Methods.sub(15,10.3f);//You Will Not Get Return Value 
	//2)
	System.out.println("Calling Static return Type Method = "+Methods.sub(15, 10.3f));
	// Whenever you call Method AS Above You will Get Return Type Value
	//3)
	double z=Methods.sub(15, 10.3f);//Accessing Method Sub By Storing Return type in A Variable
	System.out.println("Calling Static return Type Method = "+z);
	double z1=z*a;//Using stored Value As per our Requirement. 
	System.out.println("Final Value "+z1);
	Methods z2=new Methods();
	z2.mul(15, 20); //Since is a Non Static and Void type so it can be called only in one way
	//It is A Return Type NON Static Method and we Can call by Three Ways
	//1st Way of Calling
	z2.div(15, 20);//...... Return Value of Method will not be displayed 
	//2nd Way of Calling
	System.out.println(" 2 nd Way = "+z2.div(15, 20));
	// 3rd Way Of Calling 
	int z3=z2.div(15, 20);
	System.out.println("third way By Storing Return VAlue in Variable = "+z3);
	
	int res8=z3*a;
	System.out.println("Final Answer = "+res8);
	}

}
