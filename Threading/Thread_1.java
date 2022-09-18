package Threading;

class MythreadClass extends Thread{
	
	public void run()
	{
		
		for
		(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			
			
		}
		
	}
	
	
	
}




public class Thread_1 {

	public static void main(String[] args) throws InterruptedException  {
		
		MythreadClass MY=new MythreadClass();
		MY.run();
		
		for(int i=0;i<5;i++)
		{
		System.out.println("main thread");
		}
		
		

	}

}
