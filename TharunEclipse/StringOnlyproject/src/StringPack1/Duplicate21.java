package StringPack1;

public class Duplicate21 {
	
	public static void main(String[] args) {
		
	
	String s = "java love you java" ;
	
	String result = "";
	
	String [] s2=s.split("");
	
	for(int i=0;i<s2.length;i++) {
		
		if(!result.contains(s2[i])) {
			
		}else {
			result =""+s2;
		}
			
		//System.out.println(result);
		
		}
		
	System.out.println(result);
}
}
	
	
	


