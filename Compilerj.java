package com.Babu;

 abstract class Compiler {
	{
		System.out.println("printing IIB for every object creation");
	}
	static {
		System.out.println("printing SIB for class only one time");
	}
	static int legs;
	int age=35;
	String name;
	double ht=5.6;
	double wt=70.6;
	public void m1() {
		System.out.println("m1 method inside class java");
	}
	int m2() {
		System.out.println("feg");
		return 3245;
	}
	double getRunRate() {
		return(ht*wt)/age;
	}
	public static int add(int i,int j) {
		return i+j;
	}
	abstract void m3();
	
	
}
abstract class Jre extends Compiler{
	String name="Babureddy";
	abstract void m3();
}
class Compilerj extends Jre {
	
	void m3() {
		System.out.println("overriding m3 method which is come from java class");
	}
	public void m4() {
		System.out.println("this is specific to Compiler method");
	}
	Compilerj(){
		System.out.println("Compiler no arg constructor");
	}
	Compilerj(int age,String name){
		this.age=age;
		this.name=name;
		System.out.println("creating int and string type constructor ");
	}
	public static void main(String[] args) {
		Compilerj c=new Compilerj();
		Compilerj c1=new Compilerj(25,"babu");
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.m2());
		System.out.println(c.getRunRate());
		System.out.println(c.add(43,45));
		
	}
}

