package DynamicPack1;

public class captial5 {

	public static void main(String[] args) {
		
		String s1 = "java king of software";
		String result="";
		String tharun ="";
		
		String [] s3 = s1.split(" ");
		
		for(int i=0;i<s3.length;i++) {
			
			result=s3[i];
			
			result=s3[i].substring(0, 1).toUpperCase();
			
			result =result+s3[i].substring(1);
			
			
			tharun+=result+" ";
			
		}
		
		System.out.println(tharun);
		
		
		
		
	}

}
