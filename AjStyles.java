package Rockpackage;

public class AjStyles {
	int age = 10;

	void m1() {
		int age = 12;
		AjStyles N = new AjStyles();
		System.out.println("m1 method rules");
	}

	int k = 12;
	AjStyles N = new AjStyles();

	{
		int k = 10;
		AjStyles N = new AjStyles();
		System.out.println("IIB ");
		m1();
		
		
	}
	

}
