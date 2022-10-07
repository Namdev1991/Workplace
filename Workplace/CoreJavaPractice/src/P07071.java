interface First1{
	int Empid=750;
	static int salary=30000;
	void method1(int num);
	 static void main(int num1,int num2) {
		int result=num1*num2; 
		System.out.println(" Result of Ststic method in Interdace "+result);
	}
	 default int method2() {
		 System.out.println("  Default method2 ");//
		 return 10;
	 }
}
public class P07071 implements First1{
	public void method1(int num){
		System.out.println("Overrided method "+num);
	System.out.println(method2());
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P07071 a=new P07071();
		a.method1(50);
		
	}

}
