package com.K7it.pack1;

public interface Vehical1 {
	
	void fixEngine();
    void fixBreaks();
    void fixBody();
    void fixTyres();
    
}
    class Lorry implements Vehical1{

		
	public void fixEngine() {
		System.out.println("fixed Engine body");
		}
	
		
    public void fixBreaks() {
		System.out.println("fixed Engine body");
		}
	
    public void fixBody() {
		System.out.println("fixed Engine body");
		}
    
    public void fixTyres() {
		System.out.println("fixed Engine body");
		}
    
    
    public static void main(String[] args) {
		
    	Lorry l1 = new Lorry();
    	
    	l1.fixEngine();
    	l1.fixBody();
    	l1.fixBreaks();
    	l1.fixTyres();
    	
    	
    	
    	
    	
	}
    
	}
	
	
