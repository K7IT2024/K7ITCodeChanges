package devapackage;

public class Rocky {
	int age;
	String name;
	double ht;
	double wt;
	int k;

	public static void main(String[] args) {
		Rocky t = new Rocky(89.0, 12);
		// System.out.println(t.age);
		// System.out.println(t.name);
		// System.out.println(t.ht);
		// System.out.println(t.wt);
		System.out.println(t);
		// System.out.println(t);

	}

	public Rocky(double wt, int k) {
		this.wt = wt;
		this.k = k;

	}

	@Override
	public String toString() {
		return "Rocky [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + ", k=" + k + "]";
	}

}
