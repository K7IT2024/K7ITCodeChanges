class B1
{
			  int i = 40;
	static String s = "abc";
			  
		public static void main(String hello[])
		{
			System.out.println(B1.s);
			System.out.println(B1.i);
			System.out.println(new B1().i);
			System.out.println(new B1().s);
			
			B b1 = new B();
			System.out.println(b1.i);
			System.out.println(b1.s);
			System.out.println(i);
			System.out.println(s);
		}
}