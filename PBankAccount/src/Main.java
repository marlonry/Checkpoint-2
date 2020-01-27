
public class Main {

	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount();
		
		myBankAccount.deposit(100);
		myBankAccount.withdraw(50);
		myBankAccount.getBalance();
	}
}
