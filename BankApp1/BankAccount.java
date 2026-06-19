
public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean login(int enteredPin) {
		return this.getPin() == enteredPin;
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: " + getBalance());
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
		  this.setBalance(getBalance() + amount);
		  System.out.println("Amount Deposited Successfully");
		  System.out.println("Updated Balance: " + getBalance());
		} else {
			 System.out.println("Invalid Deposit Amount");	
		}
	}
	
	public void withdraw(double amount) {
		double balance = this.getBalance();
		if(amount > 0 && amount <= balance) {
			  this.setBalance(getBalance() - amount);
			  System.out.println("Amount Withdrawn Successfully");
			  System.out.println("Updated Balance: " + this.getBalance());
		} else if(amount > balance){
			 System.out.println("Insufficient funds!");	
		}else {
			 System.out.println("Invalid Withdrawal Amount");	
		}
	
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: " + this.getAccountNumber());
		System.out.println("Account Holder Name: " + this.getAccountHolderName());
	}
	
}
