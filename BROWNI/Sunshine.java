class Sunshine{
int age;
String name;
String colour;
double height;
double weight;
public double getRunRate(){
double runRate = (height*weight/age);
return runRate;
}
public static void main(String args[]){
	Sunshine s1 = new Sunshine();
	s1.age = 29;
	s1.name =" hope";
	s1.colour = "cream";
	s1.height = 6.0;
	s1.weight = 67.7;
double hopeRunRate = s1.getRunRate();

System.out.println("hope details");
System.out.println("age:"+s1.age);
System.out.println("name:"+s1.name);
System.out.println("colour:"+s1.colour);
System.out.println("height:"+s1.height);
System.out.println("weight:"+s1.weight);

System.out.println("RunRate:"+hopeRunRate);
}
}