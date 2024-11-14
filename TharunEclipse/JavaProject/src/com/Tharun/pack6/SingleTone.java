package com.Tharun.pack6;

public class SingleTone {
		   
	
		private static SingleTone s1;
		   
		   private SingleTone(){
		   
		   }
		   
		 
		   public  static SingleTone  getInstance(){
			   
		      if(s1 == null ){
			      s1 = new SingleTone();
				  return s1;
			  }else{
			    return s1;
			  }
		     
		   
		}  
		   public static void main(String[] args) {
			System.out.println(s1);
			System.out.println(SingleTone.getInstance());
		System.out.println(s1);
		System.out.println(SingleTone.getInstance());
		System.out.println(s1);
		
		
		
		}
		   
		   
		   
			}
		   
	

		   

