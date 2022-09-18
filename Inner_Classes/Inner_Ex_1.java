package Inner_Classes;

// Reletionship between outer class and inner class is HAS-a Relationship

class Outer_BOX{
	
	
	
	class Inner_BOX{
		
		
		public void Method() {
			System.out.println("Inner Method");
		}
		
		
		
	}
	
	
	
	
}





public class Inner_Ex_1 {
	
	public static void main(String[] args) {
		new Outer_BOX().new Inner_BOX().Method();

	}

}
