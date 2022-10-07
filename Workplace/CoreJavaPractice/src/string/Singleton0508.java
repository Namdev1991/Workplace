package string;
class Singleton05{
	private Singleton05() {
		System.out.println("this is Private constructor");
	}
	static Singleton05 x=new Singleton05();
	static Singleton05 method() {
		System.out.println("Static Method");
		return x;
	}
	void display() {
		int a,b,c;
		b=10;
		c=20;
		a=b+c;
		System.out.println(a);
	}
}

public class Singleton0508 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton05 x =new Singleton05();
		Singleton05 x1=Singleton05.method();  //object Creation of Singleton Class
		x1.display();
		Singleton05 x2=Singleton05.method();
		System.out.println(x1.toString());
		System.out.println(x2.toString());
	}
}
//If suppose we try to create a another or Second object
//then reference variable points to the same address