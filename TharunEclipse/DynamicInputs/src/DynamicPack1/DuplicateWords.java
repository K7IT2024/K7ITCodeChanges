package DynamicPack1;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String s1 = "java java core java good java";
		
		String s2="";
		
		
		String s3[]=s1.split(" ");
		
		for(int i=0;i<s3.length;i++) {
			
			if(s2.contains(s3[i])) {
				continue;
				
			}else
				s2 +=s3[i]+" ";

			
		}
		System.out.println(s2);

		
		
		
		
		
	}
	
	
	
}
