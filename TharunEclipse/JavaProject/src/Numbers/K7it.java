package Numbers;

public class K7it {
	
	private static  K7it k;
	
	private K7it() {
		
	}
	
	
	public static K7it Add() {
		if(k==null) {
			k=new K7it();
			return k;
		}else {
				return k;
			}
			
			
		}
	
	
	public static void main(String[] args) {
		
		System.out.println(k);
		System.out.println(k);
		
		System.out.println(K7it.Add());
		System.out.println(k);
		System.out.println(k);
	}
	
		
	}
	


