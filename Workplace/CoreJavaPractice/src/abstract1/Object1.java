package abstract1;
abstract class Test1{
		abstract void test(int num1);
		abstract void test1();
}
public class Object1 extends Test1  {
	void test(int num1) {
		
	}
	void test1() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 x=new Test1() {
			void test(int num1) {
				System.out.println(num1);
			}
			void test1() {
				System.out.println("Test1");
			}
		};
		x.test(20);
		x.test1();
	}
	}


