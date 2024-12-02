package WrapperPack1;

public class WrapperDemo {
	public static void main(String[] args) {

		int i = 10;

		// Integer i1 = new Integer(i);

		Integer i2 = new Integer(10);

		// Integer i3 = Integer valueof(i);

		String s1 = "10";

		Integer i5 = new Integer("10");

		Integer i6 = new Integer(s1);

		int k = 89;

		Integer k1 = Integer.valueOf(k);
		Integer k2 = Integer.valueOf(89);
		Integer k3 = Integer.valueOf("89");
		
		
		short h = 900;
		
		Short h1 = Short.valueOf(h);
		Short h2 = Short.valueOf((short) 100);
		
		System.out.println(h2);
		
		System.out.println(k1);

		System.out.println(k2);
		System.out.println(k3);

		System.out.println(i);
		System.out.println(10);

		System.out.println(s1);
		System.out.println(i5);
	}
}