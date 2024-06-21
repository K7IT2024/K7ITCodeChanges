class Marriage{
String brideName;
String groomName;
int noOfRelatives;
int noOfItems;
double brideHeight;
double groomHeight;
int totalArea;
int areaPerSeat;
public int getSeatingCapacity(){
int seatingCapacity = (totalArea/areaPerSeat); 
return seatingCapacity;
}

public class MarriageManager{
public static void main(String args[]){
Marriage m1 = new Marriage();
m1.brideName = "Ravi";
m1.groomName = "Jamuna";
m1.noOfRelatives = 500;
m1.noOfItems = 15;
m1.brideHeight = 5.5;
m1.groomHeight = 6.0;
m1.totalArea=480;
m1.areaPerSeat=1;
int seatingCapacity = m1.getSeatingCapacity();
 System.out.println("brideName:"+m1.brideName);
System.out.println("groomName:"+m1.groomName);
System.out.println("no.of.relatives:"+m1.noOfRelatives);
System.out.println("no.of.items:"+m1.noOfItems);
System.out.println("brideHeight:"+m1.brideHeight);
System.out.println("groomHeight:"+m1.groomHeight);
System.out.println("getSeatingCapacity:"+seatingCapacity);

}

}

}

