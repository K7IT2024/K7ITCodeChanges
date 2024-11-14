package com.Babu;

import java.util.Objects;

public class Equals {
	int age;
	String name;
	int legs;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, legs, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals other = (Equals) obj;
		return age == other.age && legs == other.legs && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		Equals eq=new Equals();
		Equals eq1=new Equals ();
		eq.age=23;
		eq.name="Babu";
		eq.legs=2;
		eq1.age=23;
		eq1.legs=2;
		eq1.name="Babu";
		
		System.out.println(eq.equals(eq1));
		System.out.println(eq.hashCode()==eq1.hashCode());
	}

}
