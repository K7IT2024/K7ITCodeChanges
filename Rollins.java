package devapackage;

public class Rollins extends Seth{
	
	
	
	public Rollins(int i, String r) {
		this.age =i;
		this. name = r;
	}

	public Rollins() {
		
	}

	@Override
	public String toString() {
		return "Rollins [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}

	public static void main(String[] args) {
		
		Seth s = new Seth();
		System.out.println(s);
		Rollins r = new Rollins();
				System.out.println(r);
				Rollins r1= new Rollins(15,"tharun");
						System.out.println(r1);  
		
		
	}  

}
