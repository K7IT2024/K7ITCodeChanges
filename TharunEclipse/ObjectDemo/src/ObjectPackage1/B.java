package ObjectPackage1;

class A {

	

	public static void m1() {
		System.out.println("A satatic ");
	}
	
	void m2() {
		System.out.println("non static");
	}
}
	
	class B extends A{
		
		public static void m1() {
			System.out.println("B static  ");
		}
		
		void m2() {
			System.out.println("B - non static");
		}
		
		
		void m3() {
			System.out.println("B- m2 non static");
		}
		
		
		public static void main(String[] args) {
			
			A a1 = new A();
			a1.m1();
			a1.m2();
			
			
			B b1 = new B();
			b1.m1();
			b1.m2();
			
			
			// C0 relation_ships 
			
			A a8 = new B();
			a8.m1();
			a8.m2();
			((B) a8).m3();
			
			
			
			
//		B b4 = (B) a1;
//			b1.m1();
		}
		
		
	}


