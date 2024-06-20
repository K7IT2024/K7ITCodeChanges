interface X
{
	void m1();
}

interface Y
{
	void m2();
}

class A
{
	public void m1()
	{
		System.out.println("A-m1");
	}
	public void m2()
	{
		System.out.println("A-m2");
	}
}

class B
{
	public void m2()
	{
		System.out.println("B-m2");	
	}
}

class C
{
	public static void m1()
	{
		System.out.println("C-m2");
	}
}

class P implements X
{
	
}

class Q extends A implements X,Y
{
	
}

class R extends B implements X,Y
{
	
}

class S extends C implements Y
{
	public void m1()
	{
		System.out.println("S-m1");
	}
}

abstract class T extends A implements Y,X
{
	
}

class U implements X,Y extends A
{
	
}

abstract class V implements Y extends A,B
{
	
}

class H extends B,C implements X,Y
{
	
}