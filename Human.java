class Human
{
		int age;
	String name;
	
	Human(int age,String name)
	{
		 this.age = age;
		this.name = name;
	}
	
	public String toString()
	{
		return "Name:" + this.name  +  "Age:"	 + this.age;
	}
	
	public boolean equals(Object obj)
	{
	
		Human h = (Human) obj;
		
		return this.age == h.age && this.name == h.name;
	}
}



class M
{
	public static void main(String args[])
	{
		Human h1 = new Human(27,"k7it");
		Human h2 = new Human(25,"java");
		Human h3 = h1;
		Human h4 = new Human(27,"k7it");
		
		System.out.println( h1.equals( h2 ) );
		System.out.println( h2.equals( h3 ) );
		System.out.println( h3.equals( h4 ) );
		System.out.println( h3.equals( h1 ) );
		System.out.println( h1.equals( h4 ) );
	}
}