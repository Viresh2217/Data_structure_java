package oOP;

public class Dummy {



	public static void main(String[] args)  {
		
		int[] x= new int[3];
		for(int i=0;i<x.length;i++) {
			x[i]=i+10;
		}

        int []k=new int[3];
        k=x;
        k[0]=122;
        for(int h:x)
        	System.out.println(" "+h);
		
	
}
}

/*
Dummy c = null;
while(true) {
	c = new Dummy();
	System.out.println("Helo");
Thread.sleep(5000);
}
*/