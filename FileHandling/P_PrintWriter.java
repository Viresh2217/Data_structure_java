package FileHandling;
import java.io.*;
public class P_PrintWriter {

	public static void main(String[] args)throws IOException {
		File g=new File("D:/Demo/Viresh123.txt");
		g.createNewFile();
		FileWriter fk=new FileWriter("D:/Demo/Viresh123.txt");
		PrintWriter P=new PrintWriter(fk);
		
		P.write(100);//here chractor will print becoze write return char type value only and print take and return same value
		P.println(100);
		P.flush();
		P.close();
		

	}

}
