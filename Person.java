package com.scanner;

public class Person {
String name;
int age;
double ht;
double wt;


public Person(String name, int age, double ht, double wt) {
	super();
	this.name = name;
	this.age = age;
	this.ht = ht;
	this.wt = wt;
}





@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", ht=" + ht + ", wt=" + wt + "]";
}


}
