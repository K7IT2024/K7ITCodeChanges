package DynamicPack1;

public class Person {
   
	Person()
	{
		super();
	}
	
	int age;
	String name;
	double height;
	double weight;
	
	Person(int age,String name,double height,double weight){
		
		this.age=age;
		this.name=name;
		this.height=height;
		this.weight=weight;
		
		
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	

}
