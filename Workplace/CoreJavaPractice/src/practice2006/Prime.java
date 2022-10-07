package practice2006;

public class Prime {
static void prim(int num) {
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
			if(count==2) {
				System.out.println("The Prime Number = "+num);
			}else {
		System.out.println("The NON Prime"+num);
	}
}
	
	public static void main(String[] args) {
		prim(50);

	}

}
