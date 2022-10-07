package practice0107;

public class Block {
	final static int num1; //Final Variables---Static
	final int num2; // Final Non Static 
	final int num3=20;
	static {// ----> JVM execute Static Blocks before main method
		num1=20;
	Block a2=new Block(10,20);
	// a1.num2=10; this is NOt Possible in case of Block
		int a=10;
		double b=20;
		double div=b/a;
		double mul=a2.num3*div;
		System.out.println("division of Static Block "+div);
		System.out.println(" Final "+mul);
	}
	Block(int num2,int num3){
	//	num2=10;-----> Initialization of Non static Final Variable can be possible in Constructor
		int mul=num2*num3*this.num2;
		System.out.println(" Constructor "+mul);
	}
	{
		num2=10;
		int res=num1*num2;
		System.out.println(" Result of NON Static Block "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
