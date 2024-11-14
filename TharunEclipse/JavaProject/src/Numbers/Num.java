package Numbers;

public class Num {

	int i = 20;

	void evenorodd() {

		if (i % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}

	}

	public static void main(String[] args) {

		Num n = new Num();
		n.evenorodd();
	}
}
