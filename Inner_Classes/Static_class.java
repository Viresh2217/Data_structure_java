package Inner_Classes;






public class Static_class {
	private int a=100;
	static int h=459;
	
	static class Inner{
		public void Method() {
		//System.out.println(a);  we can acces only static value
		System.out.println(h);
		}
	     
		
	}
	
	

	public static void main(String[] args) {
		Static_class.Inner I=new Static_class.Inner();
		I.Method();

	}

}
