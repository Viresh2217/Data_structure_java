package oOP;


class Course{
	//private Subject
	
	
	
}


public class Shallow_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30,40,50,60,70};
		int[] b={80,90};
		a=b;//(valid)
		
		b=a;//(valid)
		System.out.print(b[0]);
		

	}

}
