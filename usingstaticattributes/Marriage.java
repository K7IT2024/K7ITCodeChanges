class Marriage{
static String brideName;
static String groomName;
int brideAge;
double brideHeight;
int totalPeople;
int perPerson;
int getEatingCapacity(){
int eatingCapacity=totalPeople*perPerson;
return eatingCapacity;
}
public static void main(String args[]){
Marriage m1=new Marriage();
int m1eatingCapacity=m1.getEatingCapacity();
m1.brideName="vinu";
m1.groomName="divya";
m1.brideAge=25;
m1.brideHeight=5.2;
m1.totalPeople=200;
m1.perPerson=1;
Marriage m2=new Marriage();
int m2eatingCapacity=m2.getEatingCapacity();
m2.brideName="mouni";
m2.groomName="prasad";
m2.brideAge=26;
m2.brideHeight=5.1;
m2.totalPeople=300;
m2.perPerson=1;
System.out.println("m1 details");
System.out.println("brideName:"+m1.brideName);
System.out.println("groomName:"+m1.groomName);
System.out.println("brideAge:"+m1.brideAge);
System.out.println("brideHeight:"+m1.brideHeight);
System.out.println("totalPeople:"+m1.totalPeople);
System.out.println("perPerson:"+m1.perPerson);
System.out.println("m2 details");
System.out.println("brideName:"+m2.brideName);
System.out.println("groomName:"+m2.groomName);
System.out.println("brideAge:"+m2.brideAge);
System.out.println("brideHeight:"+m2.brideHeight);
System.out.println("totalPeople:"+m2.totalPeople);
System.out.println("perPerson:"+m2.perPerson);
}
}