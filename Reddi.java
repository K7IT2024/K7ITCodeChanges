
class Reddi {
    int      age;
    String  name;
    String color;
    Double  height;
    Double  weight;
public double getRunRate() {
double runRate = ((height*weight) / age);
return runRate;
}

public static void main(String args[]) {
Reddi A1 = new Reddi();
A1.age = 27;
A1.name = "Elephant";
A1.color = "Brown";
A1.height = 5.4;
A1.weight = 98.0;
double elephantRunRate = A1.getRunRate();
System.out.println("Elephant Details");
System.out.println("Age:" + A1.age);
System.out.println("Name:" + A1.name);
System.out.println("Color:" + A1.color);
System.out.println("Height:" + A1.height);
System.out.println("Weight:" + A1.weight);
System.out.println("RunRate:" + elephantRunRate);
}
}