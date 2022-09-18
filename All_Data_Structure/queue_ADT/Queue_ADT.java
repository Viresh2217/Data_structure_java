package queue_ADT;


class Queue{
	private int capacity;
	private int front,rear;
	private int[] a;
	
	public Queue() {
		a=new int[10];
		this.front=-1;
		this.rear=-1;
		this.capacity=10;
	}
	public Queue(int size) {
		a=new int[size];
		this.front=-1;
		this.rear=-1;
		this.capacity=size;	
	}
	public boolean enqueue(int value) {
		if(a==null && front==-1 && rear==-1)
			System.out.println("Queue is empty");
			else {
				front=0;
				a[++rear]=value;	
			}
		return true;
	}
	public boolean dequeue() {
		if(a==null)
			System.out.println("Queue is Empty");
		else {
			for(int i=front;i<=rear;i++)
			a[i]=a[i+1];
		    rear--;
		}
		return true;
	}
	public void Display() {
		if(a==null)
			System.out.println("Queue is empty");
		else {

               for(int i=front;i<=rear;i++)
				System.out.print(" "+a[i]);
		}
	}
	public boolean isempty() {
		if(rear==-1)
			System.out.println("Queue is Empty");
		else {
			System.out.println("Queue is Not Empty");
		}
		return true;
	}
	public int isSize() {
		return this.capacity;
	}
	public int  isFull() {
		if(rear==capacity-1)
			System.out.println("Queue is Full");
		else {
			int k=(capacity-1)-rear;
			System.out.println("Now you entered another "+k+" element");
		}
		return rear;
	}
	public boolean deleteQueue() {
		a=null;
		System.out.println("Sucssfully delete all Queue");
		return true;
	}
	
	
	
}


public class Queue_ADT {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(13);
		q.enqueue(34);
		q.enqueue(56);
		q.enqueue(78);
		q.dequeue();
		q.isempty();
		q.isFull();
		q.deleteQueue();
		q.Display();
		
		
	}

}
