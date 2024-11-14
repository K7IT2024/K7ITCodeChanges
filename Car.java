package JavaClasses;


	class Car implements Vehicle{
		public void Release() {
			System.out.println("manufactured car releasing in the market");
		}
	public void Manufauturing() {
	  System.out.println("manufacturing the car");
		}
		
		
		public static void main(String[] args) {
			Car c1=new Car();
			c1.Manufauturing();
			c1.Release();
			System.out.println(c1.age);
			System.out.println(c1.name);
		}

		
	}

