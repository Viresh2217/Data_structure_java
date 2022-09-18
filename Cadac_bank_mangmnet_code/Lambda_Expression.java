package Day_1;
interface Arr{
	
	public void show();
}
/*
class Raw implements Arr{
	
	public void show() {
		System.out.println("Without Lambada Expression");
		
	}
	
}
*/

public class Lambda_Expression {

	public static void main(String[] args) {
		
		//Raw R=new Raw();
		Arr A=() ->System.out.println("With Lambda Expression");
		A.show();
	}

}
