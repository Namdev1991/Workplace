package systemclass;

public class UseofMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));
		System.setProperty("user.home","M:\\software");
		System.out.println(System.getProperty("user.home"));
		System.setProperty("user.country", "India");
		System.out.println(System.getProperty("user.country"));
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
	}
}
