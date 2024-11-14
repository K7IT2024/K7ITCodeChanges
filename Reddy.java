package JavaClasses;

class Babu {
	int age;
	String name;
	double ht;
	double wt;

	void m1() {
		System.out.println("Babu-m1");
	}

	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}

}

class Reddy extends Babu {
	public static void main(String[] args) {
		Reddy r = new Reddy();
		System.out.println(r.age);
		System.out.println(r.name);
		System.out.println(r.ht);
		System.out.println(r.wt);
		Babu b1 = new Babu();
		b1.age = 35;
		System.out.println("Babu:" + b1);
		System.out.println("Reddy:" + r);
	}
}
