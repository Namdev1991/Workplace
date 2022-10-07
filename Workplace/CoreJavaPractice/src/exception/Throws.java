package exception;
class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}

public class Throws {
	public  void validateAge(int age) throws UserDefinedException{
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new UserDefinedException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
