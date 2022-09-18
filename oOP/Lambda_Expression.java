package oOP;
/*
// Without Lamda Expression
 * 
@FunctionalInterface
interface Demo3{
	
	public void Show();
	
	
}
class Raw implements Demo3{
	public void Show() {
		System.out.println("Not Used Lambda Expression");
	}
	
}

public class Lambda_Expression {

	public static void main(String[] args) {
		Raw R=new Raw();
		R.Show();

	}
	}
*/
@FunctionalInterface
interface Demo3{
	
	public void Show();
	
}
public class Lambda_Expression {

	public static void main(String[] args) {
		
		Demo3 D=() ->System.out.println("Using Lambda Expression");
		D.Show();
	}
}


