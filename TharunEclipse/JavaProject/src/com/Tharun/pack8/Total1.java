package com.Tharun.pack8;

  class Total{

	int age= 20;
	String name= "tharun";
	
	Total(){
		
		System.out.println("no args toatal");
	}
	
	Total(int age,String name){
		this.age=age;
		this.name=name;		
	}
	
	
	{
		System.out.println("IIB");
	}
	
    static{
		System.out.println("SIB");
	}
    
    static {
    	System.out.println("SIB 1");
    }
    
    
    {
    	System.out.println("deafult method");
    }
	
	void m1() {
		System.out.println("a-m1");
	}
	
	int add (int i ,int j) {
		return i+j;
	}
 }
	
	
	public class Total1 extends Total{
		
		Total1(int age,String name){
			this.age=age;
			this.name=name;
		}
		
		static {
			System.out.println("SIB 2");
		}
		
		
		public static void main(String args[]) {
			
			
			
	Total t = new Total();	
	t.m1();
	
	System.out.println(t.age);
	System.out.println(t.name);
			
	Total T = new Total(30,"tharun");	
	t.m1();
	
	System.out.println(T.age);
	System.out.println(T.name);
			
	
	
Total1 t1 = new Total1(90,"bali");
t1.m1();
System.out.println(t1.add(20, 90));

	
Total1 t2 = new Total1(30 ,"tharu");
t2.m1();
System.out.println(t2.add(2, 9));



System.out.println(t1.age);
System.out.println(t1.name);
	

System.out.println(t2.age);
System.out.println(t2.name);




 



}


}
	

