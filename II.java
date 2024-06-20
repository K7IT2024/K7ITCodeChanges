class II
{

II(int i)
{
	
System.out.println(" int type constructor");
}
II(int i ,int j)
{
	this(200);
System.out.println("int and int type constructor");
}
II(String s,int k)
{
	this(30,20);
System.out.println("String and int type connstructor");
}
public static void main (String args[])
{
II a1=new II(200);
II a2=new II(30,20);
II a3=new II("Tharun",89);
}
}
