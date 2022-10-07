package interface1;
interface one{
	static int num1=10;
	void method(int num1);//public abstract
	int num2=15;//public static final
	void method1(int num2);
	
}
interface Two extends one{
	void method1(int num3);
	 void method2(int num4); 
}
interface Eight extends Two,one{
	
}
public class Interface101 implements one,Two {
	 public void method(int num1) {
		System.out.println("Method of Interface Class "+num1);
	}
	 public void method1(int num2) {
		this.method(25);
		System.out.println("Method 1 of interface class "+num2);
	}
	public void method1(int num3,int num4) {
		int res=num3*num4;
		System.out.println(res);
	}
	public void method2(int num4) {
		this.method1(25,50);
	System.out.println("value of number 4 "+num4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one x1=new Interface101();
		x1.method(10);
		Interface101 x2=new Interface101();
		x2.method1(15);
		x2.method2(20);
	}

}
