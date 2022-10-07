package string;
final class Test{
	final String name;
	final int salary;
	Test(String nam,int num){
		name=nam;
		salary=num;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	int method1() {
		int x=salary+10;
		System.out.println(" method 1 of test class");
		return x;
	}
	
}
public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test x1=new Test("Namdev",30000);
		System.out.println(x1.getName());
		System.out.println(x1.salary);
		System.out.println(x1.method1());
		Test x2=new Test("x1",4000);
	}

}

/*Immutable-We cannot change value of its object
 *  to Create Immutable class Follow 3 steps
 *  1) Declare data and Class as final
 *  2) Constructor should be parameterised and should be initialised value of final variable
 *  3) only getter method can be write 
 * 
 */

