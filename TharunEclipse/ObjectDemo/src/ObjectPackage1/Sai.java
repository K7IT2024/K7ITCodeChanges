package ObjectPackage1;

class Tharun {
	
	
	public static void m1() {
		System.out.println("Static T");
	}
	

	public static void m2() {
		System.out.println("static H");
	}
	

	
	
	
}
	
	
public class Sai extends Tharun{
	
	
	public static void m1() {
		System.out.println("T");
	}
	

	public static void m2() {
		System.out.println("static sai  H");
	}
	
	
	public  void m3() {
		System.out.println("static sai  l");
	}

	
	public static void main(String[] args) {
		
		Sai t1 = new Sai();
		t1.m1();
		t1.m2();
		
		
		
		Tharun t2 = new Tharun();
		t2.m1();
		t1.m2();
		
		
		
		
		Tharun t4 = new Sai();
		t4.m1();
		
		
		Tharun t5 = new Sai();
		//t5.m3();
		
		
		Sai s6 = (Sai) t5;
		s6.m1();
		
	}
	
	
	
	}
