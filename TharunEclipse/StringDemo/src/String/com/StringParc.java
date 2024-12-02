package String.com;

public final class StringParc {
	
		private int age;
		private String name;
		
	
	
	
	public StringParc(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}


	
	@Override
	public String toString() {
		return "StringParc [age=" + this.age + ", name=" +this. name + "]";
	}

	public static void main(String[] args) {
		
		StringParc s1 = new StringParc(30,"tharun");
		
		System.out.println(s1);
		
		s1 = new StringParc(20,"java");
		System.out.println(s1);
		
	}
	

}
