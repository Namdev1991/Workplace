package encapsulation;
/*Encapsulation -Binding data and Code together in single class is known as ENcpasulation
Use of ENcapsulation is Hiding the sensitive data from User 
How to achieve -
Declare data(Variables as Private )
Provide get method- for read only members &
Provide set method- To reinitialize the variable
 */
class First{
	private  int empid=10;
	private final int Salary=50000;
	private First(){
		this.empid=20;
		System.out.println("Private Constructor = "+empid);
	}
	public First(int x) {
		this();
		this.empid=40;
		System.out.println(" Public Constructor "+empid);
	}
	void setOne(int empid) {
		this.empid=empid;
		int result=this.empid+empid;
		System.out.println("Result of Setter "+result);
	}
	int getone() {
		return empid;
	}
	public int getone1() {
		return Salary;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First x1=new First(10);
		x1.setOne(100);
		System.out.println(x1.getone());
		System.out.println(x1.getone1());
	}
}
