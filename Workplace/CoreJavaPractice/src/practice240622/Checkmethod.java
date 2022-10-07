package practice240622;

public class Checkmethod {
	int data=50;
	void change(int data) {
		data=data+100;
		System.out.println("Data Value of Void Method "+data);
	}

	public static void main(String[] args) {
		Checkmethod x=new Checkmethod();
		System.out.println("Instance VAriable"+x.data);
		x.change(500);
		System.out.println("After Change"+x.data);

	}

}
