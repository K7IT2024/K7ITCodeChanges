package JavaClasses;

interface A{
	void m1();
	default void m2() {
		System.out.println("sai the kingmaker");
	}
	static void m3() {
		System.out.println("babureddy");
	}
	void m4();
	
}

public class B implements A {
	
	
	public void m1() {
		System.out.println("implementation m1 method come from interface A");
	}
	public void m4() {
		System.out.println("implementing m2 method come from interface A");
	}
	public static void main(String[] args) {
	
		A a1=new B();
		a1.m1();
		a1.m2();
		A.m3();
		a1.m4();
		B b1=new B();
		b1.m1();
		b1.m2();
		A.m3();
		b1.m4();
		
	
	}

}
