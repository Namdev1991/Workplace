package systemclass;
class First{
	First(){
		System.out.println("This id the Constructor of Class first");
	}
	void method1(){
		System.out.println("This is Method1 of Class first");
	}
	void method2() {
		System.out.println("This is method2 of class first ");
	}
}
public class Staticref {
	static First x1=new First();//------> This is static reference of Variable of Class First
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticref.x1.method1();
	//	Class reference variable Non Static Method  //System.out.println
		Staticref.x1.method2();
		
		First x2=new First();
		x2.method1();
	}

}
