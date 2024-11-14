package com.actualjava;

public class Immutable {

	private String name;
	private String colour;
	
	Immutable(String name,String colour){
		this.colour=colour;
		this.name=name;
	}
	Immutable(){
		
	}
	@Override
	public String toString() {
		return "Immutable [name=" + name + ", colour=" + colour + "]";
	}
	public static void main(String[] args) {
		Immutable i=new Immutable("Babu","dark");
		String s3=new String("Babu avuluri");
		String name="Babureddy";
		String colour="White";
		String s1="Babureddy";
		       s1="Reddy";
		       String s5="saitharun";
		     String  s2=new String("Sai");
		     String s4=new String("Sai");
		     s2=new String("Prasad");
		System.out.println(i);
		System.out.println(name.equals(colour));
		System.out.println(name.hashCode()==colour.hashCode());
		System.out.println(name.hashCode());
		System.out.println(colour.hashCode());
		System.out.println(name);
		System.out.println(colour);
		System.out.println(s2.equals(s4));
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s2==s4);
		System.out.println(s2);
	}
}
