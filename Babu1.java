package JavaClasses;

class Reddy1{
	int age=15;
	void m1() {
		System.out.println("Reddy1-m1");
	}


}

class Babu1 extends Reddy1{
	void m1() {
		System.out.println("Babu1-m1");
	}

	public static void main(String[] args) {
		Babu1 b1=new Babu1();
		Reddy1 r1=new Reddy1();
		b1.m1();
		r1.m1();
		System.out.println(b1.age); 
		System.out.println(r1.age);
		
		
	}
}

