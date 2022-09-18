package LinkedList_ADT;



class Node1{
	private int data;
	private Node1 next;
	
	public Node1() {
	    data=0;
	    next=null;
	}
	public Node1(int data,Node1 ptr) {
		this.data=data;
		this.next=ptr;
	}
	public boolean setData(int data) {
		this.data=data;
		return true;
	}
	public boolean setNext(Node1 ptr) {
		this.next=ptr;
		return true;
	}
	public int getData() {
		return(this.data);
	}
	public Node1 getNext() {
		return(this.next);
	}
	
}
class LinkList{
	private int size;
	private Node1 start;
	
	 public LinkList() {
		 size=0;
		 start=null;
	 }
	 public boolean isEmpty() {
		 if(start==null) {
			 System.out.println("List is empty");
		 return true;}
		
			return false;
	 }
	 public int getListSize() {
		 return(this.size);
	 }
	 public void viewList() {
		 Node1 temp;
		 if(start==null)
			 System.out.println("List is empty");
		 else {
			 temp=start;
			 for(int i=0;i<=size-1;i++){
				 System.out.print(" "+temp.getData());
				 temp=temp.getNext();
		            }
		       }
		 
	       }
	     public boolean insertFirst(int val) {
	    	 Node1 n;
	    	 n=new Node1();
	    	 n.setData(val);
	    	// if(start==null)
	    	//	 start=n;
	    	// else {
				n.setNext(start);
				start=n;
	    	 size++;
	    	 return true;
	     }
	     public boolean insertLast(int val){
	    	 Node1 n,temp;
	    	 n=new Node1();
	    	 n.setData(val);
	    	temp=start;
	    	 if(temp==null) {
	    		 start=n;
	    		 size++;
	    		 return true;
	    	 }
	    		
	    	 else {
                     while(temp.getNext()!=null) {
                    	temp=temp.getNext();}
                    	temp.setNext(n);
                     
                     size++;
			}
	    	 
	    	 
	    	 return true;
	     }
	     public boolean insertPosition(int val,int pos) {
	    	 if(pos==1)
	    		 insertFirst(val);
	    	 else if(pos==size+1)
	    		 insertLast(val);
	    	 else if(pos>1&&pos<=size){
	    		 Node1 n,t;
	    		 n=new Node1(val,null);
	    		 t=start;
	    		 for(int i=1;i<pos-1;i++) {
	    			 t=t.getNext();
	    		 }
	    		 n.setNext(t.getNext());
	    		 t.setNext(n);
	    		 size++;
	    	 }else {
				System.out.println("Insertion is not possible at position"+pos);
			}
	    	 
	    	 
	    	return true; 
	     }
	     
	     public void deleteFirst() {
	    	 if(start==null)
	    		 System.out.println("List is empty");
	    	 else {
	    		 start=start.getNext();
	    	 }
	    	 size--;
	     }
	   
	    	public void deleteLast() { 
	    		if(start==null)
	    			System.out.println("List is empty");
	    		else if(size==1) {
	    			start=null;
	    			size--;
	    		}
	    		else {
	    			Node1 s;
	    			s=start;
	    			for(int i=1;i<size-1;i++) {
	    				s=s.getNext();
	    			}
	    			s.setNext(null);
	    			size--;	
	    		    }	
	    	}
	    	
	    	public void deleteAtPosition(int pos) {
	    		if(start==null)
	    			System.out.println("List is empty");
	    		else if(pos==1)
	    			deleteFirst();
	    			else if(pos==size)
	    				deleteLast();
	    		else if(pos>size || pos<1) 
	    	          System.out.println("Invalid Position");
	    		else {
					Node1 b,r;
					b=start;
					for(int i=1;i<pos-1;i++) {
						b=b.getNext();
					}
					r=b.getNext();
					b.setNext(r.getNext());
					size--;
				}
	    		
	    	}
	    	
	    	
	    	public int Max() {
	    		int k,max;
	    		Node1 t;
	    		t=start;
	    		max=start.getData();
	    		for(int i=1;i<size;i++) {
	    			 
	    			t=t.getNext();
	    		if(max < t.getData())
	    			max=t.getData();	
	    		}
	    		
	    		return max;
	    	}
	    
	    	public void reverse() {
	    		
	    		Node1 t1,t2,k;
	    		t1=t2=null;
	    		k=start;
	    		
	    		while(k!=null) {
	    			
	    			t2=k.getNext();
                    k.setNext(t1);
                    t1=k;
	    			k=t2;
	    		}
	    		  Node1 R=t1;
	    		    while(R!=null) {
	    		    	System.out.print(" "+R.getData() );
	    		    	R=R.getNext();
	    		    	
	    		    }
	    	
	 	
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	
	     }
	 
	
public class Singly_LinkLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkList L=new LinkList();
      L.insertFirst(10);
     L.insertFirst(20);
     L.insertFirst(30);
     
   L.reverse();
    
    
    
    
     
     
      
		
		
	}

}
