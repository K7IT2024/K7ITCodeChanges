class ReddiScooty {
String name;
int time;
int distance;
String color;
double weight;
static int breaks;
public double getAverageSpeed(){
double averageSpeed = (distance/time);
return averageSpeed;
}
public static void main(String args[]){
ReddiScooty S1 = new ReddiScooty();
S1.name = "Jupiter";
S1.color = "Brown";
S1.time = 120;
S1.distance = 230;
S1.weight = 96.7;
S1.breaks = 2;
double jupiterAverageSpeed = S1.getAverageSpeed();
System.out.println("Reddi Scooty Details");
System.out.println("Name:" +S1.name);
System.out.println("color:" + S1.color);
System.out.println("Time:" + S1.time);
System.out.println("Distance:" + S1.distance);
System.out.println("weight:" + S1.weight);
System.out.println("Breaks:" + S1.breaks);
System.out.println("AverageSpeed:" + jupiterAverageSpeed);
}
}
