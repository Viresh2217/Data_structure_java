package practies;
import java.util.Scanner;

public class MyConsole {
     static Scanner pc=new Scanner(System.in);
 public static String getString( String name)
{
	System.out.println(name);
	return pc.nextLine();
}
 public static int getNumber(String question) {
 	System.out.println(question);
 	return pc.nextInt();
 }
	public static String getCharter() {
		return pc.nextLine();
	}

}
