package Stack;
class Node{
	private int data;
	private Node next;
	
	public Node() {
		this.data=0;
		this.next=null;	
	}
	public Node(int value,Node ptr) {
		this.data=value;
		this.next=ptr;
	}
	public boolean setData(int val) {
		this.data=val;
		return true;
	}
	public boolean setNext(Node ptr) {
		this.next=ptr;
		return true;
	}
	public int getData() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}	
}
class Stack1{
	private int top;
	private int capacity;
	private Node start;
	
	public Stack1() {
		this.top=0;
		this.capacity=0;
		this.start=null;
	}
	
	
	public boolean push(int val) {
		Node n,t;
		n=new Node();
		n.setData(val);
		t=start;
		if(start==null) {
		   start=n;
		   top++;
		}
		else{
			for(int i=1;i<top;i++) {
				t=t.getNext();	
			}
			t.setNext(n);
              top++;
              capacity++;

		}
	        	
		
		return true;
		
	}
	public void Display() {
		if(start==null)
			System.out.println("Stack is empty");
		Node N;
		N=start;
		while(N!=null) {
			System.out.print(" "+N.getData());
			N=N.getNext();
		}
		
		
	}
	public void Pop() {
		Node V,k;
		V=start;
		if(start==null)
			System.out.println("Stack is empty");
		else if(start.getNext()==null) {
			start=null;
			
		}
		else {
			for(int i=1;i<top-1;i++) {
				V=V.getNext();	
			}
			V.setNext(null);
		}
		top--;
	
	}
	
	
	public int peek() {
		if(start==null)
			System.out.println("Stack is empty");
		if(start.getNext()==null)
			return(start.getData());
		else {
			Node K;
			K=start;
			for(int i=1;i<top;i++) {
				K=K.getNext();
			}
			return(K.getData());
		}
		
	}
	
	public boolean deleteStack() {
		start=null;
		System.out.println("Sucessfuly Delete all element in stack");
		return true;
	}
	

}



public class Stack_Using_LinkList {

	public static void main(String[] args) {
		Stack1 S=new Stack1();
		
		
		S.push(32);
		S.push(56);
		S.push(34);
		S.push(354);
		
		System.out.println(S.peek());
		S.Pop();
		
		S.Display();
		
		
		
	}

}
