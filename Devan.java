package devapackage;

public final class Devan {
	private static Devan sai;

	private Devan() {
	}

	public static Devan rockSai() {
		if (sai == null) {
			sai = new Devan();
			return sai;
		}
		return sai;   
		
	}
	public static void main(String[] args) {
		Devan t = new Devan();
		System.out.println(sai);
		System.out.println(t.rockSai());
		System.out.println(t);
		System.out.println(sai);

		System.out.println(sai);
		System.out.print(Devan.rockSai());
		
		System.out.println(sai);
		System.out.println(sai);
		

	}

}
