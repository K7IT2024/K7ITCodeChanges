package JavaPackage;

public class Java {
	
	int age;
	String name;
	double height;
	double weight;
	
	Java(int age,String name,double height,double weight){
		this.age=age;
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
	
	public String toString() {
	return  "[Age:"+age+",Name:"+name+",Height:"+height+",Weight:"+weight+";]"
		
	}
	
	
	
	void m1() {
		System.out.println("m1");
	}
	
	void m2() {
		System.out.println("m2");
	}
	
	
	
	
	public static void main(String[] args) {
		Java java = new Java(20,"tharun",7.0,67.00);
		
	java.m1();
	java.m2();
		
	
	System.out.println(java);
	}
	
	
	

}
