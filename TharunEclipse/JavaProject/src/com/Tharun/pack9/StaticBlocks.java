package com.Tharun.pack9;

public class StaticBlocks {
	
    static int y ;
	
   static {
	   y = 90;
	   System.out.println("static blocks y ="+y);
	   
   } 
   
   {
   System.out.println("11B");
   
	   
   }
   
   public static void main(String[] args) {
	

    
    StaticBlocks s1 = new StaticBlocks();
    
    StaticBlocks s2 = new StaticBlocks();

    StaticBlocks s3 = new StaticBlocks();
}
}