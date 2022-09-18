package Recursion;

public class TowerOFHanoi {
	
	static void TOH(int n,char start	,char middle,char end) {
		if(n==1)
			System.out.println("Disk from "+start+ " to "+end);
		else {
			TOH(n-1,start,end,middle);
			System.out.println("Disk From "+start+" to "+end);
			TOH(n-1,middle,start,end);
		}
		
	}
	

	public static void main(String[] args) {

		int n=Myconsole.getNumber("Enter a number of Disk");
		
		TOH(n,'S','M','E');
		


	}

}
