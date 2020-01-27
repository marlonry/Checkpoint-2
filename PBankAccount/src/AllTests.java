import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTests {

	@Test // Test for the Deposit method
	void testDeposit() {
		BankAccount b1 = new BankAccount();
		b1.deposit(50);
		assertEquals(50, b1.getBalance(),0.01);// to compare doubles add the number of decimals you want to check like0.001
	}
	
	@Test // Test for the get Balance method
	void testGetBalance() {
		BankAccount b1 = new BankAccount();
		assertEquals(0, b1.getBalance(),0.01);
	}
	
	@Test // Test for the Withdraw method
	void testWithdraw() {
		BankAccount b1 = new BankAccount();
		b1.deposit(100);
		b1.withdraw(50);
		assertEquals(50, b1.getBalance(),0.01);
	}
	
	@Test // Test for the Withdraw with penalty
	void testWithdrawWithPenalty() {
		BankAccount b1 = new BankAccount();
		b1.deposit(100);
		b1.withdraw(150);
		assertEquals(100, b1.getBalance(),0.01); // you can't withdraw money if the amount is bigger than the current amount so the transaction doesn't go through.
	}
}
