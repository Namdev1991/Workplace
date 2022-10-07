package objectclass;
class Two{
	int a=20;
		public boolean equals(Object obj) { //Object Obj=a2=New Practice1();
			Two x2=(Two)obj;
			return (this.a==x2.a);
		}
}

public class Practice1 extends Two {
	static void method() {
		System.out.println(" This is static method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1 a1=new Practice1();
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		Practice1 a2=new Practice1();
		System.out.println(a2);
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
	}
}
