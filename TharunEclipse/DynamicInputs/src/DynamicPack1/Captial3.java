package DynamicPack1;

public class Captial3 {

	public static void main(String[] args) {
		
	String s1="tharun java core";
	
     String result="";
     String tharun="";
	
     
     String s3[]=s1.split("  ");
     
     for(int i=0;i<s3.length;i++) {
    	 
    	 result=s3[i];
    	 
    	 result=s3[i].substring(0, 1).toUpperCase();
    	 
    	 result=s3[i].substring(1);
    	 
    	 tharun+=s3[i];
    	 
     }
     System.out.println(tharun);
	
	
	
	
}
}