package consthisfinal;

public class Mixed {
	final int num1;//------> Non Static Final Variable
	final static int num2;// -----> Static Final Variable
	int num6=10;      // ------> Non Static Variable
	static int num7=20; // ---> Static Variable
	
static {   //------> Static Block 1
	System.out.println("Program Starts");
	num2=10;  // ---------> Initialization of Static Final Variable in Static Block
}
static { // --------> Static Block 2
	System.out.println("Print static Block Two");	
}
	Mixed(){      // -------> Zero Parameter Constructor
		num1=14; //----------> Initialization of NON Static Final Variable in Constructor
		int num1=10;// -------> Local Variable With Same Name 
		int x=this.num1*num1;// ------> Use of Same name Variable By This Keyword 
		int sum=x+num2;
		System.out.println("Output of Zero Parameter Constructor "+sum);
	}
	{           // ---------> Non Static Block
		System.out.println("Printing the Non Static Block ");
	}
	Mixed(int num3,double num4){ //-----------> Parameterized Constructor
		this();      // -------> Calling Current Class Constructor by using this() Statement
		double mul=num3*num4;
		System.out.println("Output of Parameterised Constructor  "+mul);
	}
	Mixed(int num5){ //----> Constructor Overloading By changing No of parameters
		this(20,25.10); // -------> Calling Current class Constructor By using this statement
		int sum3=num6*num7;
		System.out.println("Final constructor  "+sum3);
	}
	void display() { //------->Non Static  No Return and Zero Parameter Method 
		System.out.println("Method Calling");
	}
	static double answer(int num8,double num9) {//------> return type Static Parameterized Method
	double sum4=num8*num9;
	return sum4;
	}
	
	public static void main(String[] args) {
		Mixed a=new Mixed(10); // -----> Object Creation and Constructor Calling 
		a.display();// ---> calling of Non Static Method by using Object
		System.out.println("---*----------------------------*-***********----------");
		System.out.println("Static Method Calling "+Mixed.answer(20,50.10)); //---> Calling static Method
		System.out.println("---*----------------------------*-***********----------");
		Mixed b=new Mixed(15);// ----> initializing with different values
		System.out.println(b.num6);
		
		
	}

}
