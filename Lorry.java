package JavaClasses;

public class Lorry implements Vehicle1 {

	public void fixEngine() {
		System.out.println("fixing the engine for lorry");
	}

	public void fixBreaks() {
		System.out.println("fixing the breaks for lorry");
	}

	public void fixWheels() {
		System.out.println("fixing the wheels for lorry");
	}

	public void fixBody() {
		System.out.println("fixing the body for lorry");
	}

	public void fixColour() {
		System.out.println("coated red colour for my lorry");
	}

	public static void main(String[] args) {
		Lorry l1 = new Lorry();
		System.out.println("printing the lorry details");
		l1.fixEngine();
		l1.fixBreaks();
		l1.fixWheels();
		l1.fixBody();
		l1.fixColour();
	}
}
