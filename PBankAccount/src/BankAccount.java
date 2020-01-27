public class BankAccount {
	private int balance;

	/**
	 * Back Account Constructor
	 */
	public BankAccount() {
		balance = 0;
	}

	/**
	 * @return this.balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * calculates tax depending on the salary amount
	 * @param amount
	 */
	void deposit(double amount) {
		//		this.balance = this.balance + amount;
		balance += amount;
	}

	void withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("Insuficient Balance");
		} else {
			//			this.balance = this.balance - amount;
			balance -= amount;
			System.out.println("You have withdraw: " + amount + " and your current balance is: " + this.balance);
		}
	}
}
