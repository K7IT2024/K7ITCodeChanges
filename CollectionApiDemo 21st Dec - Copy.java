ackage com.k7it;

import java.util.ArrayList;

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
	               arraylist elements into a another arraylist
				   
	              addAll(int index, collection c):  by using addAll method we can add all elements 
	              from one arraylist elements into a another arraylist at specified index.
	           
	             addAll() : it will take argument type is collection interface, so this method
	             will support for all sub class of collection interface classes elements. 
	             i.e ArrayList, LinkedList,Vector,HashSet,TreeSet,LinkedHashSet,List,Set etc..
	             
	             example: 
	    
	    		ArrayList list = new ArrayList();
				// how to add elements in to AL
				list.add(100);
				list.add(10.12);
				list.add("pranitha");5
				list.add(true);
				list.add("giri");
				list.add('a');
				
				ArrayList list1 = new ArrayList();
				list1.addAll(list);
	
				System.out.println("Old arraylist:"+list); old list: [100, 10.12, pranitha, true, giri, a]
				System.out.println("new arraylist:"+list1);new list :[100, 10.12, pranitha, true, giri, a]
	      Note: addAll(Col): will always append the new elements at ending of the new collection
	                         list.
	                         
	                    list1.addAll(3,list);   
	                    
	                    
	          ArrayList(Collection c): this constructor will perform 2 operations, 
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
	                    
	                    
	        note: 
				  if we want to all more elements in arraylist better to go arraylist 
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
	                       2. copy all 10 elements into a new array
	                       3. add new values into new array
	                       4. return new array to user 
	                        Object temp[] = new Object[10*2];
	                        int i=0
	                        for(Object v: a)
							{
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
	                        ============================================================
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
							         
							      
	         indexOf(Object element): this method will works same as contains method but 
	         if element present it will return that corresponding element index value else 
	         it will return -1;  
	         
	         lastIndexOf(Object element): this method also works same as indexOf() but only
	         difference is index of method scans the element from start to end, but last 
	         index of method will scan for element from end to start.
	         if element present it will return that corresponding element index value else 
	         it will return -1;  
	         
	                   
	        containsAll(collection c): this method will compare one collection to another 
	        collection obj with all elements, if all elements are available in new collection 
	        it will return boolean true else it will return boolean false.
	        
	        
	        
	      
	     
	 */
	
public static void main(String[] args) {
	
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
	
	ArrayList list = new ArrayList();
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



}

}
