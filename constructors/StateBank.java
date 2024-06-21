public class StateBank{
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