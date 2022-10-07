package string;
final class Imm{  
	final String name;
	final int salary;
	Imm(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
}
public class Immutable0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imm x=new Imm("Namdev",200000);
		System.out.println(x.getName());
		System.out.println(x.salary);
	}

}
/*Steps to follow for Creating Immutable Class
 * 1) Declare class and Variable as final
 * 2) Add constructor and initialize final variable in constructor
 * 3) and use get method to get the values of final variable
 */
