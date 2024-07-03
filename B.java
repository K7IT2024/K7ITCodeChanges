class B{
	 
	    void m1(){
		System.out.println("m1 started");
		  m2();
		  System.out.println("m1 end");
		}
		void m2(){
		System.out.println("m2 started");
		  m1();
		  System.out.println("m2 end");
		}
		public static  void main(String args[]){
		  B a1 = new  B();
		  a1.m1();
		}
	 }	 