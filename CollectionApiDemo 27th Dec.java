package com.k7it;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionApiDemo {
	/*
	  collections framework : 
	  
	    collections: start with small 'c': this word is used to represents the
	                  collection framework concept.
	    Collection: start with capital 'c' without end with 's' : it is a master super interface
	                in the collection framework. 
	                
	    Collections: start with capital 'C': it is a one of Utility class inside
	                 collection framework like Arrays class in array concept. it will 
	                 some utility methods to manipulates the collection framework elements.
	                 
	    All collection classes and interfaces are available under java.util package, so if
	    we want to use any of the collection classes or interfaces we should add the import 
	    statement. 
	    
	    By using collection framework we can able to store and manipulate multiple values with
	    multiple data types as well by using single variable.
	    
	    why bzc we  collection framework classes or methods are by default Object class type.
	    like Array with Object class type. 
	    
	      ex: 
	        Object obj1 = new Object();
		    String s1 = new String("K7it");
		    Integer i1 =  new Integer(20);
		    
		    a[0] = obj1;
		    a[1] = s1;
		    a[2] = i1;
		    a[3] = 1234; //-> auto boxing into Integer class type
		    
		    Collection framework hierarchy :
		    
		    Collection:                             -> Map
		        ->List                                ->HashMap
		           -> ArrayList  					  ->LinkedHashMap
		           -> LinkedList 					  ->TreeMap
		           -> Vector(Legacy class )			  ->HashTable(legacy class)
		         
	            ->Set 
	                ->HashSet
	                ->LinkedHashSet
	                ->TreeSet
	            ->Queue
	                ->PriorityQueue
	          
	                
	      Legacy classes: its a old classes from jdk1.0 onwards these class are available, but 
	      its not advisable to use legacy classes.
	      
	      in collection framework mainly we have 4 interfaces, in that 3 are sub interface to
	      to Collection interface i.e List , Set, Queue. But 4th interface Map is not a sub 
	      interface to collection interface, it is separate interface inside collections
	      framework. 
	      
	      We will start with List interface:
	      List: list interface is a sub interface of collection interface, its available under 
	      java.util package. 
	      List interface will works same as the Arrays like index based operations. why because
	      list will use Arrays internally with Object type array. 
	      
	     -> by using List we can able to insert the data randomly by using index. 
	     -> by using list we can read the data randomly by using index from where we need.
	     -> list will provide order of output, it means which order we inserted same order we will
	        get the output while printing/reading values .
	     -> by default List size will taken as 10, once we added 10 elements into list then
	        it will increase the size of list double of present size. 
	        i.e it will increase 
	        10 to 20
	        20 to 40
	        40 to 80
	     List is having 3 sub classes  like
	             ArrayList 
	             LinkedList 
	             Vector
	            
	          ArrayList: it is sub class of List interface , it will works same as list 
	          interface features which we have listed above.
	          
	          Arraylist is having 3 types of Constructors.
	              1. Arraylist() -  no arg
	              2. Arraylist(int initialcapaticy);
	              3. Arraylist(Collection col)
	              
	              
	            Note: in side every collections classes toString() method is overridden.
	            
	            ArrayList its internally using arrays only, without arrays Arraylist it will not
	            work.
	            ArrayList internally it will use the Object type Array.
	            
	            Object a[] =  new Object[10];
	            when we start adding elements into a array using add() method
	            before adding element into array it will check 
	            
	            if(size of the array == no of elements in the array){
	             1. then  first we need  created the new array with double size of 
	              old array capacity.
	             2. copy old array elements into a new array
	             3. add our new element on top of old elements 
	             4. return that new array to user.
	            }else{
	               1. add new element old array just increasing index by one.
	            }
	            
	            
	            
	            important methods in  ArrayList: 
	            ================================
	            
	            
	            add(): by using add method we can add the elements into a arraylist. inside every
	             sub class of List interface there  are 2 overloaded add methods 
	              1. add(Element): this add method will add new element at end of arraylist any time
	              2. add(index, element) : this method will add the new element at specified 
	                  index place instead of adding at end of arraylist. 
	                  
	                  in arrays it works like this but
	                  a[1] =  abc;
	                  a[1] = xyz;
	                  sop(a[1]);// xyz
	                  
	                  
	                  in ArrayList:
	                  =============
	                  ArrayList list = new ArrayList();
	                  list.add("abc");//index 0
	                  list.add("pqr");// index 1
	                  list.add("123");// index 2
	                  list.add("456");// index 3
	                  
	                  Syso(list.get(1));//pqr
	                  Syso(list.get(2));//123
	                  Syso(list.get(3));//456
	                  
	                  
	                  list.add(1,"xyz");// 
	                  
	                  Syso(list.get(1));//xyz
	                  Syso(list.get(2));//pqr
	                  Syso(list.get(3));//123
	                  Syso(list.get(4));//456
	                  
	                  // here when we add new element in the specified index, then arraylist 
	                   will shift existing data from specified index to still last element
	                   one step forward i.e 1 index value in to 2 index, 2nd index value into
	                   3rd index, 3rd index value... 4th index........ nth index value 
	                   n+1th index .
	                   
	                   Note: because of this array list will give the less performance in case of 
	                   Random insertion. but it will give best performance in case of random 
	                   access or reading.
	                  
	                  
	                 get(index): this method will give the element data from specified index.
	                 
	                  Syso(list.get(1));//xyz
	                  Syso(list.get(2));//pqr
	                  Syso(list.get(3));//123
	                  Syso(list.get(4));//456
	                  
	                  Note; here if index is less zero or greater than size of arraylist it will
	                   give IndexOutOfBoundExcpetion
	                     
	                     Syso(list.get(7));
	                     
		Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 7 out 
		of bounds for length 5 	at 
	                  
	              addAll(collection c): by using addAll method we can add all elements from one
	               arraylist elements
	              into a another arraylist
	              addAll(int index, collection c):  by using addAll method we can add all elements 
	              from one arraylist elements into a another arraylist at specified index.
	           
	             addAll() : it will take argument type is collection interface, so this method
	             will support for all sub class of collection interface classes elements. 
	             i.e ArrayLit, LinkedList,Vector,HashSet,TreeSet,LinkedHashSet,List,Set etc..
	             
	             example: 
	    
	    		ArrayList list = new ArrayList();
				// how to add elements in to AL
				list.add(100);
				list.add(10.12);
				list.add("pranitha");
				list.add(true);
				list.add("giri");
				list.add('a');
				
				ArrayList list1 = new ArrayList();
				list1.addAll(list);
	
				System.out.println("Old arralist:"+list); old list: [100, 10.12, pranitha, true, giri, a]
				System.out.println("new arralist:"+list1);new list :[100, 10.12, pranitha, true, giri, a]
	      Note: addAll(Col): will always append the new elements at ending of the new collection
	                         list.
	                         
	                    list1.addAll(3,list);   
	                    
	                    
	          ArrayList(Collection c): this constructor will perform 2 oeprations, 
	            1.  creating obj for Arralist 
	            2. inserting all elements from parameter collection to our arraylist obj like 
	            as same as addAll() method.
	            
	            ArrayList list = new ArrayList();
				// how to add elements in to AL
				list.add(100);
				list.add(10.12);
				list.add("pranitha");
				list.add(true);
				list.add("giri");
				list.add('a');
				
				ArrayList list1 = new ArrayList(list);
				
				System.out.println("Old arralist:"+list); old list: [100, 10.12, pranitha, true, giri, a]
				System.out.println("new arralist:"+list1);new list :[100, 10.12, pranitha, true, giri, a]
	     
	      ArrayList(int initialcapacity): this constructor will create the obj for ArrayList
	      with specified capacity instead of default capacity i.e 10;
	      
	                    ArrayList list = new ArryList(150);
	                    
	                    Object a[] = new Object[150];
	                    
	                    Object a[] = new Object[10];//deafult 
	                    
	                    
	             note: if we want to all more elements in arraylist better to go arraylist 
	              initial capacity instead of default capacity. why bzc by deafult AL will  
	              takes deafult capacity is 10 , but once u trying to add 11 element 
	              it will perform 2 operations 
	                 1. resizing the internal object type array creating  with new array.
	                 2. copy all elements from old array to new array which we created with 
	                    new capacity.
	                   
	                   suppose we have requirement to add 150 elements.
	                   in case of deafult process
	                   10 -- 11th adding 
	                        Object a[] = new Object[10];
	                        a[0] =v1;
	                        a[1] =v2;
	                        a[2] =v3;
	                        a[3] =v4;
	                        a[4] =v5;
	                        a[5] =v6;
	                        a[6] =v7;
	                        a[7] =v8;
	                        a[8] =v9;
	                        a[9] =v10;
	                       1. resize or rescale operation from 10 to 20 array list
	                       2. cop all 10 elements into a new array
	                       3. add new values into new array
	                       4. return new array to user 
	                        Object temp[] = new Object[10*2];
	                        int i=0
	                        for(Object v: a){
	                         temp[i] =  v;
	                         i++;
	                        }
	                        
	                         temp[0] =a[0];
	                         temp[1] =a[1];
	                         temp[2] =a[2];
	                         temp[3] =a[3];
	                         temp[4] =a[4];
	                         temp[5] =a[5];
	                         temp[6] =a[6];
	                         temp[7] =a[7];
	                         temp[8] =a[8];
	                         temp[9] =a[9];
	                         
	                         a = temp;                        
	                         
	                         
	                        a[10] = v11
	                        
	                        above steps will repeat for at 21 elements place, 41 elements place
	                        81 elements place, 
	                        
	                        if we want to avoid all these exercise after reaching the initial
	                        capacity better to create our collection objects with required 
	                        capacity i.e 150 
	                        
	                        How to find out no of elements in my collection object?
	                        =======================================
	                        size(); by using size() we can get the number of elements in  
	                        our collection object.  it will return the integer value.
	                  
	                    ArrayList list = new ArrayList();
							// how to add elements in to AL
							list.add(100);
							list.add(10.12);
							list.add("pranitha");
							list.add(true);
							list.add("giri");
							list.add('a');
							
							System.out.println("size of my AL:"+list.siz());// 6
				
				 isEmpty(): by using isEmpty() we can find out either our collection obj is 
				 empty or not empty, if it is a empty isEmpty() will return true, else it
				  will return false;
				  
				  Arraylist list2  = new ArrayList();
				  System.out.println("is list2  empty:"+list2.isEmpty());// true
				  System.out.println("is list  empty:"+list2.isEmpty());// false
				  
				  how to update existing value in list:
				  ====================================
				  
				  set(int index, Object newValue) : this method will update the old value
				  with new value at specified index. 
				  
				  
				  
				    ArrayList list = new ArrayList();
							// how to add elements in to AL
							list.add(100);
							list.add(10.12);
							list.add("pranitha");
							list.add(true);
							list.add("giri");
							list.add('a');
							
				System.out.println("before update arralist:"+list); [100, 10.12, pranitha, true, giri, a]
				
				 list.set(4,"Gowtham");
				 list.set(5,"Aruna")
				System.out.println("new arralist:"+list1);new list :[100, 10.12, pranitha, true, Gowtham, Aruna]
	     			
				How to search for elements from the collection object:
				======================================================
				
				contains(Object element): this method will return boolean true if specified 
				element available in our collection obj else it will return boolean false.
				
	               ArrayList list = new ArrayList();
							// how to add elements in to AL
							list.add(100);
							list.add(10.12);
							list.add("pranitha");
							list.add(true);
							list.add("giri");
							list.add('a');
							
							sop(list.contains("giri"));// true
							sop(list.contains("Aruna"));// false
							         
							      
	         indexOf(Object element): 
	         						this method will works same as contains method but 
	         if element present it will return that corresponding element index value else 
	         it will return -1;  
	         
	         lastIndexOf(Object element): 
	         					this method also works same as indexOf() but only
	         difference is index of method scans the element from start to end, but last 
	         index of method will scan for element from end to start.
	         if element present it will return that corresponding element index value else 
	         it will return -1;  
	         
	                   
	        containsAll(collection c): 
	        					this method will compare one collection to another 
	        collection obj with all elements, if all elements are available in new collection 
	        it will return boolean true else it will return boolean false.
	        
	        ArrayList list2 = new ArrayList();	 
			 list2.add("pranitha");
			 list2.add(true);
			ArrayList list1 = new ArrayList();
			list1.add("pranitha");
			list1.add(true);
			list1.add("Anu");
 System.out.println("is list1 having all elements of list2:"+list1.containsAll(list2));//true


	        ArrayList list2 = new ArrayList();	 
			 list2.add("pranitha");
			 list2.add(true);
			 list2.add("Latha");
			ArrayList list1 = new ArrayList();
			list1.add("pranitha");
			list1.add(true);
			list1.add("Anu");
			
	      System.out.println("is list1 having all elements of list2:"+list1.containsAll(list2));//false
	      
	  case 1: list1 having all elements of list2 i.e pranitha and true so out is : true
	  case2: list1 doest have Latha element from list2, list2 having pranitha, true,
	  Latha, but list having pranitha, true, Anu. so Latha is missing in list1. 
	  
	   so we are getting boolean false;
	   
	   How to remove or delete elements from list:
	   =============================================
	   
	   remove(element):  remove(element) it will remove the given element from the specified 
	   list if and only if that element is present else it will simply ignore.
	   
	   		ArrayList list1 = new ArrayList();
			list1.add("pranitha");
			list1.add(true);
			list1.add("Anu");
			System.out.println("before remove:"+list1);//before remove:[pranitha, true, Anu]
			list1.remove(true);
			System.out.println("after remove:"+list1);//after remove:[pranitha, Anu]
			list1.remove("Giri");//here if element is not available nothing will happen in the list
			System.out.println("after remove:"+list1);//after remove:[pranitha, Anu]
			
	   remove(int index): this method also remove the element from the specified index inside
	   specified list. but here index should be >= 0 or <=size-1 else we will get the IOOBE
	   
	   
					ArrayList list1 = new ArrayList();
					list1.add("pranitha");
					list1.add(true);
					list1.add("Anu");
					System.out.println("before remove:"+list1);//before remove:[pranitha, true, Anu]
					list1.remove(1);
					System.out.println("after remove:"+list1);//after remove:[pranitha, Anu]
					list1.remove(5);//here if element is not available nothing will happen in the list
					System.out.println("after remove:"+list1);//after remove:[pranitha, Anu]
					
					out put:
					before remove:[pranitha, true, Anu]
					after remove:[pranitha, Anu]
					Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 2
						at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
						at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
						at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
						at java.base/java.util.Objects.checkIndex(Objects.java:359)
						at java.base/java.util.ArrayList.remove(ArrayList.java:504)
						at com.k7it.CollectionApiDemo.main(CollectionApiDemo.java:520)

	
	    removeAll(Collection c): removeAll() will remove all the elements from list1 which 
	    are available in list2.
	    
			    ArrayList list1 = new ArrayList();
				list1.add("pranitha");
				list1.add("Giri");
				list1.add("Anu");
			
			ArrayList list2 = new ArrayList();	 
			 	list2.add("pranitha");
			 	list2.add("Giri");
			 	list2.add("Latha");
			 
			 System.out.println("before remove all list1 and list 2");
			 System.out.println("list1:"+list1);
			 System.out.println("list2:"+list2);
			 list1.removeAll(list2);
			 
			 System.out.println("after remove all list1 and list 2");
			 System.out.println("list1:"+list1);
			 System.out.println("list2:"+list2);
			 
			 Output:
			 
			 	before remove all list1 and list 2
				list1:[pranitha, Giri, Anu]
				list2:[pranitha, Giri, Latha]
				after remove all list1 and list 2
				list1:[Anu]
				list2:[pranitha, Giri, Latha]
				
				

	    retainAll(Collection c): this method will remove all unmatched elements from list1
	    to list2;
	    
	     ArrayList list1 = new ArrayList();
		list1.add("pranitha");
		list1.add("Giri");
		list1.add("Anu");
	
	ArrayList list2 = new ArrayList();	 
	 	list2.add("pranitha");
	 	list2.add("Giri");
	 	list2.add("Latha");
	 
	 System.out.println("before retainAll list1 and list 2");
	 System.out.println("list1:"+list1);
	 System.out.println("list2:"+list2);
	 
	 list1.retainAll(list2);
	 
	 System.out.println("after retainAll  list1 and list 2");
	 System.out.println("list1:"+list1);
	 System.out.println("list2:"+list2);
	 
	 
	 Output:
	    before retainAll list1 and list 2
		list1:[pranitha, Giri, Anu]
		list2:[pranitha, Giri, Latha]
		after retainAll  list1 and list 2
		list1:[pranitha, Giri]
		list2:[pranitha, Giri, Latha]

	   clear(): this method will clear / remove all elements from specified list, it will make
	   list is empty.
	   
	   ArrayList list1 = new ArrayList();
		list1.add("pranitha");
		list1.add("Giri");
		list1.add("Anu");
	 
	 System.out.println("before clear list1");
	 System.out.println("list1:"+list1);
	 
	 list1.clear();
	 
	 System.out.println("after clear  list1");
	 System.out.println("list1:"+list1);
	 
	  OutPut:
	    before clear list1
		list1:[pranitha, Giri, Anu]
		after clear  list1
		list1:[]
		
   		
    subList(startIndex,endIndex): this method will return the sub list or portion of the list
    from specified list obj between given start and end index.
    
    ArrayList list1 = new ArrayList();
		list1.add("pranitha");
		list1.add("Giri");
		list1.add("Anu");
		list1.add("likith");
		list1.add("Babu");
		list1.add("Ravi");
		list1.add("Uday");
	 
	 System.out.println("original:"+list1);
	 
	 List subList  = list1.subList(1,4);
	 
	 System.out.println("SubList from 1 to 4 index:"+subList);
	 	
	 	
	 	Output:
	 	     original:[pranitha, Giri, Anu, likith, Babu, Ravi, Uday]
			 SubList from 1 to 4 index:[Giri, Anu, likith]
			 
	 Note1: here start index is a include operation but end index is exclude operation
	   i.e we will take elements from list objects between 
	   >= startIndex and < endInde.

    Note1:  here either start index or end index should not be less than
    0 or greater than size; else we will get IOOBE. 
     and also start index always less then end index. 
    
	 trimToSize(): this method will release the unwanted memory space which 
	 is allocated to our list object and it will keeps only how many elements are 
	 there our list.
	 
	 replaceAll(Collection c):  this method will replace all element which 
	 are matching the filter condition with new value from list object.  
	 this method added as part of JDK 1.8 version.
	 
	 
	   ArrayList list1 = new ArrayList();
			list1.add("pranitha");
			list1.add("Giri");
			list1.add("Anu");
		 System.out.println("before repalceall list1");
		 System.out.println("list1:"+list1);
		 
		 list1.replaceAll(e -> e.equals("pranitha") ? "Aruna" :"Latha");
		 
		 System.out.println("after repalceAll  list1");
		 System.out.println("list1:"+list1);
		 
	 
	    here: -> this symbol is called as lamda expression 
	    ? : ; this symbols are called as ternary operator , it will works same as  
	      if and else blocks.  in case of if and else we need write multiple lines of code
	      but if we use ternary operator we can achieve same this in single line.
	      
	         if(e.equals("pranitha")){
			 	e = "Aruna";
			 }else {
				 e = "Latha";
			 
			}
			
		Syntax:  filterContion ? sucessCase value  : failure case value;
		
		int i  = 10;
		
		int j =  i==10? 100: 200;
		
		syso(j);//100
		
		j = i==20?100:200;		
		syso(j);// 200
	     
	     
	     Note: List interface classes will allows null values and duplicate values.
	      ArrayList list1 = new ArrayList();
			list1.add("pranitha");
			list1.add("Giri");
			list1.add("Giri");
			list1.add("Anu");
			list1.add("Anu");
			list1.add("Anu");
			list1.add(null);
			list1.add(null);
		 System.out.println("list1:"+list1);
		 
		 output: 
		 
		 list1:[pranitha, Giri, Giri, Anu, Anu, Anu, null, null]
         
         How to read the data from arrayList:
         ====================================
         1. by using direct get(int index) :
         
          ArrayList list1 = new ArrayList();
			list1.add("pranitha");
			list1.add("Giri");
			list1.add("Giri");
			list1.add("Anu");
			list1.add("Anu");
			list1.add("Anu");
			list1.add(null);
			list1.add(null);
			System.out.println(list1.get(4));//Anu
			System.out.println(list1.get(1));//Giri
			
	   2. using for loop :
	   
	      for(int i = 0 ;i<list1.size();i++){
	      	System.out.println(list1.get(i));
	      }
	      
	   3. while loop 
	   
	      int i = 0;
	      while(i < list1.size()){
	        System.out.println(list1.get(i));
	        i++;
	      }
	      
	   4. do - while 
	    ArrayList list1 = new ArrayList();
	     int i = 0;
	   	  do{
	   	  	System.out.println(list1.get(i));
	   	  	 i++;
	   	  }while(i < list1.size());
	     Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 
	     out of bounds for length 0
	     
	     Note: if List if empty do while will give the IOOBE, while reading zero index value
	     from empty list.
	     
	     if we want avoid this exception we should check the list is not empty before 
	     reading data from list.
	     
	     ArrayList list1 = new ArrayList();
	     list1.add("pranitha");
			list1.add("Giri");
			list1.add("Giri");
			list1.add("Anu");
			list1.add("Anu");
			list1.add("Anu");
	    if(!list1.isEmpty()) {
	              int i = 0;
			   	  do{
			   	  	System.out.println(list1.get(i));
			   	  	 i++;
			   	  }while(i < list1.size());
			   	  
	   	 }else{
	   	 	System.out.println("list is empty");
	   	 }
	     
	     output: 
	     
	     	pranitha
			Giri
			Giri
			Anu
			Anu
			Anu

     5. by using enhanced for loop :
     
         ArrayList list1 = new ArrayList();
	     list1.add("pranitha");
			list1.add("Giri");
			list1.add("Giri");
			list1.add("Anu");
			list1.add("Anu");
			list1.add("Anu");
			
			for( Object element : list1){
				System.out.println(element);
			}
			
			 ArrayList list1 = new ArrayList();
		     	list1.add("pranitha");
				list1.add("Giri");
				list1.add("Giri");
				list1.add("Anu");
				list1.add("Anu");
				list1.add("Anu");
			
			for( Object element :list1){
			    String str  =  (String)element;
				System.out.println(str);
			}
			
			output:
			pranitha
			Giri
			Giri
			Anu
			Anu
			Anu
			
			if List contains multiple data type values :
			  ArrayList list1 = new ArrayList();
		     	list1.add("pranitha");
				list1.add(123);
				list1.add(40.35);
				list1.add(true);
				
			
			for( Object element :list1){
			    String str  =  (String)element;
				System.out.println(str);
			}
			
			output:
			pranitha
			Exception in thread "main" java.lang.ClassCastException: 
			class java.lang.Integer cannot be cast to class java.lang.String
      while reading second value we are getting class cast excpetion 
      
      how to avoid this issue :
      =========================
      if we want to avoid this problem we need to know what is my value data type at runtime
      dynamically so that i can down cast accordingly 
       
        in java there is a one key word to find out value data type at runtime i.e
         instanceof key word

      syntax : 
      
             value instanceof ClassName 
             
             here instanceof key word will give the boolean true value if value is belongs to
             specified class type else it will gives boolean false. 
            Example: 
             1234 instanceof Integer // true
             1234 instanceof String // false
             
			    ArrayList list1 = new ArrayList();
			 	list1.add("pranitha");
				list1.add(123);
				list1.add(40.35);
				list1.add(true);
				
			
				for( Object element :list1){
					if(element instanceof String ) {
						String str  =  (String)element;
						System.out.println(str);
					}else if(element instanceof Integer) {
						int i =  (Integer)element;
						System.out.println(i);
					}else if(element instanceof Double) {
						Double i =  (Double)element;
						System.out.println(i);
					}else if(element instanceof Boolean) {
						Boolean i =  (Boolean)element;
						System.out.println(i);
					}
				}
				
				output: 
			 	pranitha
				123
				40.35
				true

	 	6. by using iterator() :  iterator() method will give the return type is Iterator 
	 	 interface type its available under java.util package only. this interface having 2 
	 	    important methods 
	 	      1. hasNext(): it will verify the list object either list having next element 
	 	       from current position. if there is a next element it will return boolean true
	 	       else it will return boolean false 
	 	      
	 	      2. next() : next() will take the cursor or control into next position like one
	 	      step forward from current position and he will returns the new position value.
	 	      
	 	      if we want to read the values from list by using iterator we should use while 
	 	      loop .
	 	      	
	 	 		ArrayList list1 = new ArrayList();
			 	list1.add("pranitha");
				list1.add(123);
				list1.add(40.35);
				list1.add(true);
		       
				Iterator  it =  list1.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
				output:
				pranitha
				123
				40.35
				true

	        7. listIterator : by using listIterator() method also we can read the data from list
	        listIterator() method will give return type as ListIterator it is a 
	        sub interface of Iterator Interface.
	        
	        -> here by using Iterator interface we can able to read the data from the list only
	        in forward direction, but by using ListIterator we can read the data from list
	        in 2 ways forward direction and backward direction. 
	        
	        -> in Iterator interface we have only 2 method 1. hasNext() 2.next()
	           but in ListIterator interface we have 7 important methods 
	           1. hasNext()
	           2. next()
	           3. hasPrevious()
	           4. previous()
	           5. add()
	           6. remove()
	           7. set()
	           
	           example:
	           ArrayList list1 = new ArrayList();
			 	list1.add("pranitha");
				list1.add(123);
				list1.add(40.35);
				list1.add(true);
		       
				ListIterator  it =  list1.listIterator();
				System.out.println("reading forward direction:");
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				System.out.println("reading backward direction :");
				while(it.hasPrevious()) {
					System.out.println(it.previous());
				}
	         
	         output:
	           reading foward direction:
	         	pranitha
				123
				40.35
				true
				
				reading abckward direction :
				
				true
				40.35
				123
				pranitha

	         Note: while iterating the list obj by using iterator interface we can't modify
	         the list obj either adding element or removing element or modifying elements.
	         if we try to do any of these operations we will get the 
	          ConcurrentModificationException like bellow
	          
	          ArrayList list1 = new ArrayList();
		 	list1.add("pranitha");
			list1.add(123);
			list1.add(40.35);
			list1.add(true);
	       
		    Iterator  it =  list1.iterator();
			while(it.hasNext()) {
				list1.add("new value");//// here we are trying to add new element into  list obj
				                         // while iterating list
				System.out.println(it.next());
			}
			
	       output:
	           Exception in thread "main" java.util.ConcurrentModificationException
	Note2: if we want to add or remove the elements from list while iterating we should go for
	ListIterrator instead of simple iterator.
	
	ArrayList list1 = new ArrayList();
		 	list1.add("pranitha");
			list1.add(123);
			list1.add(40.35);
			list1.add(true);
	       System.out.println("forward drection");
		    ListIterator  lit =  list1.listIterator();
			while(lit.hasNext()) {
				Object element = lit.next();
				if(element instanceof String && ((String)element).equals("pranitha")) {
					lit.add("Latha");
				}
				System.out.println(element);
			}
			System.out.println("Back ward direction");
			
			while(lit.hasPrevious()) {
				
				System.out.println(lit.previous());
			}
			
	System.out.println(list1);
	output:
	 	forward drection
		pranitha
		123
		40.35
		true
		Back ward direction
		true
		40.35
		123
		Latha
		pranitha
		[pranitha, Latha, 123, 40.35, true]
		
		how to remove the element from list while iterator:
		

			ArrayList list1 = new ArrayList();
		 	list1.add("pranitha");
			list1.add(123);
			list1.add(40.35);
			list1.add(true);
	       System.out.println("forward drection");
		    ListIterator  lit =  list1.listIterator();
			while(lit.hasNext()) {
				Object element = lit.next();
				if(element instanceof String && ((String)element).equals("pranitha")) {
					lit.remove();// here we are removing the pranitha element 
				}
				System.out.println(element);
			}
			System.out.println("Back ward direction");
			
			while(lit.hasPrevious()) {
				
				System.out.println(lit.previous());
			}
			
			System.out.println(list1);
	
	  out put:
	  
	  	forward drection
		pranitha
		123
		40.35
		true
		Back ward direction
		true
		40.35
		123
		[123, 40.35, true]

    
    How to update the list value while iterator :
    
    ArrayList list1 = new ArrayList();
		 	list1.add("pranitha");
			list1.add(123);
			list1.add(40.35);
			list1.add(true);
	       System.out.println("forward drection");
		    ListIterator  lit =  list1.listIterator();
			while(lit.hasNext()) {
				Object element = lit.next();
				if(element instanceof String && ((String)element).equals("pranitha")) {
					lit.set("Aruna");
				}
				System.out.println(element);
			}
			System.out.println("Back ward direction");
			
			while(lit.hasPrevious()) {
				
				System.out.println(lit.previous());
			}
			
	System.out.println(list1);
	
	output: 
	 	forward drection
		pranitha
		123
		40.35
		true
		Back ward direction
		true
		40.35
		123
		Aruna
		[Aruna, 123, 40.35, true]


		instanceof:  by using instanceof key word we can determine data type of the value
		 			 at Runtime.
		 			 syntax:
		 			    dataype instanceof variablename;
		 			    
		 			    ex: 
		 			     int i = 10;
		 			    sop(  Integer instanceof i );// true 
		 			    sop(  String instanceof i );// false 
		 			    
		8. reading list by using foreach(): foreach is added as part of the jdk 1.8 
		 
		      ArrayList list1 = new ArrayList();
		 	list1.add("K7iT");
			list1.add(123);
			list1.add(40.35);
			list1.add(true);
			for(Object element : list1) {
				System.out.println(element);
			}
			list1.forEach( element -> System.out.println(element) );
			
			list1.forEach(e -> {
				System.out.println(e); 
				System.out.println("Hello every one i am reading throrugh for each forloop");
				});
		      
	      
		e: represent inner element of the list automatically like enhanced forloop , here
		    datatype is not required .
	  	-> : lamda expression 
	  	
	  	inside foreach loop if we want to keep only one line of code then {} not required
	  	and also single line code no need to end with ;(semicolon). if we want to keep more 
	  	than one line of code in side forEach loop then we should use {} then in side {} 
	  	every line should end with semicolon ;.  
	  	
	  	forEach is one of the stream api as part of the jdk 1.8.
	  	
		      
		      
		How to sort the elements List:
		==============================
		if we want to sort the elements in list we should use the Collections.sort().
		here Collections is one of Utility class for all collections operations like Arrays class
		in the array concept. this class will provide all utility operation  methods for collection
		list.
		
		Sort(); it will sort the elements in list be default ascending order.  
		
		 syntax: 
		 
		         public static List sort(List list);
		         
		   Collections.sort(List): will support sort operation only for List interface classes
		    ArrayList, LinkedList,Vector. it wont support for Set or map interface classes.
		 
		 Note: if we want to sort the list element, that list should
		 contain only one type data. else will get ClassCastException
		 
		 example: 
		    ArrayList list1 = new ArrayList();
		 	list1.add("K7iT");
			list1.add(123);
			list1.add(40.35);
			list1.add(true);
		
		    Collections.sort(list1); //  java.lang.ClassCastException: class why bez out list is 
		                            // contains different data type elements like string, int,double
		                              etc.. 
		      
		    sorting rules:
		    ==============
		    primitive data type elements:
		      1. we should maintain the single data type value in list.
		      
		     example:
		      ArrayList list1 = new ArrayList();
		 	list1.add("K7iT");
			list1.add("Latha");
			list1.add("Aruna");
			list1.add("dhanya");
			list1.add("Dhanya");
			list1.add("123");
			list1.add("#123");
			list1.add("anu");
			System.out.println("Before sort:"+list1);
			Collections.sort(list1);
			System.out.println("after sorting the list :"+list1);
			
			output:
			 Before sort:[K7iT, Latha, Aruna, dhanya, Dhanya, 123, #123, anu]
			 after sorting the list :[#123, 123, Aruna, Dhanya, K7iT, Latha, anu, dhanya]
            
             sorting order or priority :
               1. special chars 
               2. numbers
		       3. upper case
		       4. lower case
		      
		     How to sort the elements in in the list in descending order :  
		     
		     in side Collections class there is another overloaded sort() with 2 parameters 
		     i.e 
		       Collections.sort(List, Comparator.reverseOrder);
		   Example:    
		        ArrayList list1 = new ArrayList();
		 	list1.add("K7iT");
			list1.add("Latha");
			list1.add("Aruna");
			list1.add("dhanya");
			list1.add("Dhanya");
			list1.add("123");
			list1.add("#123");
			list1.add("anu");
			System.out.println("Before sort:"+list1);
		    Collections.sort(list1,Comparator.reverseOrder());
			System.out.println("after reverse sorting the list :"+list1);
			
			
			output:
			    Before sort:[K7iT, Latha, Aruna, dhanya, Dhanya, 123, #123, anu]
				after reverse sorting the list :[dhanya, anu, Latha, K7iT, Dhanya, Aruna, 123, #123]

             How to add the derived objects into List:
             =========================================
             ArrayList list = new ArrayList();
			Person p1 = new Person(27,"K7iT",5.5,60.25);
			Person p2 = new Person(25,"dhanya",5.3,50.25);
			Person p3 = new Person(22,"aruna",5.6,55.0);
			Person p4 = new Person(25,"giri",5.7,75.0);
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p4);
			list.add(new Person(21,"babu",5.6,65.50));
			
			System.out.println(list);
			output:
			[com.k7it.Person@5e91993f, com.k7it.Person@1c4af82c, 
			com.k7it.Person@379619aa, com.k7it.Person@cac736f, 
			com.k7it.Person@cac736f, com.k7it.Person@5e265ba4]
			
			
			if we want to get meaning full output we need to override the toString();
			output after override toString():
			[{Name:K7iT,Age:27,Height:5.5,Weight:60.25}, 
			{Name:dhanya,Age:25,Height:5.3,Weight:50.25}, 
			{Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:babu,Age:21,Height:5.6,Weight:65.5}]
			
			How to to sort the derived  elements in list:
			============================================

			ArrayList list = new ArrayList();
			Person p1 = new Person(27,"K7iT",5.5,60.25);
			Person p2 = new Person(25,"dhanya",5.3,50.25);
			Person p3 = new Person(22,"aruna",5.6,55.0);
			Person p4 = new Person(25,"giri",5.7,75.0);
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p4);
			list.add(new Person(21,"babu",5.6,65.50));			
			System.out.println("Before sort"+list);
			System.out.println("sorting list without implements comparable interfcae");
			Collections.sort(list);
			System.out.println("After sort:"+list);	
			
			output: 
			[{Name:K7iT,Age:27,Height:5.5,Weight:60.25}, 
			{Name:dhanya,Age:25,Height:5.3,Weight:50.25}, 
			{Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:babu,Age:21,Height:5.6,Weight:65.5}]
			sorting list without implements comparable interfcae
			Exception in thread "main" java.lang.ClassCastException: class com.k7it.Person cannot
			 be cast to class java.lang.Comparable (com.k7it.Person is in unnamed module)
            
            if we want to avoid this class cast exception we should implements Comaprable 
            interface from our derived class i.e class and we should over ride 
            one inherited abstract method inside our person class i.e comapreTo(). this
            method only java jre will use to comapre person class object and sort based 
            on this method return value. 
            
            syntax:
            
                  public int comapreTo(Object obj){
                  // here we can write the our sorting logic based on
                   // which field you want to sort the person objects 
                    //1. first down cast the object type arg into person type
						Person p = (Person)obj;
						//2.  compare current value with parameter obj values and return int value 
						// this is asending order conditon
						// if 1st obj > secon obj = 1
						// if 1st obj < seocnd obj = -1
						// if 1st obj == 2nd obj  = 0
						
						// desending order condtion
						// if 1st obj > secon obj = -1
						// if 1st obj < seocnd obj = 1
						// if 1st obj == 2nd obj  = 0
	 
                    
                  }


			example:
			 ArrayList list = new ArrayList();
			Person p1 = new Person(27,"K7iT",5.5,60.25);
			Person p2 = new Person(30,"dhanya",5.3,50.25);
			Person p3 = new Person(22,"aruna",5.6,55.0);
			Person p4 = new Person(25,"giri",5.7,75.0);
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p4);
			list.add(new Person(21,"babu",5.6,65.50));			
			System.out.println("Before sort"+list);
			System.out.println("sorting list with implements comparable interfcae");
			Collections.sort(list);
			System.out.println("After sort:"+list);
			 outout:
			 
			 	Before sort[
			 	 {Name:K7iT,Age:27,Height:5.5,Weight:60.25},
			 	 {Name:dhanya,Age:30,Height:5.3,Weight:50.25}, 
			 	 {Name:aruna,Age:22,Height:5.6,Weight:55.0},
			 	 {Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			 	 {Name:giri,Age:25,Height:5.7,Weight:75.0},
			 	 {Name:babu,Age:21,Height:5.6,Weight:65.5}]
				sorting list with implements comparable interface
			   After desending order sort:[
				 {Name:dhanya,Age:30,Height:5.3,Weight:50.25},
			 	 {Name:K7iT,Age:27,Height:5.5,Weight:60.25},
			 	 {Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			 	 {Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			 	 {Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			 	 {Name:babu,Age:21,Height:5.6,Weight:65.5}]
			
			

		    How to sort the derived objects  in the list: 
		    ============================================
		    derived data type elements:
		      1. here also we should maintain the same class type object elements      
		          else we will get the ClassCastException
		      2. that class should implements the Comparable interface and we should override
		       the compareTo() which is inherited from comparable interfcae. 
		       
		       
		      drawbacks of Comparable interface:  
			  ======================================
		      1.by using comparable interface we can able 
		      sort based on only one sort condition  at any point of time, for example
		      if we want to sort based on age one place and sort based on name another place
		      or sort based height another place or ascending order one place or descending 
		      order one place etc.   we can't achieve these types requirements. 
		     
		      2. any sorting logic will available only in one class or only one place .
		      
		      in order to over come this drawbacks java people came up with one new interface
		      for sorting support with the name of Comparator, it is also available under 
		      java.util package. 
		      
		     comparator interface is having one abstract method i.e
		     
		      public abstract int compare(Object obj1, Object Obj2);
		      
		      
		                    Comparable 
		                         comapreTo(Object obj) ;
		                    Comparator    
		                          compare(Object obj1,Object obj2); 
		                          
		   steps to implements the sorting technique by using Comparator:
		   ================================================================
		   1. create a sorting class with implementing the comparator interface 
		   
		      public class SortBasedOnAge implements Comparator{
		      }
		      
		   2. override the compare() with required sorting condition 
		   
		   		@Override
				public int compare(Object o1, Object o2) {
					Person p1 = (Person)o1;
					Person p2 = (Person)o2;
					 if(p1.age > p2.age) {
							return 1;
						}else if(p1.age < p2.age) {
							return -1;
						}
						return 0;
				}
		   3. pass this class object as second parameter to collections.sort();
		   
		   Collections.sort(list,new SortBasedOnAge());
		   
		  
			
		   
		   example1: 
		   
		   ArrayList list = new ArrayList();
			Person p1 = new Person(27,"K7iT",5.5,60.25);
			Person p2 = new Person(30,"dhanya",5.3,50.25);
			Person p3 = new Person(22,"aruna",5.6,55.0);
			Person p4 = new Person(25,"giri",5.7,75.0);
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p4);
			list.add(new Person(21,"babu",5.6,65.50));			
			System.out.println("Before sort"+list);
			System.out.println("sorting list with implements comparator interfcae");
			Collections.sort(list,new SortBasedOnAge());
			System.out.println("After sort based on age:"+list);
			Collections.sort(list,new SortBasedOnHeight());
			System.out.println("After sort based on height:"+list);
			Collections.sort(list,new SortBasedOnName());
			System.out.println("After sort based on name:"+list);
			
			
			//TODO 
			output:
			Before sort[
			{Name:K7iT,Age:27,Height:5.5,Weight:60.25}, 
			{Name:dhanya,Age:30,Height:5.3,Weight:50.25}, 
			{Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:babu,Age:21,Height:5.6,Weight:65.5}]
			sorting list with implements comparator interface
			After sort based on age:[
			 {Name:babu,Age:21,Height:5.6,Weight:65.5},
			 {Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			 {Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			 {Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			 {Name:K7iT,Age:27,Height:5.5,Weight:60.25}, 
			 {Name:dhanya,Age:30,Height:5.3,Weight:50.25}]
			After sort based on height:[
			{Name:dhanya,Age:30,Height:5.3,Weight:50.25}, 
			{Name:K7iT,Age:27,Height:5.5,Weight:60.25}, 
			{Name:babu,Age:21,Height:5.6,Weight:65.5}, 
			{Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}]
			After sort based on name:[
			{Name:K7iT,Age:27,Height:5.5,Weight:60.25}, 
			{Name:aruna,Age:22,Height:5.6,Weight:55.0}, 
			{Name:babu,Age:21,Height:5.6,Weight:65.5}, 
			{Name:dhanya,Age:30,Height:5.3,Weight:50.25}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}, 
			{Name:giri,Age:25,Height:5.7,Weight:75.0}]
			
			
		   Drawbacks of ArrayList:
		   ==========================
		   1.in case of random insertion Arraylist will produce very less performance 
		     why because for example list is having 100 elements if we insert one element
		     at 50th index place by using insert(index,value), then new element will insert into
		     50th index, but old element of 50th index to 100th index will shift one step 
		     forward so total element in the list will come 101. shifiting of existing elements
		      are taking more time. 
		       So in case of random insertion ArrayList is not advisable. 
		       
		   Advantage of Arraylist:
		   ==========================
		   1. Arraylist will give the better performance in case of random reading why because 
		   arraylist will works based on index, so it will give the required element from 
		   specified index directly and faster also. 
		   
		   
		   In order to fix the Arraylist Drawbacks java people came up with one new class in 
		   collections i.e LinkedList 
		   
		   LinkedList: LinkedList is one of sub class inside Collection interface, it will works
		   based on pointers. this class will gives the better performance incase of random 
		   insertion why because only 2 nodes will disturb while inserting any element at random 
		   index place.  
		   
		   LinkedList works based on Nodes, each node will contains 2 parts 
		   1. current node value 
		   2. next next node address 
		   
		   
		  
	 */
	
public static void main(String[] args) {
	
			ArrayList list = new ArrayList();
			Person p1 = new Person(27,"K7iT",5.5,60.25);
			Person p2 = new Person(30,"dhanya",5.3,50.25);
			Person p3 = new Person(22,"aruna",5.6,55.0);
			Person p4 = new Person(25,"giri",5.7,75.0);
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p4);
			list.add(new Person(21,"babu",5.6,65.50));			
			System.out.println("Before sort"+list);
			System.out.println("sorting list with implements comparator interfcae");
			Collections.sort(list,new SortBasedOnAge());
			System.out.println("After sort based on age:"+list);
			Collections.sort(list,new SortBasedOnHeight());
			System.out.println("After sort based on height:"+list);
			Collections.sort(list,new SortBasedOnName());
			System.out.println("After sort based on name:"+list);
			
			
	      
	/*	
	  	-> : lamda expression 
	  	
	  	inside foreach loop if we want to keep only one line of code then {} not required
	  	and also single line code no need to end with ;(semicolon). if we want to keep more 
	  	than one line of code in side forEach loop then we should use {} then in side {} 
	  	every line should end with semicolon ;.  
	  	
	  	forEach is one of the stream api as part of the jdk 1.8.
	  	
	  	
	
			*/
	
	//System.out.println(list1);

  	  // list1.replaceAll(e -> e.equals("pranitha") ? "Aruna" :"Latha");
		 
		/* if(e.equals("pranitha")){
			 e = "Aruna";
		 }else {
			 e = "Latha";
		 }
		 */
		// System.out.println("after repalceAll  list1");
		 //System.out.println("list1:"+list1);
		 
	 	
	
	/*
	Object a[] =  new Object[10];
    
    Object obj1 = new Object();
    String s1 = new String("K7it");
    Integer i1 =  new Integer(5);
    
    a[0] = obj1;
    a[1] = s1;
    a[2] = i1;
    a[3] = 1234; //-> auto boxing into Integer class type
    
    Object temp[] =  a;
    a = new Object[20];
    int i=0;
    for(Object obj : a){
       a[i++] = obj;
    }
    
    return a;
    
    
    */
	
	/*ArrayList list = new ArrayList();
	// how to add elements in to AL
	list.add(100);
	list.add(10.12);
	list.add("pranitha");
	list.add(true);
	list.add("giri");
	list.add('a');
	//list.add
	
	System.out.println(list);
	
	// read values 
	System.out.println(list.get(3));
	System.out.println(list.get(5));
	System.out.println(list.get(2));
	//System.out.println(list.get(7));  java.lang.IndexOutOfBoundsException: Index 7 out 
	
	ArrayList list1 = new ArrayList();
	list1.addAll(list);
	System.out.println("new arralist:"+list1);
	System.out.println("size:"+list1.size());
	list1.addAll(3,list);  
	
	
	System.out.println("new arralist after insert into specified index:"+list1);
	System.out.println("size:"+list1.size());
	list1.addAll(3,list1);  
	System.out.println("new arralist after insert into specified index:"+list1);
	System.out.println("size:"+list1.size());
	
	
	 ArrayList list4 = new ArrayList();
		// how to add elements in to AL
	 list4.add(100);
		list4.add(10.12);
		list4.add("pranitha");
		list4.add(true);
		list4.add("giri");
		list4.add('a');
		
System.out.println("before update arralist:"+list4);// [100, 10.12, pranitha, true, giri, a]

list4.set(4,"Gowtham");
list4.set(5,"Aruna");
System.out.println("new arralist:"+list4);//new list :[100, 10.12, pranitha, true, Gowtham, Aruna]
*/
	
	
	
//	 ArrayList list2 = new ArrayList();	 
//	 list2.add("pranitha");
//	 list2.add(true);
//	ArrayList list1 = new ArrayList();
//	list1.add("pranitha");
//	list1.add(true);
//	list1.add("Anu");
//System.out.println("is list1 having all elements of list2:"+list1.containsAll(list2));//true


  

  
}

}
