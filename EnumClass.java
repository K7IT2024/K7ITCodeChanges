package Rockpackage;

public enum EnumClass {
	Sunday, friday, Monday(70,90), Tuesday("leo"), wednesday, saturday, thursday(9);   
	
	
	EnumClass(int i){
		System.out.println(i);
	}
	EnumClass(){
		System.out.println("no-arg");
	}
	{
		System.out.println("IIB");
	}
	EnumClass(String y){
		System.out.println(y);
		}
	
	
	EnumClass(int k, int l){
		System.out.println(k);
		}

	public static void main(String[] args) {
		EnumClass b = EnumClass.Monday;
		System.out.println(b);
	}
}
