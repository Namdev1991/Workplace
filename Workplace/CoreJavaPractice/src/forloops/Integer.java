package forloops;

public class Integer {

	static void integer(int num) {
		int count=0;
		for (;num!=0;count++) {
			num=num/10;
		}
		System.out.println("The count of integer"+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
integer(1236);
	}

}