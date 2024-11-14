package com.Babu;

 class Core {
	private int i=35;
	public void seti(int i) {
		this.i=i;
	}
	public int geti() {
		return i;
	}
	
}
class Core1{
	public static void main(String[] args) {
		Core c=new Core();
		System.out.println(c.geti());
		c.seti(354);
		System.out.println(c.geti());
	}
}