package com.k7it.stringDemo;

public class StringDemo {
  public static void main(String[] args) {
	/*
	    String: it is one of the important class in java, its available under java.lang package.
	    its mainly using for manipulating the multiple alphanumeric characters.
	    
	    String class is immutable class and also it is final class. 
	    
	    immutable: immutable means once you create the object, we cant change the value inside the object
	    with in the same memory location. if we try to change the value it will create another object with 
	    newly updated value.
	    
	    Final class: if class is a final, those classes will  not support inheritance, it means for String class
	    there is no sub classes.
	    
	    for class we can create objects in 2 ways . 
	     1. Literal way of creation 
	     2. Object way of creation 
	     
	     1. Literal way of creation : it means assigning the values without using new operator 
	         
		     String s1.hashCode() = "abc";
		     String s2 = "java";
		     String s3 = "K7iT";	     
	      Note: for all primitive data types and wrapper classes and String class we can able to give the values 
	      in the form of literal way. 
	       int i =10;
	       Integer i = 20;
	       short s  = 5;
	       byte b = 127;
	       byte b = 07;
	       byte b = 08;// CTE
	       
	       How to give the octal numbers in java for primitive data types :
	       =================================================================
	         by using zero is prefix for the number we can assign the octal numbers. because of that 
	         if we use zero is prefix we can't usned 8 or 9 after zero. since octal number suppert only 
	         0 to 7. 
	         
	         int i = 05; octal 5 
	         int j = 07; octal 7
	         int k = 08; cte why bzc in octal we dont have 8 number 
	         int l = 010; octal 10
	         
	         
	         
	       
	    2. Object way of creation : we will assigning the values for string data type using new operator .
	    
	        
	        String s1 = new String("abc");
	     	String s2 = new String("java");
	     	String s3 = new String("K7iT");	
	     
	     
	     
	     
	     
	      int i = 020;
	  System.out.println(i);// 08
	    
	    
	   toString():
	   ========== 
	   it is inherited method from object class , but string class guys overridden
	   this method based on object content, so it will give the state of the object as string format.
	   when ever you you use tostring() method.
	   
	   String s1 ="abc";
	   
	   Syso(s1); -> syso(s1.toString());// abc 
	   syso(s1.toString());// abc
	   
	  equals(): 
	  =========
	  this method also inherited method from object class, but in side String class it already 
	  overridden based on state of the object, so it will compare 2 objects based on the content but not based on 
	  the obj memory location.
	  
	  String s1 = "k7it"; // 11+7+9+20 = 47
	  String s2 = "Java"; // 10+1+22+1 = 34
	  String s3 = new String("k7it");
	  String s4 = s3;
	  String s5 = "k7it";
	  String s6 = new String("k7it");
	  
	  sop(s1 == s2);//false
	  sop(s1 == s3);//false
	  sop(s1 == s5);//true
	  sop(s1 == s4);//false
	  sop(s2 == s5);//false
	  sop(s3 == s5);//false
	  sop(s3 == s4);//true
	  sop(s3 == s6);//false
	  
	  sop(s1.equals( s2 ));//false
	  sop(s1.equals( s3 ));//true
	  sop(s1.equals( s5 ));//true
	  sop(s1.equals( s4 ));//true
	  sop(s2.equals( s5 ));//false
	  sop(s3.equals( s5 ));//true
	  sop(s3.equals( s4 ));//true
	  sop(s3.equals( s6 ));//true
	  
	  hashCode():
	 =============
	  it is also inherited method from object class only like toString(), equals().
	  this method also overridden in the String class based content of the object. 
	  example : if we calculate hashCode based on content as per our formula
	    "k7it"; -> 11+7+9+20 = 47
	    "Java"; -> 10+1+22+1 = 34
	  
	  sop(s1.hashCode() == s2.hashCode() );//false
	  sop(s1.hashCode() == s3.hashCode() );//true
	  sop(s1.hashCode() == s5.hashCode() );//true
	  sop(s1.hashCode() == s4.hashCode() );//true
	  sop(s2.hashCode() == s5.hashCode() );//false
	  sop(s3.hashCode() == s5.hashCode() );//true
	  sop(s3.hashCode() == s4.hashCode() );//true
	  sop(s3.hashCode() == s6.hashCode() );//true
	  
	  hashcode method will produced same output of equals() , because both the methods are
	  overridden based on content inside string class. 
	  
	  String concatenation : 
	  ====================
	  it is a process of adding or joining more than one string objects into a
	  single String obj is called as string concatenation.
	  
	  in string we can achieve this concatenation operation in 2 ways 
	  1. using + operator 
	  2. using concate()
	  
	  + operator : 
	  in java + operetor will perform 2 operations 
	    a. arithmetical addition operation: if both the sides values are numeric 
	       10 + 30 = 40;
	    b. String object concatenation : if both or either one value is String
	        10 + "30"   = "1030"
	        "10" + "30" = "1030"
	        "10" + 30   = "1030" 
	        "abc" + "10" = "abc10"
	         
	        String s1  = "abc";
	        String s2  = "xyz";
	        String s3  = s1+s2; "abcxyz"
	        String s4  = "xyz"+s2; "xyzxyz"
	        
	    concate(): 
	    ==========
	    in string class concate method will works same as + operator, it will also concate
	    2 string objects into a single string obj.
	    syntax:
	     public String concate(String str){
	      return this+str;
	     }
	    
	    ex:
	     String s1  = "abc";
	     String s2  = "xyz";
	     String s3  = s1.concate("123");
	     s2.cancate("456");
	     
	     sop(s1);// abc
	     sop(s2);// xyz
	     sop(s3);//abc123
	     sop(s2.cancate("456"));// xyz456
	     sop(s2);xyz
	     s2  = s2.concate("456");
	     sop(s2);// xyz456
	     
	    
	  Note: concate method wont replace the current object value with new concate string
	   Automatically , resulted string object will created as new object in another location
	   if we want replace our currect obj ref variable value with newly joined string then 
	   we should reinitialize explicitly  using assignment operator (=)
	   
	      s2  = s2.concate("456");
	  
	  
	 
	  
	  How to split the one string into multiple string :
	  ==================================================
	  split(String splitStr): by using split method we can split the one string into multple
	  string based on given split string or split char or split delimiter and it will return
	  multiple Strings as a String array[]. 
	  
	  Syntax: 
	  public String[] split(String delimiter / regex){
	   
	  }
	  
	   String s = "Hello everyone welcome to K7iT,We are going to teach Java here,
	           if you learn java ur life will settle happily, if not go to hell";
	  
	  String strs[] = s.split(",");
	  strs[0] = "Hello everyone welcome to K7iT";
	  strs[1] = "We are going to teach Java here";
	  strs[2] = "if you learn java ur life will settle happily";
	  strs[3] = "if not go to hell";
	  
	  incase of arrays we can store multiple values using single variable name by using index.
	  here index will start with 0 and end with n-1.
	  
	  incase index is leass than 0 or greater than n-1, then we will get the 
	  IndexOutOfBoundException. 
	  
	  sop(s);  "Hello everyone welcome to K7iT,We are going to teach Java here,
	           if you learn java ur life will settle happily, if not go to hell"
	  
	  sop(strs[0]);  "Hello everyone welcome to K7iT";
	  sop(strs[2]);  "if you learn java ur life will settle happily";
	  sop(strs[-1]);  //java.lang.ArrayIndexOutOfBoundException
	  sop(strs[5]);  //java.lang.ArrayIndexOutOfBoundException
	  
	  String s1  = "Hello everyone good morning";
	  
	 String strs[] = s1.split(" "); 
	  
	  Note: in case out string doesn't contain given split string then it will return entire
	   string 
	  as single string.
	  
	   String strs1[] =s.split("123");
	  
	  System.out.println(strs1[0]);
	  
	  here inside our string we don't have "123" as delimiter, so it will return whole string
	   as result, but it wont give any error.  
	   
	   
	   substring():
	   ============
	   syntax:
	   
	   public String substring(int startIndex, int endIndex){
	   // it will return the the portion of the string between start index and end index .
	    here start index works likes include operation and end index works like exclude 
	    operation. 
	   }
	   
	   String s = "Hello every";
	   here even string also will contains index for each character inside string.
	  
	                "Hello every"
	                 012345678910
	     String substr = s.substring(0,5);//"Hello"
	     String substr = s.substring(0,4);//"Hell" 
	     
	     note1: here also in case  end index is lessthan start index or strat index is 
	     greaterthan end index - we will get StringIndexOutOfBoundsException.
	     
	     note2: incase index is less than 0 or greater than n-1, then we will get 
	     java.lang.StringIndexOutOfBoundException
	     
	     note2: substring() will not create new object in heap memory with port of the string
	    ,it will point into the original object only with specified index portion. 
	    
	    substring(int startIndex):
	   ===========================
	    there is a one more overloaded  substring method with only int startindex :
	    syntax:
	    public String substring(int startIndex){
	      // here this method will consider sub from from given start index to 
	         end of the original string.
	    }
	    
	    example :
	     String s = "Hello every";
	     String substr3  = s.substring(6);-> s.substring(6,11); // every
	     String substr4  = s.substring(0);-> s.substring(0,11); // Hello every
	     String substr4  = s.substring(3);-> s.substring(0,11); // lo every
       here start index should not be a less than zero or greater than n-1, else we will
       get StringIndexOutOfBoundException 
       
       length():
       ========= 
       length method will return the no of characters in the given string in integer format.
       count start with 1 but index start with zero. 
       
        public int length(){
        
        }
        String str = "hello";
        sop(str.length());//5
        String subStr = str.substring(0,3);
        sop(substr.length());//3
        sop(substr);//"hel"
        	     
	 
	  
	  String s = "Hello every";
	  String substr1 = s.substring(0,5);//"Hello"
	  String substr2 = s.substring(0,4);//"Hell" 
	  System.out.println(substr1);
	  System.out.println(substr2);
	  
	  //s.substring(5, 0);// StringIndexOutOfBoundsException
	  
	  String st2  =  s.substring(0,5) + "abc"; // Hello abc 
	  
	  String str3  =  s.substring(0,5) + s.substring(6,11);// "Helloevery"  -> non constant pool
	  String str4 = "Helloevery"; // constant 
	  
	  System.out.println(str3 ==  str4);//false
	  System.out.println(str3.equals(str4));//true
	  System.out.println(str3.hashCode());//452454825
	  System.out.println(str4.hashCode());//452454825
	  */
	  
	 /* // charAt(int index):
	  =====================
		this method used to get the single character from given index location. here in case 
		index is less than zero or greater than length-1 or n-1 then we will get 
		StringIndexOutOfBoundException.
		
		IndexOutOfBoundException (Super class)
		 =================
		      1. StringIndexOutOFBoundException(sub class)
		      2. ArrayIndexOutOfBoundException (sub class)
		      
		this method help us in some problem solving like character count in the string
		or reverse the given string or reverse the each word in the given string. 
		
		public char charAt(int index){
		  
		}
		
		String s = "Good morning";
		            0123456789,10,11
		sop(s.charAt(4));//" "
		sop(s.charAt(10));//n
		sop(s.charAt(-1));//SIOOBE
		sop(s.charAt(20));//SIOOBE
		
		1. reverse the string :
		 String rstr = "";
		 int n = s.length();//12
		 for(int i =0; i < n ;i++){ 
		    char c = s.charAt(i);
		    rstr = c+rstr;
		 }
		 sop("Orginal String:"+s);
		 sop("Reverse String:"+rstr);
		 
   i = 0   0<12  rstr = "" c = s.charAt(0) = 'G'  rstr = c+rstr = 'G'+""="G"; i++ =i+1=0+1=1
		  
   i = 1   1<12  rstr = "G" c = s.charAt(1) = 'o'  rstr = c+rstr = 'o'+"G"="oG"; i++ =1+1=1+1=2
 		  
   i = 2 , 2<12  rstr = "oG" c = s.charAt(2) = 'o'  rstr ='o'+"oG" ="ooG" i++ =2+1 =3
   
   i  = 3  3<12 rstr = "ooG" c = s.charAt(3)= 'd'  rstr = 'd'+"ooG" = "dooG" i++ = 3+1=4
   i  = 4  4<12 rstr = "dooG" c = s.charAt(4)= ' ' rstr = ' '+"dooG" = " dooG" i++ = 4+1=5
   i  = 5  5<12 rstr = " dooG" c = s.charAt(5)= 'm' rstr = 'm'+" dooG" = "m dooG" i++ = 5+1=6
   i  = 6  6<12 rstr = "m dooG" c = s.charAt(6)= 'o' rstr = 'o'+"m dooG" = "om dooG" i++ = 7
   i=7 7<12 rstr="om dooG" c='r' rstr = r+"om dooG" = "rom dooG" i++ = 8
   i=8 8<12 rstr="rom dooG" c ='n' rstr ='n'+"rom dooG" = "nrom dooG" i++ =9
   i=9 9<12 rstr="nrom dooG" c ='i' rstr ='i'+"nrom dooG" = "inrom dooG" i++ =10
   i=10 10<12 rstr="inrom dooG" c ='n' rstr ='n'+"inrom dooG" = "ninrom dooG" i++ =11
   i=11 11<12 rstr="ninrom dooG" c ='g' rstr ='g'+"ninrom dooG" = "gninrom dooG" i++ =12
   i=12 12<12 condition false so it will stop the for loop execution.
   
   ++ -> increment operator 
   -- => decrement operator 
   
   o/p : Original: Good morning
         reverse: gninrom dooG		
		
		String s  = "Good morning";
	     String rstr = "";
		 int n = s.length();//12
		 for(int i =0; i < n ;i++){ 
		    char c = s.charAt(i);
		    rstr = c+rstr;
		 }
		 System.out.println("Orginal String:"+s);
		 System.out.println("Reverse String:"+rstr);
	  
		 rstr = "";
		 for(int i = n-1; i >=0 ;i--){ 
			    char c = s.charAt(i);
			    rstr = rstr+c;
			 }
		 System.out.println("Orginal String:"+s);
		 System.out.println("Reverse String:"+rstr);
		 
		 
		 indexOf(String str): 
		 ====================
		 this method will return index of given sub string if it present
		 else it will return -1;
		 in case of portion of the string it will start the scanning for given string in forward 
		 direction and if it founds in the original string it return starting index 
		 given string.
		 
		 String s = "K7iT";
		             0123
		 sop(s.indexOf("i"));//2
		 sop(s.indexOf("j"));//-1
		 sop(s.indexOf("7iT"));//1
		 sop(s.indexOf("K7iT"));//0
		 sop(s.indexOf("iTJ"));//-1
		 
		 lastIndexOf(String str):
		 ========================
		 this method will scan for the given string in the original string in backward
		  direction, if given string found in original string it will return start index
		  of the given string. if not found this method will return -1
		  
		  
		  String s = "Good morning";
		              
		 sop(s.lastIndexOf("o"));//6
		 sop(s.indexOf("o"));//1
		 
		 sop(s.lastIndexOf("Good"));//0
		 sop(s.indexOf("Good"));//0
		 
		 sop(s.lastIndexOf("java"));//-1
		 sop(s.indexOf("java"));//-1
		 
		 how to find given string is available only once in the original string:
		 
		 
		 if(s.index("r") == s.lastIndexOf("r")){
		    sop("given string is present only once");
		 }else{
		    sop("it present more than once")
		 }
		       1                  6
		  if(s.index("o") == s.lastIndexOf("o")){
		    sop("given string is present only once");
		 }else{
		    sop("it present more than once")
		 }
		 
		 if(s.index("Good") == s.lastIndexOf("Good")){
		    sop("given string is present only once");
		 }else{
		    sop("it present more than once")
		 }
		 
		toUpperCase()
		toLowerCase()
		
		contains(): this is used for verifying given string is available or not in 
		original string, if it available it will return true, else it will return false.
		
		String str = "abc1234xyzpqru";
		
		sop(str.contains("123"));// true
		sop(str.contains("def"));// false
		sop(str.contains("123yxz"));// false
		sop(str.contains("1234xyz"));// true
		sop(str.contains("aruna"));// flase
		
		replace(String regex/find, String replace): this method will replace find string 
		with replace string if it present in the original string else it will ignore.
		
		replaceAll(String regex/find, String replace): this method will replace find string 
		with replace string if it present in the original string else it will ignore.
		
		 String str = "abc1234xyzpqruxyz";
	  System.out.println(str.replace("xyz", "PQR")); //abc1234PQRpqruPQR
	  System.out.println(str.replaceAll("xyz", "PQR"));//abc1234PQRpqruPQR
	  System.out.println(str);//abc1234xyzpqruxyz
	  
	  str = str.replace("xyz", "PQR");
	  
	  System.out.println(str);//abc1234PQRpqruPQR
	  
	  trim(): it will removes the leading and tailing empty spaces from the given string.
	  
	   String s = "   abc  123     ";
	   Sop(s);//"   abc  123     "
	   sop(s.trim())//"abc 123"
	  
	  isEmpty() / isBlank(): this method will give the boolean true value if string is empty else it 
	  will give boolean false. 
	  
	  String s = "";
	  String s1 = "1234"
	  String s5 = "   ";
	  
			  
	  */
	  String s = "   abc  123     ";
	   System.out.println(s);//"   abc  123     "
	   System.out.println(s.trim());//"abc 123"
	  String s2 = "";
	  String s1 = "1234";
	  String s5 = "   ";
	  String s6 = null;
	  System.out.println(s2.isEmpty());
	  System.out.println(s1.isEmpty());
	  System.out.println(s5.isEmpty());
	  System.out.println(s5.trim().isBlank());
	  
	  //s6.concat("abc");//" java.lang.NullPointerException: Cannot invoke 
	  				//"String.concat(String)" because "s6" is null
	 // System.out.println(s6.isEmpty());//java.lang.NullPointerException: Cannot invoke 
	  	s6 = s6+"a";								//"String.isEmpty()" because "s6" is null
	  System.out.println(s6);
		
		
}  
}
