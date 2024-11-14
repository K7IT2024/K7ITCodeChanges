package devapackage;

public class Ravan extends Asura {

	void m1() {
		System.out.println("Ravan m1 non static  method");

	}

	static void m2() {
		System.out.println("Ravan m2 static method");

	}
	

	@Override
	public String toString() {
		return "Ravan []";
	}

	public static void main(String[] args) {
		Asura A = new Asura();
		A.m1();
		A.m2();
		Ravan R = new Ravan();
		R.m1();
		R.m2();
		Asura A1 = new Ravan();    //CO-RELATIONSHIP
		A1.m1();
		Asura.m2();  
		System.out.println(R);
		System.out.println(A);
		System.out.println(A1); 
		
		System.out.println(R);
		System.out.println(A);
		System.out.println(A1); 
	}
}
