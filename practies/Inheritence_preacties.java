package practies;






class A
{
    int i = 10;
    void fun()
    {
        System.out.println("A");
    }
   
}
 
class B extends A
{
    int i = 20;
		
	
    void fun()
    {
        System.out.println("B");
    }
}

 class C extends B
{
   int i = 30;
   void fun()
    {
        System.out.println("C");
    }
	
}

public class Inheritence_preacties
{
    public static void main(String[] args)
    {
       A obj =new B();
      obj.fun();
      

    }
}