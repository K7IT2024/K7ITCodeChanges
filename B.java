class A
{
  int i=10;
  int j=20;
}

class B extends A
{
  int j=40;

  static void m1()
  {
    System.out.println(this.i);
    System.out.println(super.j);
  }

  public static void main(String Args[])
  {
   B.m1();
  }
}