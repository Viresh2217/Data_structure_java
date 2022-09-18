package Threading;



//Runnable Threading with join and sleep and yield
class Right implements Runnable{
	
	@Override
	public void run() {
	 for(int i=0;i<10;i++)
		 
		 System.out.println("Runnalble Class ......");
		
	}
	
}
public class Thraed_3 {

	public static void main(String[] args) throws InterruptedException {
		Right R=new Right();
		Thread ad=new Thread(R);
		
		ad.start();
		ad.join();
		for(int j=0;j<10;j++)
		{
			Thread.sleep(1000);
			System.out.println("Main Class......");
		}

	}

}
