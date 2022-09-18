package TREE;

class Node{
	private int data;
	private Node left,right;
	
	public Node() {
		this.data=0;
		this.left=null;
		this.right=null;
	}
		
	public Node(int data, Node left, Node right) 
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public int  getData() {
		return(this.data);
	}
	public void setData(int val) {
		this.data=val;
	}
	public void setLeft(Node ptr) {
		this.left=ptr;
	}
	public void setRight(Node ptr) {
		this.right=ptr;
	}
	public Node getLeft() {
		return this.left;
	}
	public Node getRight() {
		return this.right;
	}
	
}

class B_Tree{
	Node start;
	
	
	public B_Tree() {
		this.start=null;
	}
	
	public Node Find(Node ptr ,int item)
	{
		if(ptr==null) {
		System.out.println("Empty");
		}
		else  if(ptr.getData()>item)
			return Find(ptr.getLeft(), item);
		
			else if(ptr.getData()<item) 
				return Find(ptr.getRight(), item);
			else {
				System.out.println("Not Found");
			}
			
		System.out.println("\nFound element  "+ptr.getData());
		return ptr;
			
	}
	
	public boolean insert(int val) {
		Node n,temp;
		n=new Node();
		n.setData(val);

		 
		if(start==null) {
			start=n;
			return true;
		   }
		else {
			temp=start;
			
			 while(temp!=null) {
				 if(temp.getData()>val) {
					 if(temp.getLeft()==null) {
						 temp.setLeft(n);
						 return true;
						 }
					temp=temp.getLeft();
				 }
				  if(temp.getData()<val)
				 {
					 if(temp.getRight()==null)
					     {
						 temp.setRight(n);
						  return true;
						 }
						 temp=temp.getRight(); 	 
				 } 
			 }  
		}
		return true;	
	}
	
	
	public void viewPreorder(Node ptr) {
		
		if(ptr!=null) {
			
			System.out.print(" "+ptr.getData());
			viewPreorder(ptr.getLeft());
			
			viewPreorder(ptr.getRight());
		}
		
		
	}
	/*
	public void deleteNode(Node ptr,int val) {
		
		if(ptr==null)
			System.out.println("Tree is empty");
		else if(ptr.getData()>val) {
			ptr.setLeft(deleteNode(ptr.getLeft(),int val));
			
			
			
		}
		*/
	public void postorder(Node ptr) {
		
		if(ptr!=null) {
			postorder(ptr.getLeft());
			postorder(ptr.getRight());
			System.out.print(" "+ptr.getData());
			
			
		}
	}
		public void inorder(Node ptr) {
			
			if(ptr!=null) {
				inorder(ptr.getLeft());
				System.out.print(" "+ptr.getData());
				inorder(ptr.getRight());
				
				
				
			}
		
	}
	
	}
	
	

public class Binary_TREE {

	public static void main(String[] args) {

     B_Tree B=new B_Tree();
   
   
     B.insert(60);
     B.insert(70);
     B.insert(40);
     B.insert(100);
     B.insert(35);
     B.insert(50);


    
    //B.postorder(B.start);
   
    //B.viewPreorder(B.start);
  B.inorder(B.start);
		
		
		

	}

}
