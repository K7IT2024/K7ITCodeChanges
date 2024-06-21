class School{
int strength;
String schoolName;
static int teachers;
School(){
System.out.println("s1.strength");
System.out.println("s2.schoolName");
}
public static void main(String args[]){
School s1=new School();
s1.strength=1000;
s1.schoolName="Bapuji";
s1.teachers=20;
School s2=new School();
s2.strength=300;
s2.schoolName="Primary";
s2.teachers=30;
System.out.println("teachers:"+s1.teachers);
System.out.println("schoolName:"+s2.schoolName);
}
}