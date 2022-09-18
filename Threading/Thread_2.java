package Threading;

class Box extends Thread{
	
	public void run()
	
	{
		for (int i=0;i<10;i++) {
		System.out.println("Thraed.....class");
		}
		
	}
	
}

public class Thread_2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		Box x=new Box();
		Thread ab=new Thread(x);
		ab.setPriority(10);
		System.out.println(ab.getPriority());
	     ab.start();
		
		for (int j= 0; j < 10; j++) {
			System.out.println("Main Class.....");
		}
		

	}

}
