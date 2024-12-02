package Org.Tharun;

public interface Animal {
	
    int age = 10;
    String name= "dog";
    
	void putLegs();
	void putTail();
	void putMask();

}


class Dog implements Animal{
	
	public void PutLegs() {
		
		System.out.println("put legs in dogs ");
	}
	
	
	public void putTail() {
		
		System.out.println("put tail for dog");
	}
	
	
      public void putMask() {
		
		System.out.println("put tail for dog");
	}


	@Override
	public void putLegs() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}