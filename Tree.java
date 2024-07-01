class Tree{
int age;
String name;
String colour;
double height;
double weight;
static int roots;
static int branches;

public static void main(String args[]){
Tree t1 = new Tree();
t1.age = 20;
t1.name = "mango";
t1.colour = "green";
t1.height = 6.6;
t1.weight = 99.9;
t1.roots = 100;
t1.branches = 99;

Tree t2 = new Tree();
t2.age = 10;
t2.name ="orange";
t2.colour = "light green";
t2.height = 4.4;
t2.weight = 3.4;
t2.roots = 30;
t2.branches = 20;


System.out.println("mango details");
System.out.println("age:"+ t1.age);
System.out.println("name:"+ t1.name );
System.out.println("colour:"+ t1.colour);
System.out.println("height:"+ t1.height);
System.out.println("weight:"+ t1.weight);
System.out.println("roots:"+ t1.roots);
System.out.println("branches:"+ t1.branches);

System.out.println("orange details");
System.out.println("age:"+ t2.age);
System.out.println("name:"+ t2.name );
System.out.println("colour:"+ t2.colour);
System.out.println("height:"+ t2.height);
System.out.println("weight:"+ t2.weight);
System.out.println("roots:"+ t2.roots);
System.out.println("branches:"+ t1.branches);

 
}

}