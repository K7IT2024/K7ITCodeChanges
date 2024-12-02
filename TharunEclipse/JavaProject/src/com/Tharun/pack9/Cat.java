package com.Tharun.pack9;

 class Animal {

	void sound() {
		System.out.println("animal sound");
	}
 }
	class Dog extends Animal {

		void sound() {
			System.out.println("dogs barks");
		}

	}

 class Cat extends Animal {

		void sound() {
			System.out.println("cat mewoms");
		}

		public static void main(String[] args) {

			Animal a = new Animal();
			a.sound();
			
			Cat c1 = new Cat();
			c1.sound();
			
			
			Dog d1 = new Dog();
			
			d1.sound();
			
			
			Animal a1= new Cat();
			a1.sound();
}
	
	}

