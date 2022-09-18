package FileHandling;
import java.io.*;
public class P_FileHand {

	public static void main(String[] args) throws IOException {
		
File t=new File("java file program");
System.out.println(t.exists());
t.mkdir();
File t1=new File("java file program","viresh.txt");
t1.createNewFile();
System.out.println(t.exists());
File f1=new File("E:/Java program/ban");
System.out.println(f1.isFile());
File f2=new File("E:/Java program/copt.txt");
      f2.createNewFile();
		f2.delete();


	}

}
