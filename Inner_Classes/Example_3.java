package Inner_Classes;
class Box{
	
	public void Method() {
		
		class Inner_class{
			
			public void Method(int a,int b) {
				
				int c=a+b;
				System.out.println("Sum is "+c);
			}
		}
			 Inner_class I=new Inner_class();
			 I.Method(12,8);
		
		//in method Scope.........
	}
	//in class Scope...........
	
}




public class Example_3 {

	public static void main(String[] args) {
		new Box().Method();

	}

}
