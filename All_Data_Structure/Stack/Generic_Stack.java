package Stack;

class G_Stack{
	private int top;
	private int capacity;
	private Object[] a;
	
	public G_Stack(){
		this.top=-1;
		this.capacity=10;
		a=new Object[10];
	}
	public G_Stack(int capacity) {
		this.top=-1;
		this.capacity=capacity;
		a=new Object[capacity];
		
	}
	
	public void Dispaly() {
		if(top==-1)
			System.out.println("No element in Stack");
		
		else {
                for(int i=0;i<top+1;i++) {
                	System.out.print(" "+a[i]);
                }
		}
	}
	
	
	public boolean Push(Object val) {
		if(top==capacity)
			System.out.println("Stack is overflow");
		a[++top]=val;
		
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
	
	public Object peek() {
		if(top==-1)
			System.out.println("Stack is empty");

		return a[top];
		
	}
	
	
	
	
	
	
	
	
	
	
	
}



public class Generic_Stack {

	public static void main(String[] args) {
             G_Stack F=new G_Stack();
           
             F.Push(123);
             F.Push("Viresh");
             F.Push("Rahul");
             F.Push(345);
             F.Push(234);
             F.pop();
           System.out.println(F.peek());
            
            
             F.Dispaly();
        

	}

}
