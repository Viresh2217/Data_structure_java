package Searching;

public class Linear_Search {
	
	public static boolean Linear_Search(int key,int...k) {
		for(int i=0;i<k.length;i++) {
		if(k[i]==key) {
			System.out.println("Number Found at index "+i);
			return true;
		}
		
		}
		System.out.println("Number not found");
		return false;
		
		
	}
	

	public static void main(String[] args) {
		
      int[] a=new int[10];
      for(int i=0;i<10;i++) {
    	  a[i]=(i+1)*10;
    	  System.out.println(a[i]);
      }
      int value=50;
      Linear_Search(value,a);

		
		

	}

}
