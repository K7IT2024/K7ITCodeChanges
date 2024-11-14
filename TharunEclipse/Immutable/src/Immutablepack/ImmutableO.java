package Immutablepack;

public final class ImmutableO {
	
	private int age;
	private String name;
	private double height;
	private double weight;
	
//	ImmutableO(){
//		}

	public ImmutableO(int age, String name, double height, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	
	
	
	
	@Override
	public String toString() {
		return "ImmutableO [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}





	public static void main(String[] args) {
		
		
		ImmutableO i1 = new ImmutableO(13,"java",8.0,80.00);
		
		System.out.println(i1);
		
		 i1 = new ImmutableO(12,"core",7.0,60.00);
		 System.out.println(i1);
		 
		 
		 String s1 = "abc";
		
		 System.out.println(s1);
	}
	
	

}
