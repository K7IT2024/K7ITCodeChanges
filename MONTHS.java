package Rockpackage;

public enum MONTHS {
	JAN, FEB(4), MAR, APR, MAY(7,"sai"), JUN, JUL, AUG, SEP("yack"), OCT, NOV, DEC;
	
	MONTHS(){
		System.out.println("NO ARG TYPES MONTHS");
	}
	
	MONTHS(int u){
		System.out.println(u);
	}
	MONTHS(String t){
		System.out.println(t);
	}
	{
		System.out.println("IIB");
	}
	
	MONTHS(int z, String b){
		System.out.println(b);
	}

	public static void main(String[] args) {
		MONTHS  B = MONTHS.APR;
		System.out.println(B);

	}
}
