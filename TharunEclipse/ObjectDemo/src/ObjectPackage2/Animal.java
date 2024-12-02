package ObjectPackage2;

import java.util.Objects;

public class Animal   {

	Animal() {

	}

	int age;
	String name;
	double height;
	double weight;
     
	Animal(int age, String name, double height, double weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
}
	
	
	

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";	}

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
		Animal other = (Animal) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
