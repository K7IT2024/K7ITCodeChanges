package Org.Tharun;

public interface Ab {
	public static void m1() {
		System.out.println("Ab-m1");
	}
	public  static void m2() {
		System.out.println("Ab-m2");
	}

	public static void main(String[] args) {
		Ab.m1();
		Ab.m2();
	}
}
