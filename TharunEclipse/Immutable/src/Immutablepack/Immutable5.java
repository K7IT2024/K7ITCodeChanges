package Immutablepack;

public class Immutable5 {

	private int age;
	private String name;
	private double height;
	private double weight;

	Immutable5(){
		}

	public Immutable5(int age, String name, double height, double weight) {
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

	Immutable5 i4 = new Immutable5(20, "k", 8.0, 90.00);
	
		 i4 = new Immutable5(20,"i",7.0,90.00);
		
		
	}
		
}
