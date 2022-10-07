package string;
class Single{
	int num1=15;
	private Single() {
		System.out.println(" Constructor of single Class");
	}
	static Single x1=new Single();
	static Single method() {
		System.out.println(" hii .....");
		return x1;
	}
	void method2(int num1) {
		num1=this.num1;
		System.out.println("this is method2"+num1);
	}
}
public class Singleton  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Single x1=new Single();
		Single x2=Single.method();
		x2.method2(20);
		Single x3=Single.method();
		x3.method2(25);
	}

}
/*



*/