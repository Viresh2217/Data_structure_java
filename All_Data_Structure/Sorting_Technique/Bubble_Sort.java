package Sorting_Technique;
import java.util.*;





public class Bubble_Sort {
	
	static void Bubble(int...a) {
		int temp,round;
		
		for(round=1;round<=a.length-1;round++ )
		for(int i=0;i<=a.length-1-round;i++)
		{
		if(a[i]>a[i+1]) 
		{
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		}
		
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner pc=new Scanner(System.in);
		
		System.out.println("Enter a array element");
		int a[] =new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=pc.nextInt();
		}
		Bubble(a);
		for(int H:a)
			System.out.print(" "+H);
		
		

	}

}
