package DynamicPack1;

public class Duplicate {
	
	
	public static void main(String[] args) {
		
	String s1="abcabcddf";
	String s2 ="";
	
  for(int i=0;i<s1.length();i++) {
	  
	String   s3 =""+s1.charAt(i);
	  
	if (s2.contains(s3)) {
		continue;
		
	}else {
		
		s2+=s3;
		
	}
	  
	//System.out.println(s2);
  }
	
		
  System.out.println(s2);
		
		
	}	
	

}