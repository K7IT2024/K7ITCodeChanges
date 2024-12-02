package String.com;

public class ImmuString {
	
	private String name;
	
		public ImmuString (String name) {
		
		this.name=name;
		
	}
	
		
	
//	public String toString() {
//		
//		return this.name;
//		
//	}
//	
	
	@Override
		public String toString() {
			return "ImmuString [name=" + name + "]";
		}



	public static void main(String[] args) {
		ImmuString i1 = new ImmuString("tharun");
		
		System.out.println(i1);
		
		
		i1 = new ImmuString("java");
		System.out.println(i1);
	}
	

}
