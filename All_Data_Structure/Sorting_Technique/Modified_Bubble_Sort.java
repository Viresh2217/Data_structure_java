package Sorting_Technique;



import Recursion.Myconsole;

public class Modified_Bubble_Sort {
	
	static void Bubble(int...a) {
		int temp,flag;
		
		for(int round=1;round<=a.length-1;round++) {
			 flag=0;
			for(int i=0;i<=a.length-1-round;i++) {
				if(a[i]>a[i+1])
				{
					flag=1;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				if(flag==0) {
					System.out.println("Round "+round);
					return;
				}
			}
			
		}
		
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=Myconsole.getNumber("Enter a size of array");
        int[] arr=new int[k];
        
        for(int a=0;a<arr.length;a++) {
        	arr[a]=Myconsole.getNumber("Enter a array element");
        }
        Bubble(arr);
        for(int H:arr) {
        	System.out.print(" "+H);
        }
		
	}

}
