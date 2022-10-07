package string;
class Sadhu{
	
	static Sadhu obj=new Sadhu();
	private Sadhu() {
		System.out.println("Private Constructor");
	}
	static Sadhu method1() {
		return obj;
	}
//	void method2() {
//		System.out.println("Method2");
//	}
}

public class Singleton0608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sadhu x1=new Sadhu();
		Sadhu x1=Sadhu.method1();
		System.out.println(x1.hashCode());
		//x1.method2();
		
		Sadhu x2=Sadhu.method1();
		System.out.println(x2.hashCode());
		
	}

}
