package Sorting_Technique;

public class Selection_Sort {
	
	static int min(int k,int...a) {
		int min,loc;
	          min=a[k];
	          loc=k;
		for(int j=k+1;j<a.length;j++) 
		{
			if(min>a[j]) 
			{
				min=a[j];
				loc=j;
				
			}
			
			
		}
		
		return loc;
		
		
	}
	
	
	
	

	public static void main(String[] args) {

            int[] a= {10,23,54,12,5,75};
            
            int temp,loc;
            for(int i=0;i<a.length-1;i++) {
               loc= min(i,a);
              
             
              temp=a[i];
             
             a[i]=a[loc];
            
             a[loc]=temp;
            
          
          
            }
            for(int h:a)
            	System.out.println(" "+h);
		
		
		
		
		

	}

}
