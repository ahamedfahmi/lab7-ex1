package EX1;

public class BankDemo {

	public static void main(String[] args)throws InsufficientBalanceException {
		// TODO Auto-generated method stub

		
		
		Account account = new Account(123); 
		System.out.println("Depositing Rs.10,000"); 
		account.deposit(10000.00); 
		
		try { System.out.println("\nWithdrawing Rs.6,000/="); 
		account.withdraw(6000.00); 
		System.out.println("\nWithdrawing Rs.8,000/="); 
		account.withdraw(8000.00); 
		
		double am = account.getAmount();
 		String amount = Double.toString(am);
		
		throw new InsufficientBalanceException(amount);
		} 
		catch (InsufficientBalanceException e) { 
			System.out.println("Sorry, your account remains only Rs." + e.getMessage()); 
			e.printStackTrace(); 
		
	}

}
}
