package methodprograms;

public class Staticmethod3 {
static double interest(int p, int t,float r)
{
	double roi=(p+((p*r*t)/100));
	System.out.println("Principle Amout =  "+p);
	System.out.println("Interest rate =  "+r);
	System.out.println("Time Duration in years =  "+t);
	return roi;
}
	public static void main(String[] args) {
		interest(20000,5,14.0f);//Calling method with Return type
		
		double ref=interest(200000,4,12.0f);//Return value Saved in memory location 
	//	and then utilize in further or you can Print the value 
		
		System.out.println("Final Amount =  "+ref);
		double ref1=interest(350000,3,12.0f);
		System.out.println("Final Amount =  "+ref1);
		
		//Save in Variable and then Utilization 
		int a=200000; int b=5;float c=6.9f;
		double ref2=interest(a,b,c);
		System.out.println("Final Amount =  "+ref2);
		
			
	}

}
