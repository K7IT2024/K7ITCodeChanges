package Numbers;

public class Num1 {
	
	int i = 20000;
	
	void natruraloreven() {
		
		if(i%2==1){
			System.out.println("given is natural ");
			
		}else {
			System.out.println("not a natural");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Num1 n2 = new Num1();
		
		n2.natruraloreven();
	}

}
