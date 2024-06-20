class BabuReddy
{
int age;
String name;
static int legs;
static String food;
}
class BabuReddyManager
{
public static void main(String args[])
{
BabuReddy b1=new BabuReddy();
b1.age=30;
b1.name="babu";
b1.legs=2;
b1.food="rice";
BabuReddy b2=new BabuReddy();
b2.age=26;
b2.name="Kumar";
BabuReddy b3=new BabuReddy();
b3.age=24;
b3.name="Sai";
b3.legs=6;
b3.food="Biryani";
System.out.println(b1.age);
System.out.println(b1.name);
System.out.println(b1.legs);
System.out.println(b1.food);
System.out.println(b2.age);
System.out.println(b2.name);
System.out.println(b2.legs);
System.out.println(b2.food);
System.out.println(b3.age);
System.out.println(b3.name);
System.out.println(b3.legs);
System.out.println(b3.food);
}
}
