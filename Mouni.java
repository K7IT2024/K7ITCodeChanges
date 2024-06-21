class Mouni{
int age;
String name;
double height;
double weight;
static int noOfLegs;
static String foodType;
Mouni(){
System.out.println("");
System.out.println("m2.foodType");
System.out.println("m2.height");
}
public static void main(String args[]){
Mouni m1=new Mouni();
m1.age=25;
m1.height=5.5;
m1.weight=65.0;
m1.noOfLegs=2;
m1.foodType="rice";
Mouni m2=new Mouni();
m2.age=26;
m2.height=5.9;
m2.weight=75;
m2.noOfLegs=3;
System.out.println("m2.noOfLegs"+m2.noOfLegs);
}
}
