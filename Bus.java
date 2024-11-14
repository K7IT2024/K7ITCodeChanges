package JavaClasses;

public final class Bus {
	{
		System.out.println("manufacturing bus with the functions which are come from vehicle class");
	}
	String name="Vlovo bus";
	 Bus(String name){
		 this.name=name;
	 }
	 Bus(){
		 System.out.println("crreating a bus with default values");
	 }
	public void fixEngine() {
		System.out.println("iam fixing the engine for bus");
	}
	 void fixBreaks() {
		 System.out.println("fixing the breaks for the bus");
	 }
	 void fixWheels() {
		 System.out.println("fixing the wheels for the bus");
	 }
	 void fixBody() { 
		 System.out.println("fixing the body for the bus");
	 }
	
	 void fixColour() {
		 System.out.println("coating my favourite colour blue or black ");
	 }
	 
	 public static void main(String[] args) {
		 
		 String name="luxury bus";
		 int busPrice=2500000;
		 System.out.println("bus manufacturing started");
		Bus b1=new Bus();
		Bus b2=new Bus("sleeper");
		b1.fixBody();
		b1.fixBreaks();
		b1.fixColour();
		b1.fixEngine();
		b1.fixWheels();
		System.out.println("mnaufacturing completed");
		System.out.println(name);
		System.out.println(busPrice);
		System.out.println(b1.name);
		b2.fixBody();
		b2.fixBreaks();
		b2.fixColour();
		b2.fixEngine();
		b2.fixWheels();
		
	}

}
