package WrapperPack1;

public class UnBoxing {

	public static void main(String[] args) {
		
		//auto un boxing 
		Integer i1 = new Integer(10);
		
		int i = i1.intValue();
		
		//string to primitive
		
		String s1 = "100";
				
		int i2 = Integer.parseInt(s1);
		
		//string to wrapper 
		
		String s2 = "121";
		
		Float f1 = Float.valueOf(s2);
		
		//wrapper to String 
		Byte b = new Byte("10");
		
		String strByte = b.toString();
		
		
		
		//primitive to string
		
		int i8 =70;
		
		Integer r = new Integer(i8);
		
		String str2 = r.toString();
		
		
		
		//use empty 
		
		
		int i7 = 20;
		
		String str4 = ""+i7();
		
		
		
		

  //base decimal
		
		Integer decimal = Integer.valueOf(10);
		
		
		System.out.println(decimal.toBinaryString(decimal));
		
		
		
		
		
		
		
		System.out.println(s1);
		
		System.out.println(str2);
		System.out.println(b);
		
		System.out.println(f1);
		System.out.println(s1);
		
		
		
		System.out.println(i1);
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
	}

	private static String i7() {
		// TODO Auto-generated method stub
		return null;
	}
}
