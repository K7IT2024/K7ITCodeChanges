class K7IT{
int noOfStudents;
String teacherName;
static int noOfTeachers;
K7IT(){
System.out.println("k1.name");
System.out.println("k2.name");
}
public static void main(String args[]){
K7IT k1=new K7IT();
K7IT k2=new K7IT();
k1.noOfStudents=15;
k1.teacherName="Keshav";
k1.noOfTeachers=2;
k2.noOfStudents=10;
k2.teacherName="Dhanyavani";
k2.noOfTeachers=5;
System.out.println("noOfStudents:"+k1.noOfStudents);
System.out.println("teacherName:"+k2.teacherName);
System.out.println("noOfTeachers:"+k1.noOfTeachers);
System.out.println("noOfTeachers:"+k2.noOfTeachers);
System.out.println("teacherName:"+k1.teacherName);
}
} 
