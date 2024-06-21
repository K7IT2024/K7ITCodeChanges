class StateBank{
int accountNumber;
String accountHolder;
String address;
static int noOfBranches;
StateBank(){
System.out.println("s1.address");
System.out.println("s2.accountNumber");
}
public static void main(String args[]){
StateBank s1=new StateBank();
StateBank s2=new StateBank();
s1.accountNumber=32140764;
s1.address="renigunta";
s1.noOfBranches=2;
s2.accountNumber=23456126;
s2.noOfBranches=4;
System.out.println("noOfBranches:"+s1.noOfBranches);
System.out.println("noOfBranches:"+s2.noOfBranches);
}
}
public class AndhraBank{
int accountNumber;
String accountHolder;
String address;
static int noOfBranches;
AndhraBank(){
System.out.println("a1.address");
System.out.println("a2.accountNumber");
}
public static void main(String args[]){
AndhraBank a1=new AndhraBank ();
AndhraBank a2=new AndhraBank ();
a1.accountNumber=32140764;
a1.address="renigunta";
a1.noOfBranches=2;
a2.accountNumber=23456126;
a2.noOfBranches=4;
System.out.println("noOfBranches:"+a1.noOfBranches);
System.out.println("noOfBranches:"+a2.noOfBranches);
}
}