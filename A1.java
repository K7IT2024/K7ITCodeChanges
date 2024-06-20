class A1
{
	int i;
	String s;
	
   public static void main(String[] args)
   {
		A1 a1 = new A1();
		
		  a1.i = 20;
		  a1.s = "k7it";
		
		A1 a2 = new A1();
		
		  a2.i = 30;
		  a2.s = "java";
		  
		System.out.println(a1.i);
		System.out.println(a1.s);
		System.out.println(a2.i);
		System.out.println(a2.s);
		A1 a3 = new A1();
		System.out.println(a3.i);
		System.out.println(a3.s);
   }
}