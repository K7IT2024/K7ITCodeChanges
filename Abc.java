package JavaClasses;


class Reddya{
	void Babu() {
		 System.out.println("1st method inside class");
	 }
	 static void Reddys() {
		 System.out.println("static method inside this class");
	 }

}
public class Abc extends Reddya {
	void Babu() {
		System.out.println("overriding the super class method inside sub class");
	}
	
	public static void main(String[] args) {
		Abc ab=new Abc();
		ab.Babu();
		Abc.Reddys();
	}
	
	 
}
