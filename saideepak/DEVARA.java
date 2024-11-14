package Rockpackage;

public enum DEVARA {
	sunday,monday(9), tuesday("SAI"),wednesday(80.0),thursday,friday,saturday;
	
	DEVARA(){
		System.out.println("ADUKKO");
	}
	 
	DEVARA( int Y){
		System.out.println(Y);
	}
	
	DEVARA( String Y){
		System.out.println(Y);
	}
	
	DEVARA( double y){
		System.out.println("y");
	}
	
	{
		System.out.println("IIB");
	}
	static {
		System.out.println("SIB");
	}
	
	
	public static void main(String[] args) {
		DEVARA G = DEVARA.tuesday;
		System.out.println(G);
		DEVARA H = DEVARA.sunday; 
		 System.out.println(H);
		 
	}
}
