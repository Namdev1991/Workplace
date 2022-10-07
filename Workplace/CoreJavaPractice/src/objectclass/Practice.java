package objectclass;

class One extends Object{
	int num1;
	int num2;
	One(int num) {
		this.num1=num;
		System.out.println(" Constructor of Class One");
	}
	void method(int num,int num1) {
		System.out.println("Addition of Number "+(num+num1));
	}
	public int hashcode() {				// Overiding Method of Object Class
		System.out.println(" Hashcode Method");
		return 15;
	}
	public String toString() {
		return "To String Implementation ";		
	}
}
public class Practice extends One{
		Practice(){
		super(10);
	}
		void method3() {
			System.out.println(" Method 3");
		}
		public int hashcode() {
			System.out.println(" This is Overrided Method");
			return 20;
		}
		public String toString() {
			return "Overrided To String Method";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One x1=new One(20);
		System.out.println(x1);
		System.out.println(x1.hashcode());
		One x2=new Practice();//------------- Upcasting
		System.out.println(x2);
		System.out.println(x2.hashcode());
		System.out.println(x1.equals(x2));
		Practice x3=(Practice)x2; //--------->  DownCasting
		System.out.println(x3);
		System.out.println(x3.toString());
		System.out.println(x3.hashcode());
		x3.method3();
		One x4=(One)x3;  // Downcasting
		//x4.method3();
		x4.method(20,25);
	}

}
