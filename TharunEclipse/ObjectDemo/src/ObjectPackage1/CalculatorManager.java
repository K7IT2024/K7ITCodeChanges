package ObjectPackage1;

public class CalculatorManager {
	
	
	
	public static void main(String[] args) {
		
		
		Calculator c = new Calculator();
		
		System.out.println(c);
		
		
		Calculator c1 = new Calculator(20,"k7it",90.0,90.00);
		
		System.out.println(c1);
		
		
System.out.println(c1.hashCode());
	
		
		System.out.println(c1.equals(c1));
		

		
		
Calculator c2 = new Calculator(2,"k",9.0,80.00);
		
		System.out.println(c2);
		
		
Calculator c3 = new Calculator(2,"k",9.0,80.00);
		
		System.out.println(c3.hashCode());
	
		
		System.out.println(c3.equals(c3));
		
		
		System.out.println(c3);
		
		
	}

}