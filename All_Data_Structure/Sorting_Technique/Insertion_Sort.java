package Sorting_Technique;

public class Insertion_Sort {
	
	public static void insertio_sort(int ...a) {
		
		int temp,j;
		
		for(int i=1;i<a.length;i++) {
			
			temp=a[i];
			for( j=i-1;j>=0 && temp<a[j];j--) {
				        a[j+1]=a[j];
			}
						a[j+1]=temp;
			
		}
		
	}
	
	public static void main(String[] args) {

		int a[]= {121,34,56,78,344};
		
		insertio_sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}

		
		
		
		
	}

}
