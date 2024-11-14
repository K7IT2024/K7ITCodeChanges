package ObjectPackage2;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		
	Animal a1 = new Animal();
	System.out.println(a1);	
	
	
	Animal a2 = new Animal(30,"tharun",7.0,80.00);
	System.out.println(a2);	
	
	
	Animal a3 = new Animal(30,"tharun",7.0,80.00);
	System.out.println(a3);	
	System.out.println(a3.hashCode());
	
	System.out.println(a2.equals(a2));
	System.out.println(a3.equals(a2));
	
	System.out.println(a3.hashCode());
	
	}

}
