package forloops;

public class Number {
	void check() {
	for(int a=1;a<=10000;a++) {
		if(a%2==0) {
		System.out.println(a);
		}
	}
	}
	public static void main(String[] args) {
		Number x=new Number();
		x.check();
	}

}
