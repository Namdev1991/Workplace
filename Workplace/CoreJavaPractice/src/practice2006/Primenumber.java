package practice2006;

public class Primenumber {
	static void prime(int num) {
		if (!(num == 0 || num == 1)) {
			for (int i = 2; i < num; i++) {
				int count = 0;
				for (int j = i; j >= 1; j--) {
					if (i % j == 0) {
						++count;
					}
				}
				if (count == 2) {
					System.out.println("Prime Number: " + i);
				}
			}
		}else {
			System.out.println("Either the given number is 0/1, so won't it consider for prime number");
		}
	}

		
	public static void main(String[] args) {
		prime(50);

	}

}
