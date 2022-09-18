package Array;



class ArrayADT{
	private int capacity;
	private int lastIndex;
	int[] a;
	
	public ArrayADT() {
		a =new int[16];
		this.capacity=16;
		lastIndex=-1;
	}
	
	public ArrayADT(int capacity){
		a=new int[capacity];
		this.capacity=capacity;
		lastIndex=-1;
	}
	
	public int getValue(int index)
	{
		if(index>capacity) {
			System.out.println("Invalid index");
			return -1;
		}
			
	     int k=a[index];
		return k;
	}
	public boolean setValue(int value)
	{
		a[++lastIndex]=value;
		
		return true;
		
	}
	public boolean search(int value) 
	{
		for(int i=0;i<=this.capacity-1;i++)
		{
			if(a[i]==value) {
				System.out.println("At Index "+i+"value is present");
				return true;
			}
		}
				System.out.println("Entered value is not present");
			 return false;
			
	}
	
	public boolean setAtPosition(int val,int pos) {
		
			for(int j=lastIndex;j>=pos-1;j--) {
				
			a[j+1]=a[j];
			
			}
		lastIndex++;
		a[pos-1]=val;
			
		
		return true;
	}
	
	
	public boolean delete(int value)
	{
		
		for(int i=0;i<=this.capacity-1;i++)
		{
			if(a[i]==value) 
			{
			for(int j=i;j<=lastIndex;j++) 
	        	  a[j]=a[j+1];
			    lastIndex--;
			   return true;
			}
		}
			
				System.out.println("Number not found in Array");
			
			return false;
	   	
    }	
		
		public void  display() {
			
		for(int h:a)
			System.out.print(h+" ");
		System.out.println();
		}
		public void reverse() {
			for(int i=this.lastIndex;i>=0;i--)
				System.out.print(a[i]+" ");
		}
				
}


public class Array_ADT {

	public static void main(String[] args) {
		ArrayADT A=new ArrayADT(10);
		
		A.setValue(10);
		A.setValue(20);
		A.setValue(30);
	
		A.setValue(56);
		
		A.setAtPosition(40, 2);
	    A.display();
	    
		

	}

}
