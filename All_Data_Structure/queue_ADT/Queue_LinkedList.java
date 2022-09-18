package queue_ADT;
class Node{
	private int data;
	private Node next;
	
	public Node(int data,Node ptr) {
		
		this.data=data;
		this.next=next;	
	}
	
	public boolean setData(int val) {
		this.data=data;return true;
	}
	
	public boolean setNext(Node ptr) {
		this.next=ptr;return true;
	}
	
	public int getData() {
		return this.data;
	}
	 
	public Node getNext() {
		return this.next;
	}
		
}

class Queue_List{
	private int front,rear;
	private  int size;
	private Node start;
	
	public Queue_List(){
		this.front=-1;
		this.rear=-1;
		this.start=null;
		this.size=0;
	}
	
	
	
	public void Display() {
		if( rear==-1 || start==null)
			System.out.println("Queue is empty");
		else {
			Node t;
			t=start;
			while(t!=null) {
				System.out.print(" "+t.getData());
				t=t.getNext();
			}
		}
		
	}
	
	
	public boolean enqueue(int val) {
		if(start==null) {
			
				Node k;
				k=new Node(val, null);
				start=k;
				front=0;
				rear++;
				return true;
			}
		else {
		Node n,temp;
		n=new Node(val,null);
		temp=start;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(n);
		
		rear++;
		}
		return true;
	}
	
	
	public boolean dequeue() {
		if(start==null || rear==-1)
			System.out.println("Queue is empty");
		else {
			start=start.getNext();
			rear--;
			if(rear==-1) {
				front=-1;
			}
		}
	
		return true;
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
		size=rear+1;
		return this.size;
	}
	
	
	public boolean deleteQueue() {
		start=null;
		System.out.println("Sucssfully delete all Queue");
		return true;
	}
	
	
	
	
	
	
}


public class Queue_LinkedList {

	public static void main(String[] args) {
		Queue_List r=new Queue_List();
		
           r.enqueue(10);
          
           r.enqueue(30);
           r.enqueue(34);
           r.enqueue(342);
           System.out.println(r.isSize());
        
            r.Display();

	}

}
