package collection;

public class Garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
				Garbage g1=new Garbage();
				System.out.println("Object representation of GC: "+g1);
				System.out.println("Address of GC: "+g1.hashCode());
				g1=null;
				System.gc();
			}
			@Override
			protected void finalize() {
				System.out.println("Hi, I am finalize method..");
			}
	}


