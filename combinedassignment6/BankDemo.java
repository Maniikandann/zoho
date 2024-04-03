package combinedassignment6;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
		}
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}
}

public class BankDemo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);

		try {
			account.deposit(500);
			account.withdraw(200);
			account.withdraw(200);
			account.withdraw(1500); // throw InsufficientBalanceException
		} catch (InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
