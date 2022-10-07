package inheritance;
class Parent{
	void method1(int a){
System.out.println("Method1 of Parent Class");
}
}
class Child extends Parent{
	void method1(int b) {
		System.out.println("Method1 of Child Class");
	}
}

public class Hierarichal extends Parent {
	void method1(int b){
		System.out.println("Method of Multiple class");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarichal a1=new Hierarichal();
		a1.method1(20);
		Child a2=new Child();
		a2.method1(20);
		

	}

}
