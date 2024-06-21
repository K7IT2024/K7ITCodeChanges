class Person{
int age;
String name;
double weight;
double height;
public double getRunRate(){
double runRate = (height*weight/age);
return runRate;
}
public static void main(String args[]){
Person p1 = new Person();
p1.age = 24;
p1.name = "Reddi";
p1.weight = 51;
p1.height = 5.4;
double reddiRunRate = p1.getRunRate();
System.out.println("Reddi Details");
System.out.println("Age:" + p1.age);
System.out.println("Name:" + p1.name);
System.out.println("Weight:" + p1.weight);
System.out.println("Height:" + p1.height);
System.out.println("reddiRunRate:"+ reddiRunRate);
}
}



