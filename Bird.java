class Bird{
String name;
String color;
int lifeTime;
static int legs;
static int wings;
static String foodType;
public static void main(String args[]){
Bird b1=new Bird();
b1.name = "parrot";
b1.color = "green";
b1.lifeTime = 20;
b1.legs = 2;
b1.wings =2;
b1.foodType="grains";
Bird b2=new Bird();
b2.name = "swan";
b2.color = "white";
b2.lifeTime = 12;
b2.foodType = "seeds";
System.out.println("b1 details:");
System.out.println("name:"+b1.name);
System.out.println("color:"+b1.color );
System.out.println("lifetime:"+b1.lifeTime);
System.out.println("legs:"+ b1.legs);
System.out.println("wings:"+b1.wings);
System.out.println("foodType:"+b1.foodType);
System.out.println("b2 details:");
System.out.println("name:"+b2.name);
System.out.println("color:"+b2.color );
System.out.println("lifetime:"+b2.lifeTime);
System.out.println("legs:"+ b2.legs);
System.out.println("wings:"+b2.wings);
System.out.println("foodType:"+b2.foodType);



}

}