package devapackage;

interface Yogi {
	void rummy();

	static void bummy() {
		System.out.println("static");

	}

	default void yummy() {
		System.out.println("yippe");
	}

}

public class Nani implements Yogi {
	public void rummy() {
		System.out.println("dragon");
	}

	static void bummy() {
		System.out.println("original");

	}

	public static void main(String[] args) {
		Nani j = new Nani(); // using direct object
		j.rummy();
		Yogi.bummy(); // before implementing the static method inside subclass .
						// we can't access directly that static method with reference variable.
						// but after implementing we can access with obj reference variable.
		j.yummy();
		j.bummy(); // we can't access static methods inside interface
		new Nani().bummy(); // using referance variable directly without implement
		Nani.bummy(); // that method inside sub class.

		Yogi j1 = new Nani(); // using co-relationship by because we can't
								// create obj for Yogi by default it is a abstract type.
		j1.rummy();
		Yogi.bummy(); // we can't access static methods inside interface
						// using reference variable directly.
		j1.yummy();
		// j1.bummy();
	}

}
