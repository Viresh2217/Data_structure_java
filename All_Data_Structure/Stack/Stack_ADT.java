package Stack;
class Stack{
	private int top;
	private int capacity;
	private int[] a;
	
	public Stack() {           //deafault Constructure
		a=new int[10];
		this.capacity=10;
		this.top=-1;
	}
	public Stack(int size) {     //paramerized constructure
		a=new int[size];
		this.capacity=size;
		this.top=-1;
		
	}
	public boolean push(int value) {
		if(top==capacity)
			System.out.println("Stack is overflow");
		a[++this.top]=value;
		return true;
	}
	public boolean pop() {
		if(top==-1)
			System.out.println("Stack is empty and underflow");
		else {
		a[top]=0;
		--top;
		}
		return true;
	}
	
	public int peek() {
		if(top==-1)
			System.out.println("Stack is empty");

		return a[top];
		
	}
	public void Display() {
		if(top==-1)
			System.out.println("No element in Stack");
		
		else {
			for(int h:a)
				System.out.print(" "+h);
		}
	}
	public void clear() {
		
		this.a=null;
		System.out.println("Sucessfully..Deleted all element in stack");
		return;
	}
	
}



public class Stack_ADT {

	public static void main(String[] args) {
		Stack S=new Stack();
		S.push(10);
		S.push(20);
		S.push(30);
		S.push(40);
		S.pop();
		S.pop();
		S.pop();
		S.pop();
		S.pop();
		S.push(40);
		S.Display();

		
	}

}
