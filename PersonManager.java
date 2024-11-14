package com.actualjava;

public class PersonManager {
	public static void main(String[] args) {
		Person person=new Person(25,"Reddi",5.5,60.54);
		System.out.println(person);
		person=new Person(26,"Reddikumari",5.4,65.67);
		System.out.println(person);
		Person person1=new Person(30,"babureddy",5.6,70.25);
		System.out.println(person1);
		Person person2=person;
		System.out.println(person2);
		System.out.println(person.equals(person2));
		System.out.println(person.hashCode()==person2.hashCode());
		
	}

}
