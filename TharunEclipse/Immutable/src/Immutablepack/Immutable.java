package Immutablepack;


public class Immutable {
	
	private int age;
	private String name;
	
	
	Immutable (int age,String name){
		this.age=age;
		this.name=name;
		
	}

	
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public static void main(String args[]) {
		
		Immutable i1 = new Immutable(10,"tharun");
		
		i1.setAge(10);
		i1.setName("Tharun");
		
		System.out.println(i1.getAge());	
		System.out.println(i1.getName());
		
		System.out.println(i1.age);	
		System.out.println(i1.name);	
		
		
		
		Immutable i2 = new Immutable(10,"tharun");
		System.out.println(i2.age);	
		System.out.println(i2.name);	
		
	}

}
	