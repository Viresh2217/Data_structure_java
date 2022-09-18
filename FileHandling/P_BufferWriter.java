package FileHandling;

import java.io.*;

public class P_BufferWriter {

	public static void main(String[] args) throws IOException{
	 File t=new File("D:/Demo/VireshBuffer.txt");
	 t.createNewFile();
	 
	 FileWriter t1=new FileWriter("D:/Demo/VireshBuffer.txt");
	 
	 BufferedWriter B=new BufferedWriter(t1);
	 
	 B.write("This is example of buffered writer");
	 B.flush();
	 B.close();
	 FileReader e=new FileReader("D:/Demo/VireshBuffer.txt");
   BufferedReader r=new BufferedReader(e);
      String l=r.readLine();
      while(l!=null)
      {
    	  System.out.println(l);
    	  l=r.readLine();
      }
      
  
   

 	}

}
