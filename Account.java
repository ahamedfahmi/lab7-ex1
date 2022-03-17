package EX1;

public class Account {
	
	private int Account_no;
	private double balance;
	private double withdraw;
	
	public Account() {
		this.Account_no = 0;
		this.balance = 0;
	}
	
	public Account(int Account_no) {
		this.Account_no = Account_no;
	}
	
	public double deposit(double deposit) {
		return balance+=deposit;
	}
	
	public double withdraw(double withdraw) /*throws InsufficientBalanceException*/ {
		this.withdraw = withdraw;
		 if(withdraw <= balance)
			 balance-=withdraw;
//		 else
//			 try {
//					double am = balance;
//					String amount = Double.toString(am);
//				 
//				 throw new InsufficientBalanceException(amount);
//			 }catch(InsufficientBalanceException e){
//				 e.printStackTrace();
//			 }
		return withdraw;
	    
	}
	
	public double getAmount() {
		return balance;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	

	
	public void display() {
		System.out.println("Account No :- " + Account_no);
		System.out.println("Balance :- " + balance);
	}

}
