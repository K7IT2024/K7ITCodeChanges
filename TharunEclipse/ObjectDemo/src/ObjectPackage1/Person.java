package ObjectPackage1;

public class Person {
	
	Person(){
		
	}
	
	int age;
	String name;
	double ht;
	double wt;
	public Person(int age, String name, double ht, double wt) {
		super();
		this.age = age;
		this.name = name;
		this.ht = ht;
		this.wt = wt;
	}
//	@Override
//	public String toString() {
//		return "Person [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
//	}
	
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
}

}
