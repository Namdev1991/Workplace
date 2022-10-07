package string;
final class Immu{
	final String name;
	final int salary;
	Immu(String a,int b){
		name=a;
		salary=b;
	}
	 String getname() {//------> getter Method
		return name;
	}
	public int getsalary() {
		return salary;
	}
	
}
public class Immutable0608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immu x1=new Immu("Namdev",10000);
		System.out.println(x1.getname());
//		String a=x1.getname();
//		System.out.println(a);
		System.out.println(x1.getsalary());
		Immu x2=new Immu("Dibyanshu",20000);
	}
}
