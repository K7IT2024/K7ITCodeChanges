package devapackage;

public class SingleToneClass {
	private static SingleToneClass k;
	private SingleToneClass() {
		
	}
	public static SingleToneClass instanceSai() {
		if(k==null) {
			 k = new SingleToneClass();
			return k;
		}
		return k;
	}
	public static void main(String[] args) {
	
		
		System.out.println(k);

		System.out.println(SingleToneClass.instanceSai());
		System.out.println(SingleToneClass.instanceSai());
		System.out.println(k);
		
	}
}
