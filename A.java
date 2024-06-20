public class A {
	void m1()
	{
		System.out.println("m1");
		m2();
	}
	
	void m2()
	{
		System.out.println("m2 ");
		m1();
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		a1.m1();
		
	}

}
