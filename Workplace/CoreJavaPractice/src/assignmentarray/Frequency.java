package assignmentarray;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		 int size=ref.nextInt();
		int[] number=new int[size];
		for(int i=0;i<number.length;i++) {
			System.out.println("Enter Value of Array Element ");
			number[i]=ref.nextInt();
		}
		int[] freq=new int[number.length];
		int visited=-1;
		for(int i=0;i<number.length;i++) {
			int count=1;
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!= visited) {
				System.out.println(number[i]+" : "+freq[i]);
			}
		}

	}

}
