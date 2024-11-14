package Numbers;

public class Single {
	
	private static Single s2;
	
	private Single() {
		
	}
   
	public static  Single Y() {
		
		if(s2==null) {
			s2= new Single();
				return s2;
				
		}else {
			return s2;
		}
			
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(s2);
		System.out.println(Single.Y());
		System.out.println(s2);
	}
	
	
}
