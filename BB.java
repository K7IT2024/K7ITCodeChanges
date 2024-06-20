class BB
{
int i;
static int j;
{
System.out.println("IIB1");
}
{
System.out.println("IIB2");
}
static
 {
System.out.println("SIB1:"+j);
}
static
{
System.out.println("SIB2:"+j);
}
public static void main(String args[])
{
System.out.println("main method start");
BB b1=new BB();
BB b2=new BB();
BB b3=new BB();
System.out.println("main method end");
int k =10;
System.out.println(k);
}
}
