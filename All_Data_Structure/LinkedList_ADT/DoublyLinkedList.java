package LinkedList_ADT;



class Node{
	private int data;
	private Node next;
	private Node prev;
	
	public Node() {
		this.data=0;
		this.next=null;
		this.prev=null;
	}
	public Node(int val,Node next,Node prev) {
		this.data=val;
		this.next=next;
		this.prev=prev;
	}
	
	public boolean setData(int val) {
		this.data=val;
		return true;
	}
	public boolean setNext(Node next) {
		this.next=next;
		return true;
	}
	public boolean setPrev(Node prev) {
		this.prev=prev;
		return true;
	}
	public int getData() {return this.data;}
	public Node getNext() {return this.next;}
	public Node getPrev() {return this.prev;}
	
	
	
}
class DoublyList{
	private int size;
	private Node start;
	
	public DoublyList() {
		this.size=0;
		this.start=null;
	}
	
	public boolean isEmpty() {
		if(start==null || size==0)
			System.out.println("List is empty");
		return true;
	}
	public int getListSize() {
		return this.size;
	}
	public void viewList() {
		if(start==null)
			System.out.println("List is empty");
		else {
			Node t;
			t=start;
			for(int i=1;i<=size;i++) {
				System.out.print(" "+t.getData());
				t=t.getNext();
			}
			
		}
		
	}
	
	public void insertFirst(int val) {
		Node n;
		n=new Node();
		n.setData(val);
		if(start==null){
			start=n;
			
		}
		else {
			Node t;
			t=start;
			start.setPrev(n);
			n.setNext(t);
			start=n;
			
		}
		size++;
		
	}

	
	public void insertLast(int val) {
		Node k;
		k=new Node();
		k.setData(val);
		if(start==null) {
			start=k;
			
		}
		else {
			Node temp;
			temp=start;
			
			for(int i=1;i<size;i++) {
				temp=temp.getNext();
			}
			temp.setNext(k);
			k.setPrev(temp);
			
		}
		
		size++;
	}
	
	
	public void insertAtPosition(int val,int pos) {
		if(pos==1) {
			insertFirst(val);}
		else if(pos==size+1) {
			insertLast(val);}
		else if(pos>1 && pos<=size) {
			Node t,n,v;
			t=new Node();
			t.setData(val);
			n=start;
			for(int i=1;i<pos;i++) {
				n=n.getNext();
			}
			v=n.getPrev();
			v.setNext(t);
			t.setPrev(v);
			n.setPrev(t);
			t.setNext(n);
			
			size++;
			
		}
		else
			System.out.println("Enter position is not valid");
		
		
		}
		
	public void deleteFirst() {
		if(start==null)
			System.out.println("List is empty");
		else {
			start=start.getNext();
			start.setPrev(null);
		}
		size--;	
	}
	public void deleteLast() {
		if(start==null)
		System.out.println("List is empty");
		else {
			Node t;
			t=start;
			for(int i=1;i<size-1;i++) {
				t=t.getNext();
			}
			t.setNext(null);
		}
		size--;
		
	}
	
	public void deleteAtPosition(int pos) {
		if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else if(pos>1 || pos<size) {
			Node d,v,k;
			d=start;
			for(int i=1;i<pos;i++)
			{
				d=d.getNext();
				
			}
			k=d.getNext();
			v=d.getPrev();
			v.setNext(d.getNext());
			k.setPrev(v);	
			size--;
		}
		
		
	}
	
	public void reverseList() {
		Node H;
		H=start;
		
		for(int i=1;i<size;i++) {
			H=H.getNext();
		}
		for(int j=size;j>0;j--) {
			System.out.print(" "+H.getData());
			H=H.getPrev();
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	



public class DoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyList D=new DoublyList();
		
		
		
		D.insertFirst(1);
		D.insertFirst(2);
		D.insertFirst(3);
		D.insertFirst(4);
			D.reverseList();
		
			System.out.println();
		D.viewList();
		

	}

}
