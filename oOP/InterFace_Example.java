package oOP;



interface Child_1{
	int K=10;                       //final static (Can not change its value and initalize at thr time of Declearation)
	public void Properties();       //Abstract Method 
	default  void fun1() {           //Default Function and its body
		System.out.println("Child_1 Function Call");
	}
	
	
}
interface Child_2{
        String name="Viresh Gavarkar";
	public void Attributes();
	 default void  fun2() {
		System.out.println("Child_2 Function call");
	}
	
}
interface Parent extends Child_1,Child_2{
	default  void fun3() {
		System.out.println("Parant Call");
		
	}
}


public class InterFace_Example implements Parent  {
	public void Properties() {
		System.out.println("Child_1 Properies ");
	}
	public void Attributes() {
		System.out.println("Attributes of Child_2");
		
	}

	public static void main(String[] args) {
		Parent sd=new InterFace_Example();
		Child_1 pd=new InterFace_Example();     //Check permutation and Combination of all
		Child_2  kd=new InterFace_Example();
		InterFace_Example IE=new InterFace_Example();
		
		
		
		
		
	}

}
