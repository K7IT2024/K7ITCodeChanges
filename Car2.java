package JavaClasses;

public final class Car2 implements Vehicle1 {
	int age=29;
	int wheels=4;
	String name="car";
	
	public void fixEngine() {
		System.out.println("fixing the engine for Car");
	}	
	public void fixBreaks() {
		System.out.println("fixing the breaks for Car");
	}
	public void fixWheels() {
		System.out.println("fixing the wheels for Car"); 
	}
	public void fixBody() {
		System.out.println("fixing the body for Car");
	}
	public void fixColour() {
		System.out.println("coated red colour for my Car");
	}
	
	public static void main(String[] args) {
		
		Car2 c2=new Car2();
		c2.fixBody();
		c2.fixBreaks();
		c2.fixColour();
		c2.fixEngine();
		c2.fixWheels();
		System.out.println(c2.age);
		System.out.println(c2.wheels);
		System.out.println(c2.name);
	}


}
