package FileHandling;

import java.io.*;

public class P_WriteFile {

	public static void main(String[] args) throws IOException {
		File F=new File("D:/Demo/Demo1.txt");
		F.createNewFile();
		
		
		         
		FileWriter fw=new FileWriter(F,true);
		fw.write("Viresh Gavarkar\n");
		fw.write("99\n");//adding a single character
		fw.write("Kartik\nsoftware solutions");
		fw.write("\n");
		char[] ch={'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();

	}

}
