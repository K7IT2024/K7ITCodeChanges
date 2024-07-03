class chinnu{
int age;
String name;
String colour;
double height;
double weight;
double getRunRate(){
double runRate = (height * weight)/ age;
return runRate;
}

public static void main(String args[]){
chinnu c1 = new chinnu ();
c1 .age = 27;
c1.name = "jack";
c1.colour ="white";
c1.height = 6.9;
c1.weight =  65.5;
double jackRunRate = c1.getRunRate();
System.out.println("jack details");
System.out.println("name:"+c1.name);
System.out.println("age:"+c1.age);
System.out.println("colour:"+c1.colour);
System.out.println("height:"+c1.height);
System.out.println("weight:"+c1.weight);
System.out.println("RunRate:"+jackRunRate);
}
}