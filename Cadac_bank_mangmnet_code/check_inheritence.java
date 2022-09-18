package Day_1;

class A{
	
	void fun1() {
	System.out.println("Class A");
	}
}
class B extends A
{
	void fun2() {
	System.out.println("Class B");
	}
}



public class check_inheritence {

	public static void main(String[] args) {
		A obj=new A();
		obj.fun1();
		// TODO Auto-generated method stub

	}

}
