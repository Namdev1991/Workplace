package systemclass;
class One{
	void method() {
		System.out.println(" This is method of Class One");
	}
	void method1() {
		System.out.println(" This is method1 of class one");
	}
}
public class Staticrefusein extends One {
	static One x1=new One();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticrefusein.x1.method();
	}

}
