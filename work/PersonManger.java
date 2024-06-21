class Person{
int age;
String name;
double height;
double weight;
String colour;
   
double getrunrate(){
double   runrate = ((height*weight)/age);
return  runrate;
}
}

class PersonManager{
public static void main (String args[]){
Person p1 = new Person();
p1.age = 20;
p1.name = "tharun";
p1.height = 20.40;
p1.weight = 20.40;
p1.colour = "Brown";

System.out.println("Person details");

System.out.println("Age:"+p1.age);


System.out.println("Name:"+p1.name);

System.out.println("Height:"+p1.height);

System.out.println("Weight:"+p1.weight);

System.out.println("Colour:"+p1.colour);

System.out.println("Person details");

}

}
