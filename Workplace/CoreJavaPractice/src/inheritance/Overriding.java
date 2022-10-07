package inheritance;
class One{
	void once() {
		System.out.println("once of Class 1st");
	}
	void twice(int num1) {
		this.once();
		System.out.println(" One Paramter Class 1st");
	}
}
class Two extends One{
	void once() {
		System.out.println(" once of Class Two ");
		
	}
	void twice(int num1) {
		super.twice(20);
		System.out.println(" twice Method");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two a1=new Two();
		a1.twice(25);
		a1.once();
	}

}
