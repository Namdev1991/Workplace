package staticNonstaticPractice;

public class Ex3 {
	public int a = 10, b = 30;// non static Global Variable
	public static int x = 50, y = 60; // static Global Variable

	public static void main(String[] args) {

		System.out.println("Start of Program");
		Ex3 obj1=new Ex3();
		Ex3 obj2=new Ex3();
		Ex3 obj3=new Ex3();
		System.out.println("End of Program");
	}

	public void test1() {
		System.out.println("Test1");//non static method
	}
	public void test2() {
		System.out.println("Test2");//non static method
	}
	public static void test3() {
		System.out.println("Test3");//static method
	}
	public void test4() {
		System.out.println("Test4");//static method
	}
	}


