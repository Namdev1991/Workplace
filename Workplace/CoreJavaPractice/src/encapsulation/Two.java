package encapsulation;
class One{
	private int empid;
	private int salary;
	private One() {
		System.out.println(" This is Private Constructor");
	}
	public int getmethod() {
		return empid;
	}
	public int getmethod1() {
		return salary;
	}
	public One(int num) {
		this();
		System.out.println("This is Public Constructor");
	}
	public void setmethod(int empid) {
		this.empid=empid;
		System.out.println(this.empid);
	}
	public void setmethod1(int salary) {
		this.salary=salary;
		System.out.println(this.salary);
	}
}

public class Two {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One x1=new One(20);
		System.out.println(x1.getmethod());
		System.out.println(x1.getmethod1());
		x1.setmethod(20);
		x1.setmethod1(50);
	}
}
