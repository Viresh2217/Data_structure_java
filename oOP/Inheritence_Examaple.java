	package oOP;
	
	//We Can use father and his children example in every Inheritance 
	
	
	/*
	 Single Inheritance
class A{
	String name="Viresh gavarkar";
	void Show() {System.out.println(name);}	
}


public class Inheritence_Examaple extends A {
	public static void main(String[] args) {
		Inheritence_Examaple IE=new Inheritence_Examaple();
		IE.Show();   //Inheriate Property of paratnt

	}

}


	Multilevel Inheritance

	class A	
	{
		int a=19;
		void Show() {System.out.println(a);}
	}
	class B extends A{
		int k=12;
		void showB() {System.out.println(k);}
		
	}
	
	public class Inheritence_Examaple extends B {
		public static void main(String[] args) {
			Inheritence_Examaple IE=new Inheritence_Examaple();
			IE.a=20;
			IE.k=20;
			IE.Show();
			IE.showB();
		}

	}
	*/
	//Hierarchical Inheritance
	class A{
		int l=23;
		void Show_A() {System.out.println(l);}
		
		
	}
	class B extends A{
		int j=90;
		void Show_B() {System.out.println(j);}
		
	}
			
	public class Inheritence_Examaple extends A {
		public static void main(String[] args) {
			Inheritence_Examaple IE=new Inheritence_Examaple();
			
			IE.Show_A();
			IE.l=34;
			B b=new B();
			b.Show_A();
			b.Show_B();
			
		}

	}
	
	