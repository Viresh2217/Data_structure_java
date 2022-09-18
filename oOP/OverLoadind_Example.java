package oOP;

// we can overload method by 1  method is in paraent and other is in child.it also called as overlaoding



class Shapes{
	         public double Area(double r) {  ///area of circle
		    double Area=3.14*r*r;
		    System.out.println("Area of Circle is: "+Area);
		    return  Area;
	         }
	       
	public double Area(double L,double B ) 
	     {// area of Rectangle
		
		   double Area =L*B;
		   System.out.println("Area of Rectangle :"+Area);
		   return Area;
	     }
	
	
}


public class OverLoadind_Example {

	public static void main(String[] args) {
		Shapes S=new Shapes();
		//new Shapes().Area(3.8); Another way of calling method
		S.Area(6);
		S.Area(6, 5);
		

	}

}

