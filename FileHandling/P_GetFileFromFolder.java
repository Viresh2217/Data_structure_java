package FileHandling;

import java.io.File;
import java.io.IOException;

public class P_GetFileFromFolder {

	public static void main(String[] args)throws IOException {

		File F=new File("E:/Java program");
		String[] S1=F.list();

       for(String P:S1)
       {
    	   System.out.println(P);
       }
       
       File F2=new File("D:/Demo/DemoFile");
              F2.createNewFile();
       System.out.println(F2.isFile());
       File F3=new File("E:\\c program visual stdio");
       
       String[] S2= F3.list();
       for(String r:S2)
       {
    	   System.out.println(r);
       }
       


	}

}
