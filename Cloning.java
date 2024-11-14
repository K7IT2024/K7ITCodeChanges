package com.actualjava;

import java.util.Objects;
public class Cloning extends Object implements Cloneable {
	int age;
	String name;
	double ht;
	double wt;
	//Person person;
	
	Cloning(){
		
	}
	Cloning(int age,String name){
		this.age=age;
		this.name=name;
		//this.person=person;
	}
	
	private Cloning getClone() throws CloneNotSupportedException {
		Cloning c=(Cloning)this.clone();
		return c;
		}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, ht, name, wt);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cloning other = (Cloning) obj;
		return age == other.age && Double.doubleToLongBits(ht) == Double.doubleToLongBits(other.ht)
				&& Objects.equals(name, other.name) && Double.doubleToLongBits(wt) == Double.doubleToLongBits(other.wt);
	}



	@Override
	public String toString() {
		return "Cloning [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}


	public static void main(String[] args) throws CloneNotSupportedException{
		Cloning cl=new Cloning();
		cl.age=10;
		cl.ht=5.6;
		cl.name="java";
		cl.wt=70.0;
		Cloning cldup=(Cloning) cl.getClone();
		//cldup.age=22;
		System.out.println(cl.age);
		System.out.println(cldup.age);
		System.out.println(cl);
		System.out.println(cldup);
		System.out.println(cl.equals(cldup));
		System.out.println(cl.hashCode()==cldup.hashCode());
		
//		Person p=new Person();
//		p.age=25;
//		p.ht=5.7; 
//		p.name="Clone";
//		p.wt=56.76;
//		System.out.println(p);
//		System.out.println(p.age);
//		System.out.println(p.ht);
//		Person p2=p.getClone();
//		System.out.println(p2.age);
//		Cloning c1=new Cloning(25,"Babu",p);
//		System.out.println(c1);
//		
		
	}

}
