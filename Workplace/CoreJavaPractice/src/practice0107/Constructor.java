package practice0107;

public class Constructor {

	int num1;
	static int num2=10;
	Constructor(int num3){
		num1=20;
		int res=num3*num1;
		System.out.println("Parametrised Constructor"+res);
	}
	Constructor(int num1,int num3){
		this(15);  //By using this() Statement we can Call Constructor of Same Class.
		this.num1=20; //By using this keyword we can Call Non Static Member of Same Class.
		int res1=this.num1+num1;
		System.out.println("2 Parameter Constructor"+res1);
	}
	Constructor(double num1,int num3){
		this(15,10);  //By using this() Statement we can Call Constructor of Same Class.
		this.num1=15; //By using this keyword we can Call Non Static Member of Same Class.  
		double res1=this.num1+num1+num3;
		System.out.println("2 Parameter Constructor"+res1);
	}
	void add(int num5,int num4) {
		int sum=num5+num4;
		System.out.println("Sum of Non Static Method "+sum);
	}
	
	public static void main(String[] args) {
		Constructor a1=new Constructor(10.10,10);
		a1.add(10,20);
	}

}
