class Vehicle{
String name;
int tyres;
double weight;
static int steering;
double engineCapacity;
public double getHorsePower(){
double horsePower=(tyres*engineCapacity/weight);
return horsePower;
}
public static void main(String args[]){
Vehicle v1=new Vehicle();
v1.name="nisssan";
v1.tyres=4;
v1.weight=5000;
v1.steering=1;
v1.engineCapacity=5.5;
double v1horsePower=v1.getHorsePower();
Vehicle v2=new Vehicle();
v2.name="honda";
v2.tyres=5;
v2.weight=4000;
v2.steering=2;
v2.engineCapacity=4.5;
double v2horsePower=v2.getHorsePower();
System.out.println("v1 details");
System.out.println("name:"+v1.name);
System.out.println("tyres:"+v1.tyres);
System.out.println("weight:"+v1.weight);
System.out.println("steering:"+v1.steering);
System.out.println("engineCapacity:"+v1.engineCapacity);
System.out.println("name:"+v2.name);
System.out.println("name:"+v2.name);
System.out.println("tyres:"+v2.tyres);
System.out.println("weight:"+v2.weight);
System.out.println("steering:"+v2.steering);
System.out.println("engineCapacity:"+v2.engineCapacity);
}
}
 