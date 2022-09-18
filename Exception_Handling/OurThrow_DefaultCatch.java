package Exception_Handling;
//USING  THROW KEYWORD

import oOP.Myconsole;

class Account{
	private double balance=400;
	public void SetBalance(int balance) {
		this.balance=balance;
	}
	public void withDraw(double value) {
		this.balance-=value;
	}
		public double getBalance() {
			return this.balance;

		}
		public void showBalance() {

        System.out.println("Available balance :"+this.balance);

		}
	}


public class OurThrow_DefaultCatch {

	public static void main(String[] args) {
		Account A=new Account();
		double value =Myconsole.getNumber("Enter a withdraw amount");
		
		if(A.getBalance() < value)
		{
             throw new ArithmeticException("Insufficient balance");  //throw exception with massage
		}
		else {
			A.withDraw(value);
			System.out.println("Sucessfully Withdraw....");
			A.showBalance();
		}

	}

}
//After throw statement we can't take any statement directly otherwise we will get
//compile time error saying unreachable statement.
