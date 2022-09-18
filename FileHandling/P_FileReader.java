package FileHandling;
import java.io.*;
public class P_FileReader {

	public static void main(String[] args)throws IOException {
		
		File FO=new File("D:/Demo/Viresh.txt");
		      FO.createNewFile();
		      System.out.println(FO.isFile());
		      
		      FileWriter W=new FileWriter(FO);
		      W.write("I am Student of CDAC MUMBAI");
		      W.flush();
		      W.close();
            		
			
		FileReader FR =new FileReader(FO);
		
		char[] ch=new char[(int)FO.length()];
		       FR.read(ch);
		       
		       for(char ch2: ch)
		       {
		    	   System.out.print(ch2);
		       }
		
		
		

	}

}
