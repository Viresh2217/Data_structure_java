package practies;

import java.io.IOException;

class Iomismatch extends Exception{
	
	public Iomismatch()
	{
		
	}
	public Iomismatch(String to)
	{
		super(to);
	}
	
}


public class CustomException {

	public static void main(String[] args) throws IOException {
		try {
			if(false)
		 throw new Iomismatch("get");
		}catch (Iomismatch ex) {
			System.out.println("Exception Occure");
		}
		}
		

	}


