package devapackage;

public class BulletSai extends Bullet  {
	 
	BulletSai(String color,int k){
		this .color =color;
		this.k = k;
		
		
	}
	
	
	public static void main(String[] args) {
		
	
		
		Bullet y = new Bullet();
		System.out.println(y.k);
		System.out.println(y);
		System.out.println(y);
		BulletSai Rocket =new BulletSai("black",100);
		System.out.println(Rocket); 
		
	
		
	}




	@Override
	public String toString() {
		return " [k=" + k + ", ht=" + ht + ", wt=" + wt + ", color=" + color + "]";
	}

}
