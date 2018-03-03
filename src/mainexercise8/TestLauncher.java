package mainexercise8;

import java.util.ArrayList;

public class TestLauncher {

	public static void main(String[] args) {
		Account newAccount = new Account("George", 1122, 1000);
		newAccount.setAnnualInterestRate(1.65);
		newAccount.deposit(30);
		newAccount.withdraw(5);
		newAccount.deposit(40);
		newAccount.withdraw(4);
		newAccount.deposit(50);
		newAccount.withdraw(2);

		// Summary
		System.out.println("-----Summary-----");
		System.out.println();
		System.out.printf("Name: %s\n", newAccount.getName());
		System.out.printf("Interest rate: %.2f\n", newAccount.getAnnualInterestRate());
		System.out.printf("Balance: %.2f\n", newAccount.getBalance());
		System.out.println();
		ArrayList<Transaction> transactions = newAccount.getTransactions();
		for (int i = 0; i < transactions.size(); i++) {
			System.out.println(transactions.get(i).getDate());
			System.out.printf("%s - %.2f\n", transactions.get(i).getDescription(), transactions.get(i).getAmount());
			System.out.printf("Balance: %.2f\n\n", transactions.get(i).getBalance());
		}

	}

}
