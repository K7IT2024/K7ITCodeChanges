package JavaClasses;

interface X{
	int age=10;
	String name="Sai";
	void m1();
	}

 class Sai implements X {
	public void m1() {
		System.out.println("Sai-m1");
	}
	public static void main(String[] args) {
		Sai s=new Sai();
		s.m1();
		System.out.println(s.age);
		System.out.println(s.name);
		
	}

}
