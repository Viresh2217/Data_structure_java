package Recursion;

// 1- 1/2 + 1/3 -1/4......1/n




public class Negative_Number {
	
	static double  SumSeries(double i,double n,double sum)
	{
		if(i>n)
			return sum;
		else 
		{
			if(i%2==0)
				sum=sum-1/i;
			else
				sum=sum+1/i;
			return(SumSeries(i+1,n,sum));
		}
		
	}
	

	public static void main(String[] args) {
		
		double value=SumSeries(1, 3, 0);
		System.out.printf("%.6f",value);
		
	}

}
