abstract class ManikvelRayan{
	int i= 10;
abstract void m1();
}
class KarthivaRayan extends ManikvelRayan {
	int j= 20;
	void m2(){
	System .out.println("Rayan");	
	}
	void m1(){
	System .out.println("Rayan");		
	}
}
class Rowdy extends KarthivaRayan{
	void m1(){
	System .out.println("Rowdyism");
	}
	
	public static void main (String args[]){
		//ManikvelRayan s = new ManikvelRayan();
		//System .out.println(s.i);	
		
		KarthivaRayan g = new KarthivaRayan();
		g.m1();
		g.m2();
		System .out.println(g.j);
        System .out.println(g.i);	

          KarthivaRayan g1 = new KarthivaRayan();     
              g1.m1();

        KarthivaRayan g2 = new Rowdy();
              g2.m1();
			 

	}	
	}
	
	
	
	
	
	
 