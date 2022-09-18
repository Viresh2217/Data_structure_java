package Searching;

public class Binary_Search {

	public static boolean Binary_Search(int key,int ...a)
	{
		int l=0,u=a.length-1,m;
		
		while(l<=u) {
		m=(l+u)/2;                              
		if(a[m]==key) 
		{
			System.out.println("Found element at index "+m);
			return true;
	    }
		else if(a[m]<key)
			     l=m+1;  
		    else u=m-1;
			
		}
		System.out.println("Not Found");
		return false;
	}
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};    
		
		int value=50;
		Binary_Search(value,a);
		

	}

}
