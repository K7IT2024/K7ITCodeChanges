package com.Babu;

public interface Interface {
	public abstract void m1();
 public abstract void m2();
 public static void m3() {
	 System.out.println("this is the static method inside interface");
 }
 default void m4() {
	 System.out.println("this is the default method inside interface");
 }
 }
