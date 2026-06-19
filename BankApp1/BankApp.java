import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);
		
		System.out.println("Enter password");
		int pin = sc.nextInt();
		
		if(account.login(pin)) {
			System.out.println("Login Successful");
			
			int ch;

	        do {
	            System.out.println("\n1. Check Balance");
	            System.out.println("2. Deposit Amount");
	            System.out.println("3. Withdraw Amount");
	            System.out.println("4. Display Account Details");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            ch = sc.nextInt();

	            switch (ch) {

	                case 1:
	                    account.checkBalance();
	                    break;

	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    account.deposit(sc.nextDouble());
	                    break;

	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    account.withdraw(sc.nextDouble());
	                    break;

	                case 4:
	                    account.displayAccountDetails();
	                    break;

	                case 5:
	                    System.out.println("Thank you! Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (ch != 5);

		} else {
			System.out.println("Invalid PIN");
		}
		

	}

}
