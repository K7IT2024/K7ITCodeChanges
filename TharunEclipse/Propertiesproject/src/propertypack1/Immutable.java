package propertypack1;

public final class Immutable {

	Immutable(){
		
	}
	
	
	
	private int age;
	private String name;
	private double height ;
	private double weight ;
	public Immutable(int age, String name, double height, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Immutable [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}





	public static void main(String[] args) {
		
		Immutable i = new Immutable(20,"tharun",6.0,50.0);
		
		i=new Immutable(8,"java",8.0,90.0);
		i.age=25;
		i.name="kishore";
		
		System.out.println(i);
		System.out.println(i);
	}
	
	
	
	
}
