package exception;


public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[4];
		try {
			arr[5]=105/0;
		}catch(ArrayIndexOutOfBoundsException obj){
			System.out.println("ArrayindexOutof bound "+obj);
		}catch(ArithmeticException obj2) {
			System.out.println(obj2);
			//System.exit(0);
		}catch(Exception obj) {
			System.out.println(obj.getMessage());
		}
		finally {
			int i,j;
			//j=10/0;
			System.out.println(" This is Important Msg");
		}
	}

}
