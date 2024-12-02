package JavaPackage;

public class Duplicate1 {

	
	
	public static void main(String[] args) {
		
		String s="Babublu";
		String s1 = "";
		
		for(int i=0;i<s.length();i++) {
			String s2=""+ s.charAt(i);
			
			if(s1.contains(s2)) {
				continue;
			}else {
				s1+=s2;
			}
			
			
			System.out.println(s1);
		}
		
		//System.out.println(s1);
		
	}
}
