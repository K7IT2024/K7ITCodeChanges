package devapackage;

public class Devanthagan {
	private static Devanthagan ram;
	private Devanthagan() {
		
	}
	public static  Devanthagan ravan() {
		if(ram ==null) {
		ram = new Devanthagan();
		return ram;
		}
		return ram;
	}
	public static void main(String[] args) {
		System.out.println(ram); 
		System.out.println(Devanthagan.ravan());
		System.out.println(ram);
		Devanthagan i = new Devanthagan();
		System.out.println(i);
		System.out.println(i.ravan()); 
		System.out.println(ram);
	} 

}
