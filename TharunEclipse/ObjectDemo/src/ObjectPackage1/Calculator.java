package ObjectPackage1;

import java.util.Objects;

public class Calculator {
	
	@Override
	public int hashCode() {
		return Objects.hash(age, height, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculator other = (Calculator) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}


	int age=30;
	String name="java";
	double height =9.0;
	double weight=30.00;
	
	
	public Calculator(){
		super();
	}
	
	public Calculator(int age,String name,double height,double weight) {
		
		super();
		this.age= age;
		this.name= name;
		this.height=height;
		this.weight=weight;
	}
	
	
//	@Override
//	public String toString() {
//		return "Calculator [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
//	}
	
	
	@Override
	public String toString(){
		return "Calculator[age="+age+",name="+name+",height="+height+",weight="+weight+"]";
		
		
	}

}
